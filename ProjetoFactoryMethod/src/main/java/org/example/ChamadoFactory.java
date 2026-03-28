package org.example;

public class ChamadoFactory {

    private static ChamadoFactory instance;

    private ChamadoFactory(){}

    public static ChamadoFactory getInstance() {
        if (instance == null) {
            instance = new ChamadoFactory();
        }
        return instance;
    }

    public IChamado obterChamado(String chamado){

        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName("org.example.Chamado" + chamado);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de Chamado não encontrado.");
        }
        if (!(objeto instanceof IChamado)) {
            throw new IllegalArgumentException("Chamado inválido.");
        }
        return (IChamado) objeto;
    }

}
