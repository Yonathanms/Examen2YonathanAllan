package com.example.examen2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraConvertirADestinoTest {

    @Test
    // Verifica conversión de decimal a binario.
    public void convertirADestino_decimalABinario_retornaCadenaEsperada() {
        String resultado = Calculadora.convertirADestino(10, 0);
        assertEquals("1010", resultado);
    }

    @Test
    // Verifica conversión de decimal a hexadecimal.
    public void convertirADestino_decimalAHex_retornaCadenaEsperada() {
        String resultado = Calculadora.convertirADestino(255, 3);
        assertEquals("ff", resultado);
    }
}
