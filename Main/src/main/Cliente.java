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
public class Cliente extends Pessoa {
    private boolean fidelidade;
    private Carrinho carrinho;

    public Cliente(boolean fidelidade, Carrinho carrinho, String nome, Calendar idade) {
        super(nome, idade);
        this.fidelidade = fidelidade;
        this.carrinho = carrinho;
    }

    public boolean isFidelidade() {
        return fidelidade;
    }

    public void setFidelidade(boolean fidelidade) {
        this.fidelidade = fidelidade;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
    
    
}
