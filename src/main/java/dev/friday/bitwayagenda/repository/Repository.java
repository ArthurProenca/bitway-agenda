package dev.friday.bitwayagenda.repository;

import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import org.springframework.http.ResponseEntity;

public interface Repository{
    ResponseEntity<?> insertColaborador(ColaboradorDTO colaboradorDTO);
}
