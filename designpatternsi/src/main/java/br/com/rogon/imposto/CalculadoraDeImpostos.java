package br.com.rogon.imposto;

import java.math.BigDecimal;

import br.com.rogon.orcamento.Orcamento;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
