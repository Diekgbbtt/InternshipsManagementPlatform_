package com.gestionetirocinio.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionetirocinio.Modello.TirocinioEsterno;


public interface dao_Tirocinio extends JpaRepository<TirocinioEsterno, Integer>{
    
}
