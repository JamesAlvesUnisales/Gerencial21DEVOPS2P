/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.unisales.controlechamados;

import com.unisales.controlechamados.controllers.ChamadosController;
import com.unisales.controlechamados.models.*;
import java.util.Calendar;
/**
 *
 * @author James
 */
public class ControleChamados {

    public static void main(String[] args) {
        ///System.out.println("Hello World!");
        ChamadosController controle = new ChamadosController();
        
        Chamado c1 = new Chamado(Calendar.getInstance(), new Cliente("James","Professor", "james@teste" , "999999999"));
        
        Chamado c2 = new Chamado(Calendar.getInstance(), new Cliente("Caio","Aluno", "caio@teste" , "999999998"));
        
        controle.create(c1);
        
        controle.create(c2);
        
        Chamado cAux = controle.read(1);
        
        System.out.println(cAux);      
        
        // comentario em dev
    }
}
