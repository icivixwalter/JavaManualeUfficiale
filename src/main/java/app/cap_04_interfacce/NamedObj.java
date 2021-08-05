package app.cap_04_interfacce;

/**
 * CLASSE NAMED OBJ pag 168
 * i campi blank sono utili nel caso in cui il loro valore venga determinato
 * dal COSTRUTTORE.
 */


public class NamedObj {
    final String name;  // variabile blank dichiarata final


    //costruttore = variabile blank il cui valore è determinato dal COSTRUTTORE
    public NamedObj(String name) {
        this.name = name;
    }

    /* pag 168 = il valore da assegnare è piu complesso di una semplice espressione
    i campi statici e final vengono inizializzati entro la fine della costruzione di un
    oggetto e se il complianotre non riesce a verificare tale inizializzazione  segnalera
    un errore di compilazione. Quihdi anche LE VARIABILI LOCALI FINAL devono essere inizializzate
    prima del suo uso. E le variabili + parametri FINAL vengono utilizzate solo quando 4
    si deve accedere ALLA CLASSI INTERNE O ANONIME  oppure per  EVITARE che a queste variabili
    venga assegnato ACCIDENTALMENTE un valore ad un paramentro che NON SI INDTENDEVA
    assegnarlo. pag 168
     */
    static final int[] numbers = numberList();

    static final int maxNumber; //massimo valore number
    static {
        int max = numbers[0];
        for (int num : numbers){
            if (num>max)
                max = num;
        }
        //il campo maxNumber viene inizializzato qui.
        maxNumber=max;

    }

    static int[] numberList()
    {
        //...... pag 168 ?? l'automantico ha inserito il return
        // altrimenti da errore.
        return new int[0];
    }
}
