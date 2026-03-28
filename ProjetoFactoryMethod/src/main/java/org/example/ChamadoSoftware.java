package org.example;

public class ChamadoSoftware implements IChamado{

    @Override
    public String abrir() {
        return "Chamado de Software aberto";
    }

    @Override
    public String fechar() {
        return "Chamado de Software fechado";
    }
}
