package com.example.examen2;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CalculadoraEncuentraTest {

    @Test
    public void encuentra_elementoEnLista_retornaVerdadero() {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(Calculadora.Encuentra(lista, 3));
        assertFalse(Calculadora.Encuentra(lista, 9));
    }
}
