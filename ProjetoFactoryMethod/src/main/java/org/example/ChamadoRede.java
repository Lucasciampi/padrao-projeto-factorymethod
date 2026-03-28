package org.example;

public class ChamadoRede implements IChamado{

    @Override
    public String abrir() {
        return "Chamado de Rede aberto";
    }

    @Override
    public String fechar() {
        return "Chamado de Rede fechado";
    }
}
