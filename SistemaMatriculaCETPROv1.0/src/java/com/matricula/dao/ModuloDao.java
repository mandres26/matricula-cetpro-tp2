/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.dao;

import com.matricula.dto.ModuloDTO;
import com.matricula.model.Especialidad;

/**
 *
 * @author Juan Diego
 */
public interface ModuloDao {
    
    public void insertarModulo(Integer idMod, ModuloDTO mod, Especialidad esp);
    public int ultimaId();
}
