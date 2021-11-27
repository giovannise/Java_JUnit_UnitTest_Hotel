package com.marcelodebittencourt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.InputAnalysisProcess;

public class ClientTest {

    @Test
    @DisplayName("Create a new client")
    void testCreateNewClient() {
        //entrada de dados - massa
        //execução
        Client client = new Client(1, "Fulano");
        //validação
        assertEquals(1, client.getId());
        assertEquals("Fulano", client.getName());
    }

}
