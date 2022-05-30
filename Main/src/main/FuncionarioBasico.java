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
public class FuncionarioBasico extends Pessoa {
    private int cadastro;
    private String funcao;

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public FuncionarioBasico(int cadastro, String funcao, String nome, Calendar idade) {
        super(nome, idade);
        this.cadastro = cadastro;
        this.funcao = funcao;
    }
}
