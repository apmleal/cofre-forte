package com.andrei.treinamento.caixaforte.api.models.requests;

import com.andrei.treinamento.caixaforte.application.models.commands.CriarLancamentoCommand;

public class CriarLancamentoRequest{
        public CriarLancamentoCommand toCommand()        {
            return new CriarLancamentoCommand(null ,null, null, null, null, null, null);
        }
}