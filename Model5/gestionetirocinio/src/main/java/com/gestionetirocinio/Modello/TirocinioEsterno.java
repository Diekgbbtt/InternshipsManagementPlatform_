package com.gestionetirocinio.Modello;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class TirocinioEsterno { /* extends TirocinioInterno */

    @Id
    public int matricola;

/*     @ManyToOne
    @JoinColumn(name = "azienda", referencedColumnName = "NomeAzienda") */
    // private Azienda azienda;

    public String SedeAzienda;

    public Integer TelefonoAziendale;

    public String NomeTutor;

    public String RuoloTutor;

    private Boolean pf_approvato;

    private Boolean disponibilità_docente;

    private StatoTirocinio tirocinio_st;

    private Date DataInizio;
    private Date DataFine;

    private Boolean convalidato;
/* 
    @OneToOne(mappedBy = "Tir_esterno") */
    // RiassuntoAttivita riass_Attività;
/* 
    @OneToOne(mappedBy = "Tir_esterno") */
    // ResocontoTirocinio Res_tirocinio;

/*     @OneToOne(mappedBy = "Tir_esterno") */
    // ElaboratoFinale el_finale;

}