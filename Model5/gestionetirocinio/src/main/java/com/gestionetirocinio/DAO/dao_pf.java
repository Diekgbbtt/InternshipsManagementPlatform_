package com.gestionetirocinio.DAO;

import com.gestionetirocinio.Modello.CustomKey;
import com.gestionetirocinio.Modello.ProgettoFormativo;


import org.springframework.data.jpa.repository.JpaRepository;



public interface dao_pf extends JpaRepository<ProgettoFormativo, String> {

}