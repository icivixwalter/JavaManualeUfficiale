package app.cap_01_panoramica;

/**
 * CLASSE PER L'ESERCIZIO 1.1O PAG 20
 * questa classe ha 2 campi
 * 1) valore fibonacci
 * 2) boolean = per dire PARI O DISPARI
 */
public class FibonacciValue {
    private long valoreFibonacci;
    private boolean isPari;

    //costruttore
    public FibonacciValue(long valoreFibonacci, boolean isPari) {
        //imposto i valori dei campi con i parametri passati.
        this.valoreFibonacci = valoreFibonacci;
        this.isPari = isPari;
    }

    /**
     * HO CREATO UN METODO toString = per poter stampare
     * in modo semplice i valori delle variabili di fibonacci,
     * perchè senza toString stampava il nome della classe seguito
     * da un ID UNIVOCO in esadecimane con il metodo hashcode()
     */
    @Override
    public String toString() {
        return "FibonacciValue{" + valoreFibonacci +
                (valoreFibonacci % 2 == 0 ? ", PARI" : ", DISPARI") + // OPERATORE TERNARIO: SE valoreFibonacci e' pari, restituisce la stringa "PARI", altrimenti la stringa "DISPARI"
                '}';
    }
}
