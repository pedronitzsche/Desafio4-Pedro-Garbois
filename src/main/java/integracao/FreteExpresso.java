package integracao;

public class FreteExpresso implements Frete {

    @Override
    public double calcular(double peso) {
        return peso * 10.0;
    }
}