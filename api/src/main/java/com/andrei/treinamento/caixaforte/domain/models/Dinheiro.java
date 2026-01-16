package com.andrei.treinamento.caixaforte.domain.models;

import java.math.BigDecimal;

public record Dinheiro(BigDecimal valor) {

    public Dinheiro {
        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Valor monetário inválido");
        }
    }

    public Dinheiro somar(Dinheiro outro) {
        return new Dinheiro(this.valor.add(outro.valor));
    }

    public Dinheiro subtrair(Dinheiro outro) {
        return new Dinheiro(this.valor.subtract(outro.valor));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dinheiro dinheiro)) return false;
        return valor.compareTo(dinheiro.valor) == 0;
    }

}