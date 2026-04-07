/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esrudante;

/**
 *
 * @author reche
 */
public class CursoGraduacao extends Curso {

    private String tipo;
    private boolean tccObrigatorio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String _tipo) {
        tipo = _tipo;
    }

    public boolean getTccObrigatorio() {
        return tccObrigatorio;
    }

    public void setTccObrigatorio(boolean _tccObrigatorio) {
        tccObrigatorio = _tccObrigatorio;
    }

        public boolean validarTCC() {
        if (tccObrigatorio == true) {
            return true;
        } else {
            return false;
        }
    }
}
