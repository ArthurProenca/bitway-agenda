package dev.friday.bitwayagenda.repository;

import dev.friday.bitwayagenda.entity.Agenda;
import dev.friday.bitwayagenda.entity.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Colaborador, Agenda> {

}
