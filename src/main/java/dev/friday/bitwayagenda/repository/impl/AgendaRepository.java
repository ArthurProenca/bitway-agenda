package dev.friday.bitwayagenda.repository.impl;

import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import dev.friday.bitwayagenda.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.persistence.EntityManager;

public class AgendaRepository implements Repository {

    @Override
    public ResponseEntity<?> insertColaborador(ColaboradorDTO colaboradorDTO) {
        String query = "INSERT INTO Agenda (id, nome, horarios,) VALUES (?, ?, ?)";

        return null;
    }
}
