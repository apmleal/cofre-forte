package com.andrei.treinamento.cofreforte.api.models.requests;

import com.andrei.treinamento.cofreforte.application.models.commands.CriarLancamentoCommand;

public class CriarLancamentoRequest{
        public CriarLancamentoCommand toCommand()        {
            return new CriarLancamentoCommand(null ,null, null, null, null, null, null);
        }
}