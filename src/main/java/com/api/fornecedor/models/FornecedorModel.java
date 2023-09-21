package com.api.fornecedor.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.UUID;


@Entity
@Table(name = "Fornecedor")
public class FornecedorModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String nomeResponsavel;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String cnpj;

    @Column(nullable = false,unique = true)
    private String razaoSocial;

    @Column(nullable = false, columnDefinition = "int default 1")
    private int status;


    public FornecedorModel(UUID id, String nomeResponsavel, String email, String cnpj, String razaoSocial, int status) {
        this.id = id;
        this.nomeResponsavel = nomeResponsavel;
        this.email = email;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.status = status;
    }

    public FornecedorModel() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

