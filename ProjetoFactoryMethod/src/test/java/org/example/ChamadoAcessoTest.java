package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoAcessoTest {

    @Test
    void deveAbrirChamadoAcesso() {
        IChamado chamado = ChamadoFactory.getInstance().obterChamado("Acesso");
        assertEquals("Chamado de Acesso aberto", chamado.abrir());
    }

    @Test
    void deveFecharChamadoAcesso() {
        IChamado chamado = ChamadoFactory.getInstance().obterChamado("Acesso");
        assertEquals("Chamado de Acesso fechado", chamado.fechar());
    }
}