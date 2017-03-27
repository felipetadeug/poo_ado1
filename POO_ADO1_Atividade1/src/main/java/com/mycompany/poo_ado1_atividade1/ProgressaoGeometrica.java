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
public class ProgressaoGeometrica {
    private int valorAtual;
    private int razao;

    public ProgressaoGeometrica (int valorInicial, int razao) {
        this.valorAtual = valorInicial;
        this.razao = razao;
    }

    public void proximoValor () {
        this.valorAtual = this.valorAtual * this.razao;
    }

    public int valorAtual () {
        return this.valorAtual;
    }
}

