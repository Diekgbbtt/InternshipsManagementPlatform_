package com.gestionetirocinio.Modello;


import lombok.*;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Aziende")
public class Azienda {


    @Id
    public String NomeAzienda;

    @OneToMany(mappedBy = "azienda")
    Collection<ProgettoFormativo>  pf;

    @OneToMany(mappedBy = "azienda")
    Collection<TirocinioEsterno> Tir_esterno;



    public Indirizzo Sede;
    public Integer Telefono;
    public String Email;

}