package com.andrei.treinamento.caixaforte.infrastructure.persistence.repositories.impl;

import com.andrei.treinamento.caixaforte.domain.models.Lancamento;
import com.andrei.treinamento.caixaforte.domain.repositories.LancamentoRepository;
import com.andrei.treinamento.caixaforte.infrastructure.mapper.LancamentoMapper;
import com.andrei.treinamento.caixaforte.infrastructure.persistence.repositories.LancamentoJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class LancamentoRepositoryImpl implements LancamentoRepository {


    private final LancamentoJpaRepository lancamentoJpaRepository;

    public LancamentoRepositoryImpl(LancamentoJpaRepository lancamentoJpaRepository) {
        this.lancamentoJpaRepository = lancamentoJpaRepository;
    }

    @Override
    public void salvar(Lancamento lancamento) {
        lancamentoJpaRepository.save(LancamentoMapper.toEntity(lancamento));
    }
}
