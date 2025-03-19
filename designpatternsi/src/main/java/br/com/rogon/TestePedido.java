package br.com.rogon;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.rogon.pedido.GeraPedido;
import br.com.rogon.pedido.GeraPedidoHandler;
import br.com.rogon.pedido.acao.EnviarEmailPedido;
import br.com.rogon.pedido.acao.GravarBancoPedido;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("600.00");
        Integer quantidadeItens = 4;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
            Arrays.asList(
                new GravarBancoPedido(),
                new EnviarEmailPedido()
        ));
        handler.execute(gerador);   
    }
}
