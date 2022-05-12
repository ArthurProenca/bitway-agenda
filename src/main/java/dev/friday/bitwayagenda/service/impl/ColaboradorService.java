package dev.friday.bitwayagenda.service.impl;

import dev.friday.bitwayagenda.entity.Colaborador;
import dev.friday.bitwayagenda.entity.TEste;
import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import dev.friday.bitwayagenda.service.Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ColaboradorService implements Service {


    @Override
    @Transactional
    public ResponseEntity<?> insertColaborador(ColaboradorDTO colaboradorDTO){
        Colaborador colaborador = new Colaborador();
        BeanUtils.copyProperties(colaboradorDTO, colaborador);


        EntityManager entityManager = Persistence.createEntityManagerFactory("user-unit").createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

       // entityManager.createNativeQuery("insert into Colaborador (id, nome, nome_slack, agenda, nomeslack) values (10, )").executeUpdate();
        entityTransaction.commit();


        return ResponseEntity.ok("Inserted");
    }

}
