/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.matricula.dao.impl;

import com.matricula.dao.ConexionBD;
import com.matricula.dao.AlumnoDao;
import com.matricula.model.Alumno;
import com.matricula.util.HibernateUtil;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author FELIPE
 */
public class AlumnoDaoImpl implements AlumnoDao{
    ConexionBD BD = new ConexionBD();
    
    @Override
    public void añadirAlumno(Alumno alumno) {
        Connection cn = BD.getConexion();
        String sexo = alumno.getSexo().toString();
        String sql = "INSERT INTO ALUMNO VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        System.out.println("NOMBRE:   "+alumno.getNombres()+"   "+alumno.getSexo());
        try {
            PreparedStatement pst= cn.prepareStatement(sql);
            pst.setString(1, alumno.getIdAlumno());
            System.out.println("1");
            pst.setString(2, alumno.getNombres());
            System.out.println("2");
            pst.setString(3, alumno.getApePaterno());
            System.out.println("3");
            pst.setString(4, alumno.getApeMaterno());
            System.out.println("4");
            pst.setDate(5, (Date) alumno.getFecNacimiento());
            System.out.println("5");
            pst.setString(6, sexo);
            System.out.println("6");
            pst.setInt(7, alumno.getDni());
            System.out.println("7");
            pst.setString(8, alumno.getEmail());
            System.out.println("8");
            pst.setInt(9, alumno.getEdad());
            System.out.println("9");
            pst.setInt(10, alumno.getNumFijo());
            System.out.println("10");
            pst.setInt(11, alumno.getNumMovil());
            System.out.println("11");
            pst.setString(12, alumno.getDomicilio());
            System.out.println("12");
            pst.setString(13, alumno.getProvincia());
            System.out.println("13");
            pst.setString(14, alumno.getRegion());
            System.out.println("14");
            pst.execute();
            pst.close();
        } catch (Exception e) {
            System.err.println("Error al añadir alumno, en AlumnoDaoImpl: "+e);
        }      
    }

    @Override
    public Object calcularMax() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql ="select max(idAlumno) from Alumno";
        Query query = session.createQuery(hql);
        return query.uniqueResult();
    }
    
    public String calcularMax2() {
        Connection cn = BD.getConexion();
        String valor = null;
        String sql ="select max(idAlumno) from ALUMNO";
        try {
            PreparedStatement pst= cn.prepareStatement(sql);
            pst.execute();
            ResultSet resultset = pst.getResultSet();
            if (resultset.next()) {
                valor = resultset.getString(1);
            }
            pst.close();
        } catch (Exception e) {
            System.err.println("Error al calcularMax2, en AlumnoDaoImpl: "+e);
        }
        return valor;
    }
    
}
