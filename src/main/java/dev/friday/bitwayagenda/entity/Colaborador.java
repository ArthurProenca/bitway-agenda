package dev.friday.bitwayagenda.entity;

import javax.persistence.*;

@Entity
@Table(name = "Colaborador", schema = "bitagenda")
public class Colaborador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "nome")
    private String nome;
    @Basic
    @Column(name = "nomeSlack")
    private String nomeSlack;
    @Basic
    @Column(name = "agenda")
    private Integer agenda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Colaborador that = (Colaborador) o;

        if (id != that.id) return false;
        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (nomeSlack != null ? !nomeSlack.equals(that.nomeSlack) : that.nomeSlack != null) return false;
        if (agenda != null ? !agenda.equals(that.agenda) : that.agenda != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (nomeSlack != null ? nomeSlack.hashCode() : 0);
        result = 31 * result + (agenda != null ? agenda.hashCode() : 0);
        return result;
    }
}
