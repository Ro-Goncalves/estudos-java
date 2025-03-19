package br.com.rogon.descontos;

import java.math.BigDecimal;

import br.com.rogon.orcamento.Orcamento;

public class DescontoValorOrcamento extends Desconto{
    public DescontoValorOrcamento(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo (Orcamento orcamento){       
        return orcamento.getValor().multiply(new BigDecimal("0.05"));       
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
