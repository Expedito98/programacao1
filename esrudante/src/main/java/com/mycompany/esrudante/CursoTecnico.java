/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.esrudante;

/**
 *
 * @author reche
 */
public class CursoTecnico extends Curso {

    private String eixoTecnologico;
    private int cargaEstagio;

    public String getEixoTecnologico() {
        return eixoTecnologico;
    }

    public void setEixoTecnologico(String _eixoTecnologico) {
        eixoTecnologico = _eixoTecnologico;
    }

    public int getCargaEstagio() {
        return cargaEstagio;
    }

    public void setCargaEstagio(int _cargaEstagio) {
        cargaEstagio = _cargaEstagio;
    }

        public boolean estagioObrigatorio() {
        if (cargaEstagio > 0) {
            return true;
        } else {
            return false;
        }
    }
}
