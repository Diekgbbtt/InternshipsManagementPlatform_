package com.gestionetirocinio.Modello;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(CustomKey.class)
public class ProgettoFormativo {

    @Id
    @ManyToOne
    @JoinColumn(name = "azienda", referencedColumnName = "NomeAzienda")
    private Azienda azienda;
    
    @Id
    private String  NomeTutor;
    

    public String Ruolo;

    public String Attività;

    public String Modalità;

    public String ObiettiviFormativi;

    public Integer DurataMinima;

    // public Indirizzo Luogo;

    public Integer Compenso;

    public String Requisiti;


}

