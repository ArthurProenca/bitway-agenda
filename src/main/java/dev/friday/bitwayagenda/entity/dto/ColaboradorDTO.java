package dev.friday.bitwayagenda.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ColaboradorDTO implements Serializable {
   // private final int id;
    private final String nome;
    private final String nomeSlack;
    private final Integer agenda;
}
