package dev.friday.bitwayagenda.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import dev.friday.bitwayagenda.entity.Colaborador;
import dev.friday.bitwayagenda.entity.dto.ColaboradorDTO;
import dev.friday.bitwayagenda.service.Service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;


public class ColaboradorService implements Service {


    @Override
    @Transactional
    public ResponseEntity<?> insertColaborador(ColaboradorDTO colaboradorDTO){
        SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();

        Colaborador colaborador = new Colaborador();
        colaborador.setNomeSlack(colaboradorDTO.getNomeSlack());
        colaborador.setAgenda(colaboradorDTO.getAgenda());
        colaborador.setNome(colaboradorDTO.getNome());

        session.save(colaborador);
        txn.commit();
        return ResponseEntity.ok("Inserted");
    }

}
