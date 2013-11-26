/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matricula.dao.impl;

import com.matricula.dao.ModuloDao;
import com.matricula.dto.ModuloDTO;
import com.matricula.model.Especialidad;
import com.matricula.model.Modulo;
import com.matricula.util.Constante;
import com.matricula.util.Util;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Juan Diego
 */
public class ModuloDaoImpl implements ModuloDao{
    
    @Override
    public void insertarModulo(Integer idMod, ModuloDTO mod, Especialidad esp){
        Session session = Util.getCurrentSession();
        session.beginTransaction();
        Modulo modulo = new Modulo();
        System.out.println(">>>>>>>>>>Modulo "+idMod+" - "+
                mod.getNombreModulo()+" - "+mod.getHorasModulo()+" - "+esp.getIdEspecialidad());
        modulo.setIdModulo(idMod);
        modulo.setNombreModulo(mod.getNombreModulo());
        modulo.setHorasModulo(mod.getHorasModulo()+"");
        modulo.setEspecialidad(esp);
        session.save(modulo);
        session.getTransaction().commit();
    }

    @Override
    public int ultimaId() {
        Session session = Util.getCurrentSession();
        Transaction t = session.beginTransaction();
        List lista = session.createQuery("select max(idModulo) from  Modulo").list();
        t.commit();
        int ultimo;
        if(lista.get(0) == null){
            ultimo = Constante.CODIGO_MODULO;
        }else{
            ultimo = (Integer)lista.get(0);
        } 
        return ultimo;
    }
}
