package com.examen.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase ValidadorDeDatos.
 * (ME_4: Tipos de prueba - Unitarias)
 */
class ValidadorTest {

    // 1. Caso de prueba: cadena válida (debe retornar true)
    @Test
    void debeRetornarTrueParaCadenaValida() {
        // Arrange
        ValidadorDeDatos validador = new ValidadorDeDatos();
        String input = "Contenido valido";

        // Act
        boolean resultado = validador.esCadenaValida(input);

        // Assert
        assertTrue(resultado, "La cadena no debería ser marcada como inválida.");
    }

    // 2. Caso de prueba: cadena nula (debe retornar false)
    @Test
    void debeRetornarFalseParaCadenaNula() {
        // Arrange
        ValidadorDeDatos validador = new ValidadorDeDatos();
        String input = null;

        // Act
        boolean resultado = validador.esCadenaValida(input);

        // Assert
        assertFalse(resultado, "La cadena nula debería ser marcada como inválida.");
    }

    // 3. Caso de prueba: cadena vacía (debe retornar false)
    @Test
    void debeRetornarFalseParaCadenaVacia() {
        // Arrange
        ValidadorDeDatos validador = new ValidadorDeDatos();
        String input = "";

        // Act
        boolean resultado = validador.esCadenaValida(input);

        // Assert
        assertFalse(resultado, "La cadena vacía debería ser marcada como inválida.");
    }
}
