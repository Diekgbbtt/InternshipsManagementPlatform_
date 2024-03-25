package com.gestionetirocinio.DAO;

import com.gestionetirocinio.Modello.ResocontoTirocinio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface dao_rt extends JpaRepository<ResocontoTirocinio, Integer> {

}