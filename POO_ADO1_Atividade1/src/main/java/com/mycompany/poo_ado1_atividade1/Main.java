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
public class Main {
    public static void main(String[] args) {
        int quantidadeElementos = 5;
                
        System.out.println("Fatorial");
        
        Fatorial f = new Fatorial();
        
        for(int i=0; i<quantidadeElementos; i++){
            System.out.print(f.valorAtual() + " ");
            f.proximoValor();
        }
        
        
        
        System.out.println("\n");
       
        int valorInicial = 1;
        int razao = 2;
        
        System.out.println("Progressão Geometrica");
        
        ProgressaoGeometrica pg = new ProgressaoGeometrica(valorInicial, razao);
        
        for(int i=0; i<quantidadeElementos; i++){
            System.out.print(pg.valorAtual() + " ");
            pg.proximoValor();
        }
        
    }
}
