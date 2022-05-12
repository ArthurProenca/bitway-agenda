package dev.friday.bitwayagenda.service;

import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import dev.friday.bitwayagenda.repository.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

public interface Service {

    @Transactional
    ResponseEntity<?> insertColaborador(ColaboradorDTO colaboradorDTO);
}
