/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.bean;

import com.matricula.model.Profesor;
import java.io.Serializable;
import java.util.Calendar;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;
import com.matricula.dao.DocenteDao;
import com.matricula.dao.impl.DocenteDaoImpl;
/**
 *
 * @author Rosy
 */
@ManagedBean(name="docenteBean")
@SessionScoped
public class DocenteBean implements Serializable{
    private int dia, mes, año;
    private int dias[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20,21,22,23,24,25,26,27,28,29,30};
    private int meses[] = {1,2,3,4,5,6,7,8,9,10,11,12};
    private int años[] = {1991,1992,1993};
  
    private int codigo;
    private Profesor profesor;

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

    public int getCodigo() {
        DocenteDao docenteDao = new DocenteDaoImpl();
        
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    

    
   
     public void insert(ActionEvent actionEvent){
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
        boolean registrado = false;
        
        DocenteDao docenteDao = new DocenteDaoImpl();
        //alumno.setIdAlumno(Integer.parseInt(alumnoDao.calcularMax().toString())+1);
        java.sql.Date fecha = java.sql.Date.valueOf(año+"-"+mes+"-"+dia);
        profesor.setIdProfesor(getCodigo());
        profesor.setFecNacimiento(fecha);
        Calendar cal=Calendar.getInstance(); 
        int fa = Integer.valueOf(cal.get(cal.YEAR));
        profesor.setEdad(fa-año);
       // profesor.setEdad(fa-año);
        System.out.println("FECHA: "+año+"-"+mes+"-"+dia+"      ->"+profesor.getEdad()+"   :"+profesor.getIdProfesor());
        docenteDao.insert(profesor);
        try {
            docenteDao.añadir(profesor);
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registrado: ", profesor.getNombres());  
            registrado = true;
        } catch (Exception e) {
            System.out.println("Error al añadir alumno, en AlumnoBean: "+e);
        } 
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        context.addCallbackParam("regAlu", registrado);  
        profesor=new Profesor();
    }
     
     
     
     
     
     
     
     
     
     
     
     
    
      public void delete(){
       DocenteDao docentedao  = new DocenteDaoImpl();
        docentedao.delete(profesor);
        } 
    
     public void update(){
       DocenteDao docentedao  = new DocenteDaoImpl();
        docentedao.update(profesor);
        } 
     }

    
    