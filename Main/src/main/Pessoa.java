/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Calendar;

/**
 *
 * @author pcezar
 */
public class Pessoa {
    protected String nome;
    protected Calendar idade;

    public Pessoa(String nome, Calendar idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getIdade() {
        return idade;
    }

    public void setIdade(Calendar idade) {
        this.idade = idade;
    }
    
}
