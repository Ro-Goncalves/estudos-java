package br.com.rogon.pedido.acao;

import br.com.rogon.pedido.Pedido;

public class EnviarEmailPedido implements AcoeAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido){
        System.out.println("Enviar e-mail com dados do novo pedido." + pedido.toString());
    }
}
