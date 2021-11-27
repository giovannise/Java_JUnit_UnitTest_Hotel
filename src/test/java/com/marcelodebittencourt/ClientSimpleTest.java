package com.marcelodebittencourt;
public class ClientSimpleTest {
    public static void testClienteNoJunit_AddClient() {
        Client cliente1 = new Client(1, "Fulano");
        if ((cliente1.getId() == 2) && (cliente1.getName().equals("Fulano"))) {
            System.out.println("Teste passou!");
        } else {
            System.out.println("Teste falhou!");
        }
    }

    public static void main(String[] args) {
        testClienteNoJunit_AddClient();
    }
}

// aqui nós estamos fazendo manualmente sem a ferramenta do JUnit, oq torna o código mais trabalhoso e maior