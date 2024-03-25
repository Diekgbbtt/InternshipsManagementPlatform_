package com.gestionetirocinio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionetirocinio.Modello.ElaboratoFinale;


public interface dao_Elaborato extends JpaRepository<ElaboratoFinale, Integer> {

}