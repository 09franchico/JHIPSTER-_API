package com.deshboard.br.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.deshboard.br.domain.Pessoa} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class PessoaDTO implements Serializable {

    private Long id;

    private String nome;

    private String sobrenome;

    private String email;

    private String rua;

    private Integer numero;

    private String bairro;

    private String complemento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PessoaDTO)) {
            return false;
        }

        PessoaDTO pessoaDTO = (PessoaDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, pessoaDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PessoaDTO{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", sobrenome='" + getSobrenome() + "'" +
            ", email='" + getEmail() + "'" +
            ", rua='" + getRua() + "'" +
            ", numero=" + getNumero() +
            ", bairro='" + getBairro() + "'" +
            ", complemento='" + getComplemento() + "'" +
            "}";
    }
}
