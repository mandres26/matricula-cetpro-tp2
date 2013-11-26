/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.dto;

import java.util.Date;

/**
 *
 * @author Juan Diego
 */
public class ResolucionDirectoralDTO {
    private Integer idRd;
    private Date anioInicio;
    private Date anioTermino;
    private Date fechaRegistro;

    public Date getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(Date anioInicio) {
        this.anioInicio = anioInicio;
    }

    public Date getAnioTermino() {
        return anioTermino;
    }

    public void setAnioTermino(Date anioTermino) {
        this.anioTermino = anioTermino;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getIdRd() {
        return idRd;
    }

    public void setIdRd(Integer idRd) {
        this.idRd = idRd;
    }
    
    
}
