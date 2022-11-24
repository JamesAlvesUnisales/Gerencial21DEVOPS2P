package com.unisales.controlechamados.models;

  /* author Caio
*/
public class Cliente extends PessoaAbstract{
    
    private String email;
    private String telefone;
    
    public Cliente(String nome, String cargo, String email, String telefone){
        this.setNome(nome);
        this.setCargo(cargo);

        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "email=" + email + ", telefone=" + telefone + '}';
    }
}