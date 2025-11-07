package com.mauricio.turtles.entities;

public class Tartaruga {

    private String nome;
    private String cor;
    private String arma;

    //Construtor com argumentos
    public Tartaruga(String nome, String cor, String arma) {
        this.nome = nome;
        this.cor = cor;
        this.arma = arma;
    }

    // Metodo para exibir as informações
    public void exibirInfo() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Arma: " + this.arma);
        System.out.println("--------------------");
    }

    //Getter para o nome (bom para buscas)
    public String getNome() {
        return this.nome;
    }
}
