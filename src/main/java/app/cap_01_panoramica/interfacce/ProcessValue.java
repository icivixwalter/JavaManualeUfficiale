package app.cap_01_panoramica.interfacce;

/**
 * CLASSE CHE CERCA E PROCESSA I VALORI
 * il processamento è una semplice stampa.
 */
public class ProcessValue {
    //è utilizzabile solo nel package corrente perhè non c'è ne public ne private ne protected
    static void processValues(String[] names, Lookup table) {
        //ciclo for che cerca i nomi passati come parametro uno per uno  e processa i valori
        for (int i = 0; i < names.length; i++) {
            //cerca con Lookup (SimpleLookup) il nome corrispondente all' indice i e salva il valore in value
            Object value = table.find(names[i]);
            if (value != null)
                processValue(names[i], value);
        }
    }

    private static void processValue(String name, Object value){
        System.out.println("" + name + " ha " + value + " anni");
    }


}
