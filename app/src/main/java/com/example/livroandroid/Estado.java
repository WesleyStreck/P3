package com.example.livroandroid;

public class Estado {
    private String nome;
    private String sigla;

    public Estado (String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome(){return this.nome;}
    public String getSigla(){return this.sigla;}

    @Override
    public String toString(){return this.nome;}
}
