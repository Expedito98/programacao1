/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texte1.folder;

import com.mycompany.esrudante.estudante;

/**
 *
 * @author aluno
 */
public class teste1 {

    public static void main(String[] args) {
        estudante eduardo = new estudante();
        estudante gabriel = new estudante();
        estudante pedrinho = new estudante();

        eduardo.setNome("Eduardo");
        gabriel.setNome("Gabriel");
        pedrinho.setNome("Pedro");

        System.out.println(eduardo.getNome());
        System.out.println(gabriel.getNome());
        System.out.println(pedrinho.getNome());
    }
}
