package com.andrei.treinamento.cofreforte.api.controller;

import com.andrei.treinamento.cofreforte.api.models.requests.CriarLancamentoRequest;
import com.andrei.treinamento.cofreforte.domain.usecases.CadastrarLancamentoUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

    private CadastrarLancamentoUseCase cadastrarLancamentoUseCase;

    public LancamentoController(CadastrarLancamentoUseCase cadastrarLancamentoUseCase) {
        this.cadastrarLancamentoUseCase = cadastrarLancamentoUseCase;
    }

    @PostMapping
    public ResponseEntity<?> cadastrar(@RequestBody CriarLancamentoRequest request) {

         cadastrarLancamentoUseCase.executar(request.toCommand());

        return ResponseEntity.created(
                URI.create("/lancamentos/" + "id")
        ).build();
    }
}
