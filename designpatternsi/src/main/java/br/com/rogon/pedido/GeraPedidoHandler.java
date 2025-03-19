package br.com.rogon.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.rogon.orcamento.Orcamento;
import br.com.rogon.pedido.acao.AcoeAposGerarPedido;

public class GeraPedidoHandler {
    
    private List<AcoeAposGerarPedido> acoes;
    
    public GeraPedidoHandler(List<AcoeAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens()); 
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
        
    }
}
