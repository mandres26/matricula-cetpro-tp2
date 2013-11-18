package com.matricula.model;
// Generated 17-nov-2013 16:20:46 by Hibernate Tools 3.6.0



/**
 * CapacidadTerminal generated by hbm2java
 */
public class CapacidadTerminal  implements java.io.Serializable {


     private int idCodigo;
     private Modulo modulo;
     private String nombreCt;
     private String notaCt;

    public CapacidadTerminal() {
    }

	
    public CapacidadTerminal(int idCodigo, Modulo modulo) {
        this.idCodigo = idCodigo;
        this.modulo = modulo;
    }
    public CapacidadTerminal(int idCodigo, Modulo modulo, String nombreCt, String notaCt) {
       this.idCodigo = idCodigo;
       this.modulo = modulo;
       this.nombreCt = nombreCt;
       this.notaCt = notaCt;
    }
   
    public int getIdCodigo() {
        return this.idCodigo;
    }
    
    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }
    public Modulo getModulo() {
        return this.modulo;
    }
    
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public String getNombreCt() {
        return this.nombreCt;
    }
    
    public void setNombreCt(String nombreCt) {
        this.nombreCt = nombreCt;
    }
    public String getNotaCt() {
        return this.notaCt;
    }
    
    public void setNotaCt(String notaCt) {
        this.notaCt = notaCt;
    }




}


