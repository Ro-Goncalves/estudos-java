package br.com.rogon.descontos;

import java.math.BigDecimal;

import br.com.rogon.orcamento.Orcamento;

public class CalculadoraDescontos {

    public BigDecimal calcular (Orcamento orcamento){    
        Desconto cadeiaDescontos = new DescontoQuantidadeItens(
            new DescontoValorOrcamento(
                new SemDesconto()
            )
        );
               
        return cadeiaDescontos.calcular(orcamento);
    }
}
