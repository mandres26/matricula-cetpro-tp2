/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.matricula.dao;

import com.matricula.model.Alumno;

/**
 *
 * @author FELIPE
 */
public interface AlumnoDao {
    public void añadirAlumno(Alumno alumno);
    public Object calcularMax();
    public String calcularMax2();
}
