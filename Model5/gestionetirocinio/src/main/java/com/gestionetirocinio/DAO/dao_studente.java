package com.gestionetirocinio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionetirocinio.Modello.Studente;


public interface dao_studente extends  JpaRepository<Studente, Integer> {

    
}
