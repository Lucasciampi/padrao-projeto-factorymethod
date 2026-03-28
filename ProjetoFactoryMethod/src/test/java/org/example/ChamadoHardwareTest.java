package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoHardwareTest {

    @Test
    void deveAbrirChamadoHardware() {
        IChamado chamado = ChamadoFactory.getInstance().obterChamado("Hardware");
        assertEquals("Chamado de Hardware aberto", chamado.abrir());
    }

    @Test
    void deveFecharChamadoHardware() {
        IChamado chamado = ChamadoFactory.getInstance().obterChamado("Hardware");
        assertEquals("Chamado de Hardware fechado", chamado.fechar());
    }


}