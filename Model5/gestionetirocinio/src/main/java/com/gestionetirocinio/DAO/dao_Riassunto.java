package com.gestionetirocinio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionetirocinio.Modello.RiassuntoAttivita;


public interface dao_Riassunto extends JpaRepository<RiassuntoAttivita, Integer>{
    
}
