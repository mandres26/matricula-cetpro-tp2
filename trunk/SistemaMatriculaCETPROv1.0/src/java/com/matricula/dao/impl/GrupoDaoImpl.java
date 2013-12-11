/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.dao.impl;

import com.matricula.dao.DiaDao;
import com.matricula.dao.GrupoDao;
import com.matricula.dto.GrupoDTO;
import com.matricula.model.CurriculaAnual;
import com.matricula.model.Grupo;
import com.matricula.model.GrupoDia;
import com.matricula.model.Modulo;
import com.matricula.model.Profesor;
import com.matricula.model.Turno;
import com.matricula.util.Constante;
import com.matricula.util.HibernateUtil;
import com.matricula.util.Util;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author PEDRO
 */
public class GrupoDaoImpl implements GrupoDao {
    
    
        public void insertarGrupo(Integer idGrupo, GrupoDTO gru, Profesor pro,Turno tur, CurriculaAnual curr,List<String> selectedias) {
        Session session = Util.getCurrentSession();
        session.beginTransaction();
        Grupo grupo = new Grupo();
  /*      System.out.println("Grupo-------------------- "+idGrupo+" - "+gru.getNumMatriculados()+gru.getCantMaximaAlumno()
                +gru.getFecInicio());
      */  
        
        grupo.setIdGrupo(idGrupo);
        grupo.setCantMaximaAlumno(gru.getCantMaximaAlumno());
        grupo.setFecInicio(gru.getFecInicio());
        grupo.setFecTermino(gru.getFecTermino());
        
        grupo.setProfesor(pro);
        grupo.setTurno(tur);
      //  grupo.setCurriculaAnual(curr);
       
        session.save(grupo);
        session.getTransaction().commit();
       /* ModuloDao mod = new ModuloDaoImpl();
            for(ModuloDTO m: esp.getModulos()){
                mod.insertarModulo(mod.ultimaId()+1, m, especialidad);
          }*/
        
        DiaDao dao2=new DiaDaoImpl();
   /*     for(int i=0;i<selectedias.size();i++){
        dao2.insertarDia(dao2.ultimaDia()+1, selectedias.get(i));
        
        } */
    }

        public void insertarGrupo(Integer idGrupo, GrupoDTO gru, Profesor pro,Turno tur, CurriculaAnual curr) {
        Session session = Util.getCurrentSession();
        session.beginTransaction();
        Grupo grupo = new Grupo();
  /*      System.out.println("Grupo-------------------- "+idGrupo+" - "+gru.getNumMatriculados()+gru.getCantMaximaAlumno()
                +gru.getFecInicio());
      */  
        
        grupo.setIdGrupo(idGrupo);
        grupo.setCantMaximaAlumno(gru.getCantMaximaAlumno());
        grupo.setFecInicio(gru.getFecInicio());
        grupo.setFecTermino(gru.getFecTermino());
        
        grupo.setProfesor(pro);
        grupo.setTurno(tur);
        
       // grupo.setCurriculaAnual(curr);
       
        session.save(grupo);
        session.getTransaction().commit();
   }
   
        
        public void insertarGrupo3(Integer idGrupo, GrupoDTO gru, Profesor pro,Turno tur, Modulo mod) {
        Session session = Util.getCurrentSession();
        session.beginTransaction();
        Grupo grupo = new Grupo();
        grupo.setIdGrupo(idGrupo);
        grupo.setCantMaximaAlumno(gru.getCantMaximaAlumno());
        grupo.setFecInicio(gru.getFecInicio());
        grupo.setFecTermino(gru.getFecTermino());
        
        grupo.setProfesor(pro);
        grupo.setTurno(tur);
        grupo.setModulo(mod);
        session.save(grupo);
        session.getTransaction().commit();
   }
             
             
        public int ultimaGrupo() {
        Session session = Util.getCurrentSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("select max(idGrupo) from  Grupo").list();
        t.commit();
        
          int ultimo;
        if(lista.get(0) == null){
            ultimo = Constante.CODIGO_GRUPO;
        }else{
            ultimo = (Integer)lista.get(0);
        } 
        return ultimo;
    
    }
         public Grupo getGrupo(int idg) {
           Grupo gru =null;
  
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
 //       org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Grupo where idGrupo= "+idg);
        gru = (Grupo) q.uniqueResult();

    return gru;
    } 
}
