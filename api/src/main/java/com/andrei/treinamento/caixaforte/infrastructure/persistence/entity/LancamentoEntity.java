package com.andrei.treinamento.caixaforte.infrastructure.persistence.entity;

import com.andrei.treinamento.caixaforte.domain.models.CategoriaLancamento;
import com.andrei.treinamento.caixaforte.domain.models.StatusLancamento;
import com.andrei.treinamento.caixaforte.domain.models.TipoLancamento;
import com.andrei.treinamento.caixaforte.infrastructure.core.persistence.EntityBase;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_lancamentos")
@Data
public class LancamentoEntity extends EntityBase {

        @Id
        @Column(name = "id")
        private UUID id;

        @Column(nullable = false)
        private String descricao;

        @Column(nullable = false, precision = 19, scale = 2)
        private BigDecimal valor;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private TipoLancamento tipo;

        @Enumerated(EnumType.STRING)
        private CategoriaLancamento categoria;

        @Column(name = "data_lancamento", nullable = false)
        private LocalDate dataLancamento;

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        private StatusLancamento status;

        @Column(name = "caixinha_origem_id")
        private UUID caixinhaOrigemId;

        @Column(name = "caixinha_destino_id")
        private UUID caixinhaDestinoId;

        @Column(name = "criado_em", nullable = false)
        private LocalDateTime criadoEm;
}
