package app.cap_03_estensione_classi;

import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

/**
 * CLASSE SORTDOUBLE
 * di servizio benchmarking utile per confrontare diverse varieta di
 * algoritmi di ordinamento. La classe è definita Abstract ma il metodo
 * sort ossia le operazioni di ordinamento sono determinate dalla classi
 * estese:  SortDouble + SortMetrics
 * pag 107
 * questa classe definisce i campi in grado di memorizzare l'array da ordinare
 * values ed un riferimento ad un oggetto metrica (curMetrics) in grado di tenere
 * traccia delle operazioni misurate.
 * la classe SortDouble  è progettata per NON FIDARSI delle classi estese ed è il modo
 * migliore per prevenire utilizzi impropri o erroi. pag 107
 * Utilizza infatti final per tutti i suo metodi NON ABSTRACT e quindi il contratto di questa
 * classe fon final rende non modificabili i METODI che effettuano le misurazioni
 */
@Esercizio(daFare = true, nro = "3.11", pag = 111,
        descrizione = "Individuare all'interndo di sort double almeno un problema di sicurezza " +
                "che permetta a un algorimtmo di ordinamento di 'INGANNARE' le metriche senza " +
                "senza essere notato. Risolvere i problemi di sicurezza riscontrati. Partire " +
                "dal presupposto che l'autore dell'algoritmo di ordinamento non debba scrivere il" +
                "codice di main.")
public abstract class SortDouble {
    private double[] values;
    private final SortMetrics curMetrics = new SortMetrics();

    /*
     *invocato per esguire un'intero ordinamento
     */
    public final SortMetrics sort(double[] data) {
        values = data;
        curMetrics.init(); //oggetto che tiene traccia delle operazioni misurate.
        doSort();
        return getMetrics();
    }

    public final SortMetrics getMetrics() {
        return curMetrics.clone();

    }

    /*
    METODO GET DATA LENGHT
    usato nelle classi estese per conoscere il numero di elementi
     */
    protected final int getDataLenght() {
        return values.length;
    }

    /*
    METODO PROBE
    usato nelle classi estese per TESTARE gli elementi
     */
    protected final double probe(int i) {
        curMetrics.probeCnt++;
        return values[i];

    }

    /*
     METODO COMPARE
     usato nelle classi estese per CONFRONTARE gli elementi
      */
    protected final int compare(int i, int j) {
        curMetrics.compareCnt++;
        double d1 = values[i];
        double d2 = values[j];
        if (d1 == d2)
            return 0;
        else
            return (d1 < d2 ? -1 : 1);
    }

    /*
    METODO PROBE
    usato nelle classi estese per SCAMBIARE gli elementi
    */
    protected final void swap(int i, int j) {
        curMetrics.swapCnt++;
        double tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }

    /*
    le classi estese implementano questo metodo -- usato
    da sort
    */
    protected abstract void doSort();

}

