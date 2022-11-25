/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unisales.controlechamados.models;

import java.util.Calendar;

/**
 *
 * @author James
 */
public class Chamado {
    
    private int nrChamado;
    private Calendar dtAbertura;
    private Calendar dtSolucao;
    private String status;
    
    private Tecnico responsavel;
    private Cliente cliente;

    public Chamado(Calendar dtAbertura, Cliente cliente) {
        this.dtAbertura = dtAbertura;
        this.dtSolucao = null;
        this.status = "Aberto";
        this.responsavel = null;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Calendar getDtAbertura() {
        return dtAbertura;
    }

    public Calendar getDtSolucao() {
        return dtSolucao;
    }

    public int getNrChamado() {
        return nrChamado;
    }

    public Tecnico getResponsavel() {
        return responsavel;
    }

    public String getStatus() {
        return status;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDtAbertura(Calendar dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public void setDtSolucao(Calendar dtSolucao) {
        this.dtSolucao = dtSolucao;
    }

    public void setNrChamado(int nrChamado) {
        this.nrChamado = nrChamado;
    }

    public void setResponsavel(Tecnico responsavel) {
        this.responsavel = responsavel;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Chamado{" + "nrChamado=" + nrChamado  + ", status=" + status + ", responsavel=" + responsavel + ", cliente=" + cliente + '}';
    }
}
