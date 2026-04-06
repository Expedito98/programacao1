/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade0604;

/**
 *
 * @author aluno
 */
public class No {

    private String nome;
    private int codigo;
    private No proximo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int _codigo) {
        this.codigo = _codigo;
    }
    
    public No getProximo() {
        return this.proximo;
    }

    public void setProximo(No _proximo) {
        this.proximo = _proximo;
    }
    
    
    public boolean equals(Object o) {
        No noaux =(No)o;
        if(this.codigo==noaux.getCodigo()){
            return true;
        }else{
            return false;
        }
       
        }
}
