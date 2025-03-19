package br.com.rogon.pedido.acao;

import br.com.rogon.pedido.Pedido;

public class GravarBancoPedido implements AcoeAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Salvar Pedido no Banco de Dados." + pedido.toString());
    }
}
