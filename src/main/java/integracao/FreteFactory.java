package integracao;

public class FreteFactory {

    public static Frete obterFrete(String frete) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(
                    "integracao.Frete" + frete
            );

            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException(
                    "Frete inexistente"
            );
        }

        if (!(objeto instanceof Frete)) {
            throw new IllegalArgumentException(
                    "Frete invalido"
            );
        }

        return (Frete) objeto;
    }
}