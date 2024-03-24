package com.gestionetirocinio.Modello;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElaboratoFinale {

    @Id
    private Long matricola;

    @OneToOne
    @JoinColumn(name = "matricola", referencedColumnName = "matricola" )
    private TirocinioEsterno Tir_esterno;

    private String NomeFile;

    private String type;

    @Lob
    @Column(name = "FileData",length = 1000)
    private byte[] FileData;

    
}
