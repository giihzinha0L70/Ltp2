/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_SetorLoja;

/**
 *
 * @author 363707
 */
public class Loja {
    private int numero;
    private String descricao;
    private Atendente atendente;
    

   

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Loja(int numero, String descricao){
        this.numero=numero;
        this.descricao=descricao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public void setAtendente(Atendente atendente) {
        this.atendente = atendente;
    }
}
