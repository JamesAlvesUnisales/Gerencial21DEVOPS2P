package com.unisales.controlechamados.models;

  /* author Caio
*/
public class Cliente extends PessoaAbstract{

    public Cliente(String nome, String email)
    this.setNome(nome);
    this.SetEmail(email)

    public String setNome(String nome){
        this.nome = nome;
    }
    public String setEmail(String email){
        this.email = email;
    }
}