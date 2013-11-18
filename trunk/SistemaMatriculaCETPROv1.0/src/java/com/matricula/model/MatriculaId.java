package com.matricula.model;
// Generated 17-nov-2013 16:20:46 by Hibernate Tools 3.6.0



/**
 * MatriculaId generated by hbm2java
 */
public class MatriculaId  implements java.io.Serializable {


     private int alumnoIdAlumno;
     private int grupoIdGrupo;

    public MatriculaId() {
    }

    public MatriculaId(int alumnoIdAlumno, int grupoIdGrupo) {
       this.alumnoIdAlumno = alumnoIdAlumno;
       this.grupoIdGrupo = grupoIdGrupo;
    }
   
    public int getAlumnoIdAlumno() {
        return this.alumnoIdAlumno;
    }
    
    public void setAlumnoIdAlumno(int alumnoIdAlumno) {
        this.alumnoIdAlumno = alumnoIdAlumno;
    }
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
         
		 return (this.getAlumnoIdAlumno()==castOther.getAlumnoIdAlumno())
 && (this.getGrupoIdGrupo()==castOther.getGrupoIdGrupo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getAlumnoIdAlumno();
         result = 37 * result + this.getGrupoIdGrupo();
         return result;
   }   


}


