package com.andrei.treinamento.caixaforte.domain.repositories;

import com.andrei.treinamento.caixaforte.domain.models.Lancamento;

public interface LancamentoRepository {
    void salvar (Lancamento lancamento);
}
