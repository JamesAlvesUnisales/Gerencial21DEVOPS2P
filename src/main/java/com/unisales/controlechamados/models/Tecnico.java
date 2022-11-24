/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unisales.controlechamados.models;

/**
 *
 * @author James
 */
public class Tecnico extends PessoaAbstract{

    private String nivel;

    public Tecnico(String nome, String cargo, String nivel) {
        this.setNome(nome);
        this.setCargo(cargo);
        
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    } 
}
