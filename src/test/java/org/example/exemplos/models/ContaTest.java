package org.example.exemplos.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void testNomeConta() {
        Conta conta = new Conta("Bruno", new BigDecimal(10));
        String esperado = "Bruno";
        String real = conta.getPessoa();

        assertEquals(esperado, real);
    }
}