package integracao;

public class FreteNormal implements Frete {

    @Override
    public double calcular(double peso) {
        return peso * 5.0;
    }
}