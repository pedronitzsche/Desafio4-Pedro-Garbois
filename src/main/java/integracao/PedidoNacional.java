package integracao;

public class PedidoNacional extends Pedido {

    public PedidoNacional(double peso, String tipoFrete) {
        super(peso, tipoFrete);
    }

    @Override
    public String preparar() {
        return "Preparacao para entrega nacional";
    }
}