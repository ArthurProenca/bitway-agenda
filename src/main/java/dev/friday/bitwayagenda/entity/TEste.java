package dev.friday.bitwayagenda.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "teste")
@Data
public class TEste {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nome", nullable = false)
    private String nome;

    public TEste(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public TEste() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
