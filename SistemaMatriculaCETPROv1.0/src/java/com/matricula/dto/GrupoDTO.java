/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.dto;

import java.util.Date;

/**
 *
 * @author PEDRO
 */
public class GrupoDTO {
    
    private int idGrupo;
    private Date fecInicio;
    private Date fecTermino;
    private String numMatriculados;
    private int cantMaximaAlumno;

    public GrupoDTO(int idGrupo, Date fecInicio, Date fecTermino, String numMatriculados, int cantMaximaAlumno) {
        this.idGrupo = idGrupo;
        this.fecInicio = fecInicio;
        this.fecTermino = fecTermino;
        this.numMatriculados = numMatriculados;
        this.cantMaximaAlumno = cantMaximaAlumno;
    }

    public int getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(int idGrupo) {
        this.idGrupo = idGrupo;
    }

    public GrupoDTO(Date fecInicio, Date fecTermino, String numMatriculados) {
        this.fecInicio = fecInicio;
        this.fecTermino = fecTermino;
        this.numMatriculados = numMatriculados;
    }

    public GrupoDTO(Date fecInicio, Date fecTermino, int cantMaximaAlumno) {
        this.fecInicio = fecInicio;
        this.fecTermino = fecTermino;
        this.cantMaximaAlumno = cantMaximaAlumno;
    }

    
    
    
    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecTermino() {
        return fecTermino;
    }

    public void setFecTermino(Date fecTermino) {
        this.fecTermino = fecTermino;
    }

    public String getNumMatriculados() {
        return numMatriculados;
    }

    public void setNumMatriculados(String numMatriculados) {
        this.numMatriculados = numMatriculados;
    }

    public Integer getCantMaximaAlumno() {
        return cantMaximaAlumno;
    }

    public void setCantMaximaAlumno(int cantMaximaAlumno) {
        this.cantMaximaAlumno = cantMaximaAlumno;
    }

    
}
