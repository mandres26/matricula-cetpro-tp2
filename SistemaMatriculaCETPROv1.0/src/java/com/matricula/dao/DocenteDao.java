/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.dao;

import com.matricula.model.Profesor;
import java.util.List;

/**
 *
 * @author Rosy
 */
public interface DocenteDao {
    public void añadirProfesor(Profesor profesor);
    void insert(Profesor obj);
    void delete(Profesor obj);
    void update(Profesor obj);
    public Object calcularMax();
    List<Profesor> getAll();
    List<Profesor> getAllByFechas(Profesor obj);
    
}
