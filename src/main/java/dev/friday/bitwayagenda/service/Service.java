package dev.friday.bitwayagenda.service;

import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import dev.friday.bitwayagenda.repository.Repository;
import org.springframework.http.ResponseEntity;

public interface Service {

    ResponseEntity<?> insertColaborador(ColaboradorDTO colaboradorDTO);
}
