/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhogibi2;

/**
 *
 * @author felipe.amamaro
 */
public class gibi {
    int ano;
    String nome;
    String autor;
    String categoria;
    int id;

    public gibi(int ano, String nome, String autor, String categoria, int id) {
        this.ano = ano;
        this.nome = nome;
        this.autor = autor;
        this.categoria = categoria;
        this.id = id;
    }
    
    void imprimirGibi(){
        System.out.println("Ano de Publicacao:"+ano+"\tnome:"+nome+"\tautor:"+autor+"\tcategoria:"+categoria+"\t id do GIBI:"+id);
    }
    
}
