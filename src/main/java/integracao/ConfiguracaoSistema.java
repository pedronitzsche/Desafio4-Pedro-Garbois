package integracao;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instance =
            new ConfiguracaoSistema();

    private String nomeLoja;

    private ConfiguracaoSistema() {
    }

    public static ConfiguracaoSistema getInstance() {
        return instance;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }
}