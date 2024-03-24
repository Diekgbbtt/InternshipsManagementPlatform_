package com.gestionetirocinio.Modello;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Studente {


@Id
private Integer matricola;

private String StatoCarriera;

private Integer CFU;

    
}
