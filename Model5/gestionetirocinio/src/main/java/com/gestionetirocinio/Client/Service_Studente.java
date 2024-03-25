package com.gestionetirocinio.Client;

import java.sql.SQLException;
import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import com.gestionetirocinio.Modello.Studente;
import com.gestionetirocinio.DAO.dao_studente;



@Service
@Primary
public class Service_Studente {

    @Autowired
    private dao_studente studente_tbl;

    @Autowired
    public Studente studente_obj;


    public Studente getStudenteById(int id) {
        return studente_tbl.findById(id).orElse(null);
    }

    public boolean VerificaIdoneita(int id){

        studente_obj = getStudenteById(id);
        if((studente_obj.getCFU())>120 && studente_obj.getStatoCarriera().equals("Attiva")){
            System.out.println("Studente Idoneo");
            return true;
        } else return false;
    }

/*     /**
     * @param matricola 
     * @return
     */
/*     public boolean VerificaIdoneità(int matricola) {
        // TODO implement here
        return false; */



}