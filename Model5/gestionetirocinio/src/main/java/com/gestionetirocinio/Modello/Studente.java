package com.gestionetirocinio.Modello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.test.mock.mockito.SpyBean;
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
public class Studente {

    @Id
    private Integer matricola;

    private String StatoCarriera;

    private Integer CFU;

    
}
