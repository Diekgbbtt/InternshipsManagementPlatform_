package com.gestionetirocinio.Modello;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Indirizzo {

    public String Via;
    public String Città;
    public Integer CAP;
    public String Provincia;

}

// nella richiesta POST il corpo JSON deve essere formattato correttamente

/* ex : {
    "name": "Mario Rossi",
    "age": 30,
    "address": {
      "street": "Via Roma",
      "city": "Milano",
      "zipCode": "20100"
    }
  } */