package com.sistema.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.sistema.app.models.Agendamento;

public interface AgendamentoRepository extends CrudRepository<Agendamento, String> {
    Agendamento findByIdAgendamento(long idAgendamento);
    Agendamento deleteByIdAgendamento(long idAgendamento);
}
