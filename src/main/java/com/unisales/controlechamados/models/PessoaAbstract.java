/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unisales.controlechamados.models;

/**
 *
 * @author James
 */
public abstract class PessoaAbstract {
    private String nome;
    private String cargo;
    
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "PessoaAbstract{" + "nome=" + nome + ", cargo=" + cargo + '}';
    }
    
    
}
