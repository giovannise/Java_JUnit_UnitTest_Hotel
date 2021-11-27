package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoomTest {
    @Test
    //testeNovoQuarto
    void testNewRoom(){
        //E - entrada de dados - massa
        int numeroDoQuarto = 200;
        String nomeDoQuarto = "Suíte Luxo";
        double valorDiaria = 500;

        //T - Teste - execução do teste
        Room quartoLuxo = new Room(numeroDoQuarto, nomeDoQuarto, valorDiaria);

        //R - Resultado - validação de resultados
        assertEquals(numeroDoQuarto, quartoLuxo.getId());
        assertEquals(nomeDoQuarto, quartoLuxo.getName());
        assertEquals(valorDiaria, quartoLuxo.getPricePerDay());
    }

    // ITR      / ERT
    // Input    / Entrada
    // Test     / Teste
    // Result   / Resultado
}
