package integracao;

public class PedidoInternacional extends Pedido {

    public PedidoInternacional(
            double peso,
            String tipoFrete
    ) {
        super(peso, tipoFrete);
    }

    @Override
    public String preparar() {
        return "Preparacao para entrega internacional";
    }
}