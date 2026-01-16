package com.andrei.treinamento.cofreforte.infrastructure.mapper;


import com.andrei.treinamento.cofreforte.domain.models.Dinheiro;
import com.andrei.treinamento.cofreforte.domain.models.Lancamento;
import com.andrei.treinamento.cofreforte.infrastructure.persistence.entity.LancamentoEntity;

public final class LancamentoMapper {

    private LancamentoMapper() {}

    public static LancamentoEntity toEntity(Lancamento domain) {
        LancamentoEntity entity = new LancamentoEntity();

        entity.setId(domain.getId());
        entity.setDescricao(domain.getDescricao());
        entity.setValor(domain.getValor().valor());
        entity.setTipo(domain.getTipo());
        entity.setCategoria(domain.getCategoria());
        entity.setDataLancamento(domain.getDataLancamento());
        entity.setStatus(domain.getStatus());
        entity.setCaixinhaOrigemId(domain.getCaixinhaOrigemId());
        entity.setCaixinhaDestinoId(domain.getCaixinhaDestinoId());
        entity.setCriadoEm(domain.getCriadoEm());

        return entity;
    }

    public static Lancamento toDomain(LancamentoEntity entity) {
        return Lancamento.reconstruir(
                entity.getId(),
                entity.getDescricao(),
                new Dinheiro(entity.getValor()),
                entity.getTipo(),
                entity.getCategoria(),
                entity.getDataLancamento(),
                entity.getStatus(),
                entity.getCaixinhaOrigemId(),
                entity.getCaixinhaDestinoId(),
                entity.getCriadoEm()
        );
    }
}