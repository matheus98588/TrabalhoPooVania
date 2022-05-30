/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author pcezar
 */
public class Mercado {
    private String endereco;
    private ArrayList<FuncionarioBasico>listaDeFuncionarios;
    private ArrayList<Corredor>listaDeCorredores;
    private Calendar data;

    public Mercado(String endereco/** ,ArrayList<FuncionarioBasico> listaDeFuncionarios*/, Calendar data) {
        this.endereco = endereco;
        /**this.listaDeFuncionarios = listaDeFuncionarios;*/
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<FuncionarioBasico> getListaDeFuncionarios() {
        return listaDeFuncionarios;
    }

    /**public void setListaDeFuncionarios(ArrayList<FuncionarioBasico> listaDeFuncionarios) {
        this.listaDeFuncionarios = listaDeFuncionarios;
    }
*/
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
}
