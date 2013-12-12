package com.matricula.model;
// Generated 9/12/2013 01:55:35 AM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MatriculaId generated by hbm2java
 */
@Embeddable
public class MatriculaId  implements java.io.Serializable {


     private String alumnoIdAlumno;
     private int grupoIdGrupo;

    public MatriculaId() {
    }

    public MatriculaId(String alumnoIdAlumno, int grupoIdGrupo) {
       this.alumnoIdAlumno = alumnoIdAlumno;
       this.grupoIdGrupo = grupoIdGrupo;
    }
   

    @Column(name="ALUMNO_idAlumno", nullable=false, length=15)
    public String getAlumnoIdAlumno() {
        return this.alumnoIdAlumno;
    }
    
    public void setAlumnoIdAlumno(String alumnoIdAlumno) {
        this.alumnoIdAlumno = alumnoIdAlumno;
    }

    @Column(name="GRUPO_idGrupo", nullable=false)
    public int getGrupoIdGrupo() {
        return this.grupoIdGrupo;
    }
    
    public void setGrupoIdGrupo(int grupoIdGrupo) {
        this.grupoIdGrupo = grupoIdGrupo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MatriculaId) ) return false;
		 MatriculaId castOther = ( MatriculaId ) other; 
         
		 return ( (this.getAlumnoIdAlumno()==castOther.getAlumnoIdAlumno()) || ( this.getAlumnoIdAlumno()!=null && castOther.getAlumnoIdAlumno()!=null && this.getAlumnoIdAlumno().equals(castOther.getAlumnoIdAlumno()) ) )
 && (this.getGrupoIdGrupo()==castOther.getGrupoIdGrupo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAlumnoIdAlumno() == null ? 0 : this.getAlumnoIdAlumno().hashCode() );
         result = 37 * result + this.getGrupoIdGrupo();
         return result;
   }   


}


