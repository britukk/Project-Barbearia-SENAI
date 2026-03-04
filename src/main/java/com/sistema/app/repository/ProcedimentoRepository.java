package com.sistema.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistema.app.models.Procedimento;

public interface ProcedimentoRepository extends CrudRepository<Procedimento, String> {
    Procedimento findByIdProcedimento(long idProcedimento);
    Procedimento deleteByIdProcedimento(long idProcedimento);
}
