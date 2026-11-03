package integracao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @BeforeEach
    void setUp() {
        ConfiguracaoSistema
                .getInstance()
                .setNomeLoja("Loja Exemplo");
    }

    @Test
    void deveProcessarPedidoNacionalComFreteNormal() {

        Pedido pedido =
                new PedidoNacional(
                        10.0,
                        "Normal"
                );

        assertEquals(
                "Loja Exemplo | Pedido validado | Preparacao para entrega nacional | Frete: 50.0 | Pedido finalizado",
                pedido.processar()
        );
    }

    @Test
    void deveProcessarPedidoNacionalComFreteExpresso() {

        Pedido pedido =
                new PedidoNacional(
                        10.0,
                        "Expresso"
                );

        assertEquals(
                "Loja Exemplo | Pedido validado | Preparacao para entrega nacional | Frete: 100.0 | Pedido finalizado",
                pedido.processar()
        );
    }

    @Test
    void deveProcessarPedidoInternacionalComFreteNormal() {

        Pedido pedido =
                new PedidoInternacional(
                        10.0,
                        "Normal"
                );

        assertEquals(
                "Loja Exemplo | Pedido validado | Preparacao para entrega internacional | Frete: 50.0 | Pedido finalizado",
                pedido.processar()
        );
    }

    @Test
    void deveProcessarPedidoInternacionalComFreteExpresso() {

        Pedido pedido =
                new PedidoInternacional(
                        10.0,
                        "Expresso"
                );

        assertEquals(
                "Loja Exemplo | Pedido validado | Preparacao para entrega internacional | Frete: 100.0 | Pedido finalizado",
                pedido.processar()
        );
    }

    @Test
    void deveRetornarExcecaoParaFreteInexistente() {

        try {

            new PedidoNacional(
                    10.0,
                    "Premium"
            );

            fail();

        } catch (IllegalArgumentException e) {

            assertEquals(
                    "Frete inexistente",
                    e.getMessage()
            );
        }
    }
}