package com.andrei.treinamento.caixaforte.domain.usecases;

import com.andrei.treinamento.caixaforte.application.models.commands.CriarLancamentoCommand;
import org.springframework.stereotype.Service;

@Service
public interface CadastrarLancamentoUseCase {
    void executar(CriarLancamentoCommand command);

}
