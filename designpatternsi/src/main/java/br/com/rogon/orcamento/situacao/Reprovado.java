package br.com.rogon.orcamento.situacao;

import br.com.rogon.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
