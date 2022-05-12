package dev.friday.bitwayagenda.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Colaborador", schema = "bitagenda")
@AllArgsConstructor
@NoArgsConstructor
public class Colaborador implements java.io.Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "nomeSlack")
    private String nomeSlack;
    @Basic
    @Column(name = "agenda")
    private Integer agenda;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSlack() {
        return nomeSlack;
    }

    public void setNomeSlack(String nomeSlack) {
        this.nomeSlack = nomeSlack;
    }

    public Integer getAgenda() {
        return agenda;
    }

    public void setAgenda(Integer agenda) {
        this.agenda = agenda;
    }

}
