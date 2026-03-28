package org.example;

public class ChamadoAcesso implements IChamado{

    @Override
    public String abrir() {
        return "Chamado de Acesso aberto";
    }

    @Override
    public String fechar() {
        return "Chamado de Acesso fechado";
    }
}
