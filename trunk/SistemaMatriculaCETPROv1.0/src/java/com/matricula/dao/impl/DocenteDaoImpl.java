/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.dao.impl;

import com.matricula.dao.ConexionBD;
import com.matricula.dao.DocenteDao;
import com.matricula.model.Profesor;
import com.matricula.util.HibernateUtil;
import com.matricula.util.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Rosy
 */
public class DocenteDaoImpl  implements DocenteDao{
     ConexionBD BD = new ConexionBD();
    /*private  DocenteDao docenteDao;
 ConexionBD BD = new ConexionBD();
    public DocenteDao getDocenteDao() {
        return docenteDao;
    }

    public void setDocenteDao(DocenteDao docenteDao) {
        this.docenteDao = docenteDao;
    }
    */
     public void añadir(Profesor profesor) {
        Connection cn = BD.getConexion();
        String sexo = profesor.getSexo().toString();
        String sql = "INSERT INTO PROFESOR(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        System.out.println("NOMBRE:   "+profesor.getNombres()+"   "+profesor.getSexo());
        try {
            PreparedStatement pst= cn.prepareStatement(sql);
            
            pst.setInt(1, profesor.getIdProfesor());
            System.out.println("1");
            pst.setString(2, profesor.getNombres());
            System.out.println("2");
            pst.setString(3, profesor.getApePaterno());
            System.out.println("3");
            pst.setString(4, profesor.getApeMaterno());
            System.out.println("4");
            pst.setDate(5, (java.sql.Date) profesor.getFecNacimiento());
            System.out.println("5");
            pst.setString(6, sexo);
            System.out.println("6");
            pst.setInt(7, profesor.getDni());
            System.out.println("7");
            pst.setString(8, profesor.getEmail());
            System.out.println("8");
            pst.setInt(9,profesor.getEdad());
            System.out.println("9");
            pst.setString(10, profesor.getNumFijo());
            System.out.println("10");
            pst.setString(11, profesor.getNumMovil());
            System.out.println("11");
            pst.setString(12, profesor.getDomicilio());
            System.out.println("12");
            pst.setString(13, profesor.getGradEstudios());
            System.out.println("13");
            
            pst.execute();
            pst.close();
        } catch (Exception e) {
            System.err.println("Error al añadir profesor, en docente: "+e);
        }      
    }
    public void insert(Profesor profesor) {
        Session session = Util.getCurrentSession();
        session.beginTransaction();
        Profesor docente = new Profesor();
        docente.setApeMaterno(profesor.getApeMaterno());
        docente.setApePaterno(profesor.getApePaterno());
        docente.setIdProfesor(profesor.getIdProfesor());
        docente.setEmail(profesor.getEmail());
        docente.setDomicilio(profesor.getDomicilio());
        docente.setGradEstudios(profesor.getGradEstudios());
        docente.setNombres(profesor.getNombres());
        docente.setNumFijo(profesor.getNumFijo());
        docente.setNumMovil(profesor.getNumMovil());
        docente.setFecNacimiento(new Date());
        session.save(docente);
        session.getTransaction().commit();
        //docenteDao.insert(docente);
        
    }

    @Override
    public void delete(Profesor obj) {
        Session session = Util.getCurrentSession();
        session.beginTransaction();
        Profesor docente = new Profesor();
        docente.setApeMaterno(obj.getApeMaterno());
        docente.setApePaterno(obj.getApePaterno());
        docente.setIdProfesor(obj.getIdProfesor());
        docente.setEmail(obj.getEmail());
        docente.setDomicilio(obj.getDomicilio());
        docente.setGradEstudios(obj.getGradEstudios());
        docente.setNombres(obj.getNombres());
        docente.setNumFijo(obj.getNumFijo());
        docente.setNumMovil(obj.getNumMovil());
        docente.setFecNacimiento(new Date());
        session.delete(docente);
        session.getTransaction().commit();
       // docenteDao.delete(docente);
    }

   // @Override
    public void update(Profesor obj) {
        Session session = Util.getCurrentSession();
        session.beginTransaction();
        Profesor docente = new Profesor();
        docente.setApeMaterno(obj.getApeMaterno());
        docente.setApePaterno(obj.getApePaterno());
        docente.setIdProfesor(obj.getIdProfesor());
        docente.setEmail(obj.getEmail());
        docente.setDomicilio(obj.getDomicilio());
        docente.setGradEstudios(obj.getGradEstudios());
        docente.setNombres(obj.getNombres());
        docente.setNumFijo(obj.getNumFijo());
        docente.setNumMovil(obj.getNumMovil());
        docente.setFecNacimiento(new Date());
        session.update(docente);
        session.getTransaction().commit();
       // docenteDao.delete(docente);
    }

    @Override
    public List<Profesor> getAll() {
       List<Profesor> lista = new ArrayList();
       /*
        for (Profesor obj : docenteDao.getAll()) {
            DocenteBean bean = new DocenteBean();
            bean.setApMaterno(obj.getApeMaterno());
            bean.setApPaterno(obj.getApePaterno());
            bean.setIdProfesor(obj.getIdProfesor());
            bean.setEmail(obj.getEmail());
            bean.setDomicilio(obj.getDomicilio());
            bean.setGradoEstudios(obj.getGradEstudios());
            bean.setNombres(obj.getNombres());
            bean.setNumFijo(obj.getNumFijo());
            bean.setNumMovil(obj.getNumMovil());
            bean.setFechNacimiento(obj.getFecNacimiento());
            lista.add(bean);
            
        }*/
        return lista;
    }

        public List<Profesor> getAllByFechas(Profesor obj) {
         List<Profesor> lista = new ArrayList();
         /*
        for (Profesor obj : docenteDao.getAllByFechas(docente)) {
            DocenteBean bean = new DocenteBean();
             bean.setApMaterno(obj.getApeMaterno());
            bean.setApPaterno(obj.getApePaterno());
            bean.setIdProfesor(obj.getIdProfesor());
            bean.setEmail(obj.getEmail());
            bean.setDomicilio(obj.getDomicilio());
            bean.setGradoEstudios(obj.getGradEstudios());
            bean.setNombres(obj.getNombres());
            bean.setNumFijo(obj.getNumFijo());
            bean.setNumMovil(obj.getNumMovil());
            bean.setFechNacimiento(obj.getFecNacimiento());
            lista.add(bean);
        }*/
        return lista;
   // }
    }

     public Object calcularMax() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql ="select max(idProfesor) from PROFESOR";
        Query query = session.createQuery(hql);
        return query.uniqueResult();
    }
    
    public String calcularMax2() {
        Connection cn = BD.getConexion();
        String valor = null;
        String sql ="select max(idProfesor) from PROFESOR";
        try {
            PreparedStatement pst= cn.prepareStatement(sql);
            pst.execute();
            ResultSet resultset = pst.getResultSet();
            if (resultset.next()) {
                valor = resultset.getString(1);
            }
            pst.close();
        } catch (Exception e) {
            System.err.println("Error al calcularMax2, en DocenteDaoImpl: "+e);
        }
        return valor;
    }
    
}