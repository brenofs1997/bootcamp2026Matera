package com.matera.bootcamp2026seq.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Conta {
    private Long id;
    private String nome;
    private Integer numConta;
    private BigDecimal saldo;
    private LocalDate abertura;

    public Conta() {

    }

    public Conta(String nome, Integer numConta, BigDecimal saldo, LocalDate abertura) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        this.abertura = abertura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public LocalDate getAbertura() {
        return abertura;
    }

    public void setAbertura(LocalDate abertura) {
        this.abertura = abertura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
