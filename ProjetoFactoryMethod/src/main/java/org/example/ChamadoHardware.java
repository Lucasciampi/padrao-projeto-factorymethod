package org.example;

public class ChamadoHardware implements IChamado{

    @Override
    public String abrir() {
        return "Chamado de Hardware aberto";
    }

    @Override
    public String fechar() {
        return "Chamado de Hardware fechado";
    }

}
