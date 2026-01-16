package com.andrei.treinamento.caixaforte.application.usecases.impl;

import com.andrei.treinamento.caixaforte.application.models.commands.CriarLancamentoCommand;
import com.andrei.treinamento.caixaforte.domain.models.Dinheiro;
import com.andrei.treinamento.caixaforte.domain.models.Lancamento;
import com.andrei.treinamento.caixaforte.domain.repositories.LancamentoRepository;
import com.andrei.treinamento.caixaforte.domain.usecases.CadastrarLancamentoUseCase;


public class CadastrarLancamentoUseCaseImpl implements CadastrarLancamentoUseCase {

    private LancamentoRepository lancamentoRepository;
    public CadastrarLancamentoUseCaseImpl(LancamentoRepository lancamentoRepository) {}

    @Override
    public void executar(CriarLancamentoCommand command) {

        Lancamento lancamento = Lancamento.credito(
                command.descricao(),
                new Dinheiro(command.valor()),
                command.categoria(),
                command.dataLancamento(),
                null
        );

        lancamentoRepository.salvar(lancamento);
    }
}
