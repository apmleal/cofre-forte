package com.andrei.treinamento.cofreforte.infrastructure.persistence.repositories.impl;

import com.andrei.treinamento.cofreforte.domain.models.Lancamento;
import com.andrei.treinamento.cofreforte.domain.repositories.LancamentoRepository;
import com.andrei.treinamento.cofreforte.infrastructure.mapper.LancamentoMapper;
import com.andrei.treinamento.cofreforte.infrastructure.persistence.repositories.LancamentoJpaRepository;
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
