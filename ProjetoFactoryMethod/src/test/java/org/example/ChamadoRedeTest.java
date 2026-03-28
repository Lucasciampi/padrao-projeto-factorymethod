package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoRedeTest {

    @Test
    void deveAbrirChamadoRede() {
        IChamado chamado = ChamadoFactory.getInstance().obterChamado("Rede");
        assertEquals("Chamado de Rede aberto", chamado.abrir());
    }

    @Test
    void deveFecharChamadoRede() {
        IChamado chamado = ChamadoFactory.getInstance().obterChamado("Rede");
        assertEquals("Chamado de Rede fechado", chamado.fechar());
    }

}