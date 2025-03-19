package br.com.rogon.imposto;

import java.math.BigDecimal;

import br.com.rogon.orcamento.Orcamento;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento);
}
