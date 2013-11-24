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
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;

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
    private String regiones[] = {"Lima","Callao"};
    private String provincias[] = {"Barranca","Canta","Cañete","Cajatambo","Huaral","Huarochiri","Huaura","Lima","Oyon","Yauyos"};
    private String distritos[] = {"Lima","Ancón","Ate","Barranco","Breña","Carabayllo","Chaclacayo",
        "Chorrillos","Cieneguilla","Comas","El Agustino","Independencia","Jesús María","La Molina",
        "La Victoria","Lince","Los Olivos","Lurigancho-Chosica","Lurin","Magdalena del Mar",
        "Pueblo Libre","Miraflores","Pachacámac","Pucusana","Puente Piedra","Punta Hermosa","Punta Negra",
        "Rímac","San Bartolo","San Borja","San Isidro","San Juan de Lurigancho" +"San Juan de Miraflores",
        "San Luis","San Martín de Porres","San Miguel","Santa Anita","Santa María del Mar","Santa Rosa",
        "Santiago de Surco","Surquillo","Villa El Salvador","Villa María del Triunfo"};
    private String codigo;
    private String provlist [][]={{"Barranca","Canta","Cañete","Cajatambo","Huaral","Huarochiri","Huaura","Oyon","Yauyos"},{"Callao"}};
    private String distlist [][]={{"Barranca","Paramonga"},{"Canta"},{"Cañete"},{"Cajatambo"},{"Huaral"},{"Huarochiri"},{"Huaura"},{"Oyon"},{"Yauyos"},{"Callao","Bellavista","Carmen de la Legua","La Perla","La Punta","Ventanilla"}};
    /**
     * Creates a new instance of AlumnoBean
     */
    public AlumnoBean() {
    }

    public String getCodigo() {
        AlumnoDao alumnoDao = new AlumnoDaoImpl();
        codigo=alumnoDao.calcularMax2().substring(1);
        long valor = Long.parseLong(codigo)+1;
        codigo = "0"+String.valueOf(valor);
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String[] getDistritos() {
        return distritos;
    }

    public void setDistritos(String[] distritos) {
        this.distritos = distritos;
    }
    
    
    public void añadirAlumno(ActionEvent actionEvent){
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage msg = null;
        boolean registrado = false;
        
        AlumnoDao alumnoDao = new AlumnoDaoImpl();
        //alumno.setIdAlumno(Integer.parseInt(alumnoDao.calcularMax().toString())+1);
        Date fecha = Date.valueOf(año+"-"+mes+"-"+dia);
        alumno.setIdAlumno(getCodigo());
        alumno.setFecNacimiento(fecha);
        Calendar cal=Calendar.getInstance(); 
        int fa = Integer.valueOf(cal.get(cal.YEAR));
        alumno.setEdad(fa-año);
        System.out.println("FECHA: "+año+"-"+mes+"-"+dia+"      ->"+alumno.getEdad()+"   :"+alumno.getIdAlumno());
        
        try {
            alumnoDao.añadirAlumno(alumno);
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Registrado: ", alumno.getNombres());  
            registrado = true;
        } catch (Exception e) {
            System.out.println("Error al añadir alumno, en AlumnoBean: "+e);
        } 
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        context.addCallbackParam("regAlu", registrado);  
        alumno=new Alumno();
    }


}
