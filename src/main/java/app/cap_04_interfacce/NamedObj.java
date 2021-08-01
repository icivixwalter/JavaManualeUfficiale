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

    //pag 168 = il valore da assegnare è piu complesso di una semplice espressione
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
        //...... pag 168 ??
    }
}
