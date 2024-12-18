package com.atividade.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name = "CarroTB")
public class Carro {

    @Id
    @Column(name = "id")
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name="carro_seq", sequenceName = "carroSeq", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo")
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "fk_marca_id", foreignKey = @ForeignKey(name = "fk_carro_marca"),
            referencedColumnName = "id")
    private Marca marca;

    @OneToMany(mappedBy = "carro")
    public List<Assessorio> assessorios = new ArrayList<>();

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

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
