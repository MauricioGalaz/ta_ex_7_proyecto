package com.examen.acceptance;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Prueba de Aceptación/Funcional simulada usando Selenium (ME_5).
 * En un entorno CI/CD, Selenium debe ejecutarse en modo Headless.
 */
class AceptacionTest {

    private static WebDriver driver;

    @BeforeAll
    static void setUp() {
        // Configurar opciones para ejecución Headless (sin GUI) en CI/CD
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Nota: En GitHub Actions, el WebDriver debe estar disponible en el PATH del sistema.
        driver = new ChromeDriver(options);
    }

    @Test
    void debeAbrirPaginaYVerificarTitulo() {
        // 1. Navegar a una URL pública de prueba
        driver.get("https://www.google.com");

        // 2. Ejecutar una aserción funcional
        String titulo = driver.getTitle();
        System.out.println("Título de la página: " + titulo);

        // Asume que el título contiene "Google"
        assertTrue(titulo.contains("Google"), "El título de la página debe contener 'Google'");
    }

    @AfterAll
    static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
