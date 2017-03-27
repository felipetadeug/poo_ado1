/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo_ado1_atividade1;

/**
 *
 * @author Felipe Tadeu
 */
public class Fatorial { 
    private int fatorial;
    private int valorAtual;
   
    public Fatorial () {
        this.fatorial = 0;
        this.valorAtual = 1;
    }
    public void proximoValor () {
        this.valorAtual = this.valorAtual * ++this.fatorial;  
    }
    public int valorAtual () {
        return this.valorAtual;
    }

}
