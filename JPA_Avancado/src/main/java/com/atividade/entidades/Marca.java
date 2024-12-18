package com.atividade.entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "MarcaTB")
public class Marca {

    @Id
    @Column(name = "id")
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator="marca_seq")
    @SequenceGenerator(name="marca_seq", sequenceName = "marcaSeq", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo")
    private String codigo;


    @OneToMany(mappedBy = "marca")
    List<Carro> Listacarros;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
