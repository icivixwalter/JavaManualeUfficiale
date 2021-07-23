package app.cap_01_panoramica.interfacce;

import java.util.Arrays;

/**
 * CLASSE CHE IMPLEMENTA UN CONTRATTO INTERFACCIA
 * che in questo caso Lookup.
 * <p>
 * è una struttura dati che contiene nomi e valori, tipo un dizionario su cui è
 * possibile cercare i valori attraverso i nomi.
 */
class SimpleLookup implements Lookup {

    protected String[] names;     //array di nomi (chiave)
    protected Object[] values;    //array di valori

    //costruttore di SimpleLookup
    public SimpleLookup(String[] myNames, Object[] myValues) {
        this.names = myNames;
        this.values = myValues;
    }


    @Override
    public Object find(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return values[i];
            }
        }
        return null; // non trovato
    }

    /**
    QUESTO METODO è stato creato nella superclasse cosi viene ereditato
     dalla sottoclasse e serve per stampare.
     */
    @Override
    public String toString() {
        return String.format("names: %s - values: %s", Arrays.toString(names), Arrays.toString(values));
    }

    public static void main(String[] args) {
        //accoppia i due array
        String[] myNames = new String[]{"valter", "giacomo", "luisa"};
        Object[] myAges = new Integer[]{55, 24, 54};

        /*
        POLIMORFISMO
            ad una variabile di tipo Lookup assegno una istanza di tipo SimpleLookup
            perchè SimpleLookup implementa Lookup.
            Ho dovuto creare questa classe SimpleLookup perchè l'interfaccia non è istanziabile
            direttamente deve essere implementata da un'altra classe.
         */
        Lookup myLookup = new SimpleLookup(myNames, myAges);

        ProcessValue.processValues(myNames, myLookup);

        SimpleLookupMigliorata c = new SimpleLookupMigliorata(myNames, myAges);

        System.out.println(c);
        c.add("Pippo",100);
        System.out.println(c);
        c.remove("valter");
        System.out.println(c);
        c.remove("walter");
        System.out.println(c);

    }
}
