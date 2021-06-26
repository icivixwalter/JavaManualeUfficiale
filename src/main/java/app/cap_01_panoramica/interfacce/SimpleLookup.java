package app.cap_01_panoramica.interfacce;

/**
 * CLASSE CHE IMPLEMENTA UN CONTRATTO INTERFACCIA
 * che in questo caso Lookup.
 *
 * è una struttura dati che contiene nomi e valori, tipo un dizionario su cui è
 * possibile cercare i valori attraverso i nomi.
 */
class SimpleLookup implements Lookup {

    private String[] names;
    private Object[] values;

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
    }
}
