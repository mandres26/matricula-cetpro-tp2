package com.matricula.model;
// Generated 9/12/2013 01:55:35 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CurriculaAnual generated by hbm2java
 */
@Entity
@Table(name="CURRICULA_ANUAL"
    ,catalog="matriculacetpro"
)
public class CurriculaAnual  implements java.io.Serializable {


     private String idCurriculaAnual;
     private Especialidad especialidad;
     private ProgCurricular progCurricular;

    public CurriculaAnual() {
    }

    public CurriculaAnual(String idCurriculaAnual, Especialidad especialidad, ProgCurricular progCurricular) {
       this.idCurriculaAnual = idCurriculaAnual;
       this.especialidad = especialidad;
       this.progCurricular = progCurricular;
    }
   
     @Id 
    
    @Column(name="idCurriculaAnual", unique=true, nullable=false, length=45)
    public String getIdCurriculaAnual() {
        return this.idCurriculaAnual;
    }
    
    public void setIdCurriculaAnual(String idCurriculaAnual) {
        this.idCurriculaAnual = idCurriculaAnual;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ESPECIALIDAD_idEspecialidad", nullable=false)
    public Especialidad getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PROG_CURRICULAR_idProgCurricular", nullable=false)
    public ProgCurricular getProgCurricular() {
        return this.progCurricular;
    }
    
    public void setProgCurricular(ProgCurricular progCurricular) {
        this.progCurricular = progCurricular;
    }




}

