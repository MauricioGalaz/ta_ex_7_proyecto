package com.examen.util;


/**
 * Clase que contiene lógica de negocio simple para validar datos.
 */
public class ValidadorDeDatos {

    /**
     * Verifica si una cadena de texto es nula, vacía o solo contiene espacios.
     * @param valor La cadena de texto a evaluar.
     * @return true si la cadena es válida (no nula y no vacía), false en caso contrario.
     */
    public boolean esCadenaValida(String valor) {
        if (valor == null || valor.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}
