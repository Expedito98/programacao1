/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.esrudante;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Estudante {

    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String niveldeEnsino;
    private int telefone;
    private int ingresso;
    private int semestre;
    private String academica;
    private String digito;

    public Estudante() {
        nome = "cleiton";

    }

    public int obterIdade(Date hoje) {
        int idade = 0;
        //logica de calculo e idade
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public Date getData() {
        return dataNascimento;
    }

    public void setData(Date _data) {
        dataNascimento = _data;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String _cpf) {
        cpf = _cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char _genero) {
        genero = _genero;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setmtricula(String _matricula) {
        matricula = _matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;

    }

    public String getniveldeEnsino() {
        return niveldeEnsino;
    }

    public void setniveldeEnsino(String _niveldeEnsino) {
        niveldeEnsino = _niveldeEnsino;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int _telefone) {
        telefone = _telefone;
    }

    public int getIngresso() {
        return ingresso;
    }

    public void setIngresso(int _ingresso) {
        ingresso = _ingresso;
    }

    public int setSementre() {

        return semestre;

    }

    public void setSemestre(int _semestre) {
        semestre = _semestre;
    }

    public String getAcademico() {
        return academica;
    }

    public void setAcademica(String _academica) {
        academica = _academica;
    }

    public String getdigito() {
        return digito;
    }

    public void setdigito(String _digito) {
        digito = _digito;
    }
    
    
    public String getmatricula() {
        return matricula;
    }

    public void setmatricula(String _matricula) {
        String _digito = null;
        matricula = _digito;
    }
}
//digito
