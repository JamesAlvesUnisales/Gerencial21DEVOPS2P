/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unisales.controlechamados.controllers;
import  com.unisales.controlechamados.models.Chamado;
/**
 *
 * @author James
 */
public class ChamadosController {
    
    private Chamado[] vChamados = new Chamado[10];
    private int pos = 0;
    
    public Chamado create(Chamado c){
        this.vChamados[this.pos] = c;
        this.pos++;
        
        return c;
    }
    
    public Chamado read(int pos){
        return this.vChamados[pos] ;
    }
}
