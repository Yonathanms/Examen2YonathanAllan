package com.example.examen2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraConvertirNumeroTest {

    @Test
    // Verifica conversión válida de binario a decimal.
    public void convertirNumero_binarioAdecimal_retornaValorEsperado() {
        int resultado = Calculadora.convertirNumero("1010", 0);
        assertEquals(10, resultado);
    }

    @Test
    // Verifica que un binario inválido devuelve -1.
    public void convertirNumero_binarioInvalido_retornaMenosUno() {
        int resultado = Calculadora.convertirNumero("102", 0);
        assertEquals(-1, resultado);
    }
}
