package com.andrei.treinamento.caixaforte.application.models.commands;

import com.andrei.treinamento.caixaforte.domain.models.CategoriaLancamento;
import com.andrei.treinamento.caixaforte.domain.models.TipoLancamento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record CriarLancamentoCommand(
        UUID caixinhaOrigemId,
        UUID caixinhaDestinoId,
        BigDecimal valor,
        String descricao,
        TipoLancamento tipo,
        CategoriaLancamento categoria,
        LocalDate dataLancamento
) {}
