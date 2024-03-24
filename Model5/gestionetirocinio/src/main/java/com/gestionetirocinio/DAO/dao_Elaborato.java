package com.gestionetirocinio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionetirocinio.Modello.ElaboratoFinale;

@Repository
public interface dao_Elaborato extends JpaRepository<ElaboratoFinale, Integer> {

}