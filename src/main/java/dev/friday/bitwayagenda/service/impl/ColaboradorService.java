package dev.friday.bitwayagenda.service.impl;

import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import dev.friday.bitwayagenda.repository.Repository;
import dev.friday.bitwayagenda.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.support.SharedEntityManagerBean;

import javax.persistence.EntityManager;

public class ColaboradorService implements Service {
    Repository repository;

    public ColaboradorService(Repository repository) {
        this.repository = repository;
    }
    @Override
    public ResponseEntity<?> insertColaborador(ColaboradorDTO colaboradorDTO){
        return ResponseEntity.ok("Inserted");
    }

}
