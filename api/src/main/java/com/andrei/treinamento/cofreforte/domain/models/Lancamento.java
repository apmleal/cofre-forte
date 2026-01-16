package com.andrei.treinamento.cofreforte.domain.models;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Lancamento {
    private final UUID id;
    private final String descricao;
    private final Dinheiro valor;
    private final TipoLancamento tipo;
    private final CategoriaLancamento categoria;
    private final LocalDate dataLancamento;

    private StatusLancamento status;
    private UUID caixinhaOrigemId;
    private UUID caixinhaDestinoId;
    private LocalDateTime criadoEm;

    private Lancamento(
            UUID id,
            String descricao,
            Dinheiro valor,
            TipoLancamento tipo,
            CategoriaLancamento categoria,
            LocalDate dataLancamento,
            UUID caixinhaOrigemId,
            UUID caixinhaDestinoId
    ) {
        validar(descricao, valor, tipo, dataLancamento);
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.categoria = categoria;
        this.dataLancamento = dataLancamento;
        this.caixinhaOrigemId = caixinhaOrigemId;
        this.caixinhaDestinoId = caixinhaDestinoId;
        this.status = StatusLancamento.PENDENTE;
        this.criadoEm = LocalDateTime.now();
    }

    public static Lancamento credito(
            String descricao,
            Dinheiro valor,
            CategoriaLancamento categoria,
            LocalDate dataLancamento,
            UUID caixinhaDestinoId
    ) {
        return new Lancamento(
                UUID.randomUUID(),
                descricao,
                valor,
                TipoLancamento.CREDITO,
                categoria,
                dataLancamento,
                null,
                caixinhaDestinoId
        );
    }

    public static Lancamento debito(
            String descricao,
            Dinheiro valor,
            CategoriaLancamento categoria,
            LocalDate dataLancamento,
            UUID caixinhaOrigemId
    ) {
        return new Lancamento(
                UUID.randomUUID(),
                descricao,
                valor,
                TipoLancamento.DEBITO,
                categoria,
                dataLancamento,
                caixinhaOrigemId,
                null
        );
    }

    private void validar(String descricao, Dinheiro valor, TipoLancamento tipo, LocalDate dataLancamento) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("Descrição obrigatória");
        }
        if (valor == null) {
            throw new IllegalArgumentException("Valor obrigatório");
        }
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de lançamento obrigatório");
        }
        if (dataLancamento == null) {
            throw new IllegalArgumentException("Data obrigatória");
        }
    }

    public static Lancamento reconstruir(
            UUID id,
            String descricao,
            Dinheiro valor,
            TipoLancamento tipo,
            CategoriaLancamento categoria,
            LocalDate dataLancamento,
            StatusLancamento status,
            UUID caixinhaOrigemId,
            UUID caixinhaDestinoId,
            LocalDateTime criadoEm
    ) {
        Lancamento lancamento = new Lancamento(
                id,
                descricao,
                valor,
                tipo,
                categoria,
                dataLancamento,
                caixinhaOrigemId,
                caixinhaDestinoId
        );
        lancamento.status = status;
        lancamento.criadoEm = criadoEm;
        return lancamento;
    }
}
