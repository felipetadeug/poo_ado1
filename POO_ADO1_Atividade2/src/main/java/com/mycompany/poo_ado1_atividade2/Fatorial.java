/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_ado1_atividade2;

/**
 *
 * @author Felipe Tadeu
 */
public class Fatorial extends SequenciaNumerica{ 
    private int fatorial;
   
    public Fatorial(){
        super(1);
        this.fatorial = 0;
    }
    public void proximoValor () {
        this.valorAtual = this.valorAtual * ++this.fatorial;  
    }
 }

