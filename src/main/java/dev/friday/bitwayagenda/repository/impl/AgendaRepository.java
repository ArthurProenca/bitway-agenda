package dev.friday.bitwayagenda.repository.impl;

import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import dev.friday.bitwayagenda.repository.Repository;
import org.springframework.http.ResponseEntity;

public class AgendaRepository implements Repository {
    @Override
    public ResponseEntity<?> insertColaborador(ColaboradorDTO colaboradorDTO) {
        String query = "INSERT INTO Agenda (id, nome, horarios,) VALUES (?, ?, ?)";

        return null;
    }
}
