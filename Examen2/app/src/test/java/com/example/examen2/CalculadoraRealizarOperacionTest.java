package com.example.examen2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraRealizarOperacionTest {

    @Test
    // Verifica suma correcta entre dos enteros.
    public void realizarOperacion_suma_retornaResultadoCorrecto() {
        int resultado = Calculadora.realizarOperacion(5, 10, "+");
        assertEquals(15, resultado);
    }

    @Test(expected = ArithmeticException.class)
    // Verifica que dividir entre cero lanza excepción.
    public void realizarOperacion_divisionPorCero_lanzaExcepcion() {
        Calculadora.realizarOperacion(10, 0, "/");
    }
}
