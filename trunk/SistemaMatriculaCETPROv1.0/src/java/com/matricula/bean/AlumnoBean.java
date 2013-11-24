/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.matricula.bean;

import com.matricula.dao.AlumnoDao;
import com.matricula.dao.impl.AlumnoDaoImpl;
import com.matricula.model.Alumno;
import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author FELIPE
 */
@ManagedBean(name="alumnoBean")
@SessionScoped
public class AlumnoBean implements Serializable {
    private Alumno alumno;
    private int dia, mes, año;
    private int dias[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20,21,22,23,24,25,26,27,28,29,30};
    private int meses[] = {1,2,3,4,5,6,7,8,9,10,11,12};
    private int años[] = {1991,1992,1993};
    private String regiones[] = {"Lima","Callao","Ica"};
    private String provincias[] = {"Lima","Chosica","etc"};
    /**
     * Creates a new instance of AlumnoBean
     */
    public AlumnoBean() {
    }

    public Alumno getAlumno() {
        if (alumno==null) {
            alumno=new Alumno();
        }
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
        public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int[] getDias() {
        return dias;
    }

    public void setDias(int[] dias) {
        this.dias = dias;
    }

    public int[] getMeses() {
        return meses;
    }

    public void setMeses(int[] meses) {
        this.meses = meses;
    }

    public int[] getAños() {
        return años;
    }

    public void setAños(int[] años) {
        this.años = años;
    }

    public String[] getRegiones() {
        return regiones;
    }

    public void setRegiones(String[] regiones) {
        this.regiones = regiones;
    }

    public String[] getProvincias() {
        return provincias;
    }

    public void setProvincias(String[] provincias) {
        this.provincias = provincias;
    }
    
    public void añadirAlumno(){
        Date fecha = Date.valueOf(año+"-"+mes+"-"+dia); 
        alumno.setFecNacimiento(fecha);
        Calendar cal=Calendar.getInstance(); 
        int fa = Integer.valueOf(cal.get(cal.YEAR));
        alumno.setEdad(fa-año);
        System.out.println("FECHA: "+año+"-"+mes+"-"+dia+"      ->"+alumno.getEdad());
        AlumnoDao alumnoDao = new AlumnoDaoImpl();
        try {
            alumnoDao.añadirAlumno(alumno);
        } catch (Exception e) {
            System.out.println("Error al añadir alumno, en AlumnoBean: "+e);
        } 
    }


}
