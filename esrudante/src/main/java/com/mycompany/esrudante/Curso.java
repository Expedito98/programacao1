/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esrudante;

/**
 *
 * @author reche
 */
public abstract class Curso {

    private int codigo;
    private String tipDracao;
    private String nome;
    private int duracao;
    private int cargaHorari;
    private String modalidade;
    private boolean status;
    private List<Disciplinaa> disciplina = new ArrayList<Diciplinaa>();

    public void obterDisciplinas() {
        System.out.println("Mostrando disciplinas");
    }

    public void obterAlunosAtivos() {
        System.out.println("Alunos ativos");
    }

    public void obterAlunosEgressos() {
        System.out.println("Alunos formados");

    }

    public abstract void realiaMatricula();
}   
