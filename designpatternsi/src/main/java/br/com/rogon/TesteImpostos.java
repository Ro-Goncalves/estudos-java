package br.com.rogon;

import java.math.BigDecimal;

import br.com.rogon.imposto.CalculadoraDeImpostos;
import br.com.rogon.imposto.ISS;
import br.com.rogon.orcamento.Orcamento;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 0);
        CalculadoraDeImpostos calc = new CalculadoraDeImpostos();

        System.out.println(calc.calcular(orcamento, new ISS()));
    }
    
}
