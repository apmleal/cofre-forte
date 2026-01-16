package com.andrei.treinamento.cofreforte.domain.usecases;

import com.andrei.treinamento.cofreforte.application.models.commands.CriarLancamentoCommand;
import com.andrei.treinamento.cofreforte.domain.models.Lancamento;
import org.springframework.stereotype.Service;

@Service
public interface CadastrarLancamentoUseCase {
    void executar(CriarLancamentoCommand command);

}
