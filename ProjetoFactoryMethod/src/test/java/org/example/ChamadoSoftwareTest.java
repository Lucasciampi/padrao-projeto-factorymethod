package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoSoftwareTest {

    @Test
    void deveAbrirChamadoSoftware() {
        IChamado chamado = ChamadoFactory.getInstance().obterChamado("Software");
        assertEquals("Chamado de Software aberto", chamado.abrir());
    }

    @Test
    void deveFecharChamadoSoftware() {
        IChamado chamado = ChamadoFactory.getInstance().obterChamado("Software");
        assertEquals("Chamado de Software fechado", chamado.fechar());
    }

}