package br.com.rogon;

import java.math.BigDecimal;

import br.com.rogon.descontos.CalculadoraDescontos;
import br.com.rogon.orcamento.Orcamento;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDescontos cDescontos = new CalculadoraDescontos();
        System.out.println(cDescontos.calcular(orcamento));
        System.out.println(cDescontos.calcular(orcamento2));
    }
}
