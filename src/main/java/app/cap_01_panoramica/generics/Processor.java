package app.cap_01_panoramica.generics;


/**
 * CLASSE CHE PROCESSA INTERI ARRAY DI NOMI.
 * stampa solo i valori.
 *
 */

class Processor {
    //costruttore senza parametri
    public Processor (){

    }


    /**
     * METODO SENZA S = processa un singolo valore.
     * solo 1 azione per chiamata.
     *
     * @param name
     * @param value
     */
    private void processValue(String name, Object value) {
        System.out.println("name = " + name + ", value = " + value);
    }


    /**
     * METODO CON LA S (plurale) = PROCESSI TUTTI I VALORI DELL'ARRAY PASSATO
     * <p>
     * METODO PROCESSVALUES che implementa dati generici con ?
     * e tabel = è una istanza della look up
     * <? extends Number> table = il '?' è un segnaposto illiminato ma con extends x il segnaposto è limitato
     * solo alla classe Number (e le sottoclassi incluse  Integer + Double ecc..)
     */
    public void processValues(String[] names, IGenericLookup<? extends Number> table) {
        for (int i = 0; i < names.length; i++) {
            Object value = table.find(names[i]);
            if (value != null)
                processValue(names[i], value);
        }
    }

}

