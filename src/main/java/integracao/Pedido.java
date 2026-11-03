package integracao;

public abstract class Pedido {

    private double peso;
    private Frete frete;

    public Pedido(double peso, String tipoFrete) {
        this.peso = peso;
        this.frete = FreteFactory.obterFrete(tipoFrete);
    }

    public final String processar() {

        String nomeLoja =
                ConfiguracaoSistema
                        .getInstance()
                        .getNomeLoja();

        return nomeLoja
                + " | "
                + validar()
                + " | "
                + preparar()
                + " | Frete: "
                + calcularFrete()
                + " | "
                + finalizar();
    }

    public String validar() {
        return "Pedido validado";
    }

    public abstract String preparar();

    public double calcularFrete() {
        return frete.calcular(peso);
    }

    public String finalizar() {
        return "Pedido finalizado";
    }
}