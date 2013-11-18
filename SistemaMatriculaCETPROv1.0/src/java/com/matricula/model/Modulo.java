package com.matricula.model;
// Generated 17-nov-2013 16:20:46 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Modulo generated by hbm2java
 */
public class Modulo  implements java.io.Serializable {


     private int idModulo;
     private Especialidad especialidad;
     private String nombreModulo;
     private String horasModulo;
     private Set<CapacidadTerminal> capacidadTerminals = new HashSet<CapacidadTerminal>(0);

    public Modulo() {
    }

	
    public Modulo(int idModulo, Especialidad especialidad) {
        this.idModulo = idModulo;
        this.especialidad = especialidad;
    }
    public Modulo(int idModulo, Especialidad especialidad, String nombreModulo, String horasModulo, Set<CapacidadTerminal> capacidadTerminals) {
       this.idModulo = idModulo;
       this.especialidad = especialidad;
       this.nombreModulo = nombreModulo;
       this.horasModulo = horasModulo;
       this.capacidadTerminals = capacidadTerminals;
    }
   
    public int getIdModulo() {
        return this.idModulo;
    }
    
    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }
    public Especialidad getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    public String getNombreModulo() {
        return this.nombreModulo;
    }
    
    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }
    public String getHorasModulo() {
        return this.horasModulo;
    }
    
    public void setHorasModulo(String horasModulo) {
        this.horasModulo = horasModulo;
    }
    public Set<CapacidadTerminal> getCapacidadTerminals() {
        return this.capacidadTerminals;
    }
    
    public void setCapacidadTerminals(Set<CapacidadTerminal> capacidadTerminals) {
        this.capacidadTerminals = capacidadTerminals;
    }




}


