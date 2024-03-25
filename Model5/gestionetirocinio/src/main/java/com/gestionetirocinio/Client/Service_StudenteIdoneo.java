package com.gestionetirocinio.Client;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionetirocinio.DAO.dao_Tirocinio;
import com.gestionetirocinio.Modello.StatoTirocinio;
import com.gestionetirocinio.Modello.Studente;
import com.gestionetirocinio.Modello.TirocinioEsterno;
import com.gestionetirocinio.Modello.TirocinioInterno;

@Service
public class Service_StudenteIdoneo extends Service_Studente {

    @Autowired
    private dao_Tirocinio tirocinio_tbl;

     @Autowired
    public TirocinioEsterno TirocinioEst_obj;


    public StatoTirocinio tirocinio_st;


    public TirocinioEsterno SetTirocinioEsterno(TirocinioEsterno RichiestaTirocinio) {
        if(VerificaIdoneita(RichiestaTirocinio.matricola)) {
            System.out.println("Richiesta Tirocinio caricata con successo");
            return tirocinio_tbl.save(RichiestaTirocinio);
        }
        System.out.println("Lo studente non soddisfa i requisiti per effettuare un tirocinio");
        return null;
    }


    public StatoTirocinio GetStatoTirocinio(int id) {
        TirocinioEst_obj = new TirocinioEsterno()/* tirocinio_tbl.findById(id).orElse(null) */;
        return TirocinioEst_obj.getTirocinio_st();

    }
    @Autowired
    public TirocinioEsterno UpdateDate(TirocinioEsterno Tir_esterno) { // da rivedere passando solo datainizio-fine e matricola(come amppare questi valori nella richiesta)

        if(GetStatoTirocinio(Tir_esterno.matricola) == tirocinio_st.Approvato) {
            TirocinioEst_obj = tirocinio_tbl.findById(Tir_esterno.matricola).orElse(null);
            TirocinioEst_obj.setDataInizio(Tir_esterno.getDataInizio());
            TirocinioEst_obj.setDataFine(Tir_esterno.getDataFine());
            return tirocinio_tbl.save(TirocinioEst_obj);
        } else System.out.println("Tirocinio Non Approvato"); return null;
    }
    

    public TirocinioEsterno SetStatoConcluso(int id) {

        TirocinioEst_obj = tirocinio_tbl.findById(id).orElse(null);
        TirocinioEst_obj.setTirocinio_st(tirocinio_st.Concluso);
        return tirocinio_tbl.save(TirocinioEst_obj);
    }

/*     public TirocinioInterno RichiestaTirocinioInterno(int matricola) {
        
        TirocinioInterno Tirocinio_interno = new TirocinioInterno();
        return Tirocinio_interno;
    }

    /**
     * @param matricola 
     * @return
     */
/*     public TirocinioEsterno RichiestaTirocinioEsterno(int matricola) {
        // TODO implement here
        TirocinioEsterno Tirocinio_esterno = new TirocinioEsterno();
        return Tirocinio_esterno;
    } */


/*     public String ControlloStatoRichiesta(int matricola) {
        // TODO implement here
        return "";
    } */


/*     private boolean ImpostareDataInizioFine(Date DataInizio, Date DataFine) {
        // TODO implement here
        return false;
    } */

    /**

     */
/*     private boolean ConcludereTirocinio() {
        // TODO implement here
        return false; */

}