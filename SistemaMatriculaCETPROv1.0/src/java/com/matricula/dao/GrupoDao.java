/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.dao;

import com.matricula.dto.GrupoDTO;
import com.matricula.model.CurriculaAnual;
import com.matricula.model.Grupo;
import com.matricula.model.Modulo;
import com.matricula.model.Profesor;
import com.matricula.model.Turno;
import java.util.List;

/**
 *
 * @author PEDRO
 */
public interface GrupoDao {
    
    public void insertarGrupo(Integer idGrupo, GrupoDTO gru, Profesor pro,Turno tur, CurriculaAnual curr,List<String> selectedias);
    public void insertarGrupo(Integer idGrupo, GrupoDTO gru, Profesor pro,Turno tur, CurriculaAnual curr);
    public int ultimaGrupo();
    public Grupo getGrupo(int idg);
    public void insertarGrupo3(Integer idGrupo, GrupoDTO gru, Profesor pro,Turno tur, Modulo mod);
}
