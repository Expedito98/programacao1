/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esrudante;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author aluno
 */
public class Turma {
    
    
    private String nomedaturma;
    private int entradadeingre;
    
    
    
    private Estudante discente = new Estudante(); 
    private Disciplina disciplina = new Disciplina();
    private Professor professor = new Professor();
    
    private Set<Estudante>Estudantes = new HashSet<Estudante>();
    private Set<Disciplina>Disciplina = new HashSet<Disciplina>();
    private Set<Professor>Professor = new HashSet<Professor>();
    
    
}
