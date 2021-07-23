package app.cap_01_panoramica.dataSet;

import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

import java.io.IOException;


/**
 * CLASSE DATA SET EXCEPTION
 * attenzione alla clausola throws = dichiara il metodo getDataset può sollevare
 * una eccezione.
 */
@Esercizio(daFare = true,
        nro = "1.16", pag = 34, descrizione = "01) Aggiungere campi a BadDataSetException in " +
        "modo che possa contenere il nome dell'insieme di valori e l'eccezione di I/O che " +
        "segnala eventuali problemi affinche chiunque intercetti l'eccezione possa conoscere " +
        "i dettagli dell'errore.")
public class BadDataSetException extends Exception {
    //01) NOME DELL'INSIEME DEI VALORI = il dataset ?
    private String nomeDataset;
    //02) eccezione di IO
    private IOException eccezioneIO;
    public BadDataSetException(String nomeDataset, IOException eccezioneIO){
        this.nomeDataset = nomeDataset;
        this.eccezioneIO=eccezioneIO;
    }

    public String getNomeDataset() {
        return nomeDataset;
    }

    public IOException getEccezioneIO() {
        return eccezioneIO;
    }
}
