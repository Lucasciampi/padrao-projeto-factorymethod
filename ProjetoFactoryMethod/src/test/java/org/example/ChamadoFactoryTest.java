package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoFactoryTest {

    @Test
    void deveRetornarExcecaoParaChamadoInexistente() {
        try {
            IChamado chamado = ChamadoFactory.getInstance().obterChamado("Impressora");
            fail("Deveria ter lançado uma exceção para chamado inexistente.");
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de Chamado não encontrado.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaChamadoInvalido() {
        try {
            IChamado chamado = ChamadoFactory.getInstance().obterChamado("Email");
            fail("Deveria ter lançado uma exceção para chamado inexistente.");
        } catch (IllegalArgumentException e) {
            assertEquals("Chamado inválido.", e.getMessage());
        }
    }

}