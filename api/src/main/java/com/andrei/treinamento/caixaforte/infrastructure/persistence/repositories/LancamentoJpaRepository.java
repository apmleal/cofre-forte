package com.andrei.treinamento.caixaforte.infrastructure.persistence.repositories;

import com.andrei.treinamento.caixaforte.infrastructure.persistence.entity.LancamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LancamentoJpaRepository extends JpaRepository<LancamentoEntity, UUID> {
}
