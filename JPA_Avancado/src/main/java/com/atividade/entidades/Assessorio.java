package com.atividade.entidades;

import jakarta.persistence.*;


@Entity
@Table(name = "assessorioTB")
public class Assessorio {

    @Id
    @Column(name = "id")
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator="ass_seq")
    @SequenceGenerator(name="ass_seq", sequenceName = "assSeq", initialValue = 1, allocationSize = 1)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo")
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "fk_ass_id", foreignKey = @ForeignKey(name = "fk_ass_carro"),
            referencedColumnName = "id")
    private Carro carro;


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

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
