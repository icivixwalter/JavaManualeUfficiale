package app.cap_04_interfacce;

import app.cap_03_estensione_classi.Attr;

import java.util.Iterator;

/**
 * CLASSE ANOMINE INTERNE
 * è stata costruita per l'esempio del par. 5.4 IL QUALE
 * evidenzia di sostituire la classe interna CON UNA CLASSE ANOMINA
 * CHE ESTENDE UNA CLASSE OPPURE IMPLEMENTA UNA INTERFACCIA pag. 140
 */
public class  ClasseAnonimeInterne {

    /*01 viene creato il metodo walkThrough che implementa
    una classe anonima al posto di una classe interna
    //------------------------------------------------------------------------------
    */
    public static Iterator<Object> walkThrough(final Object[] objs) {
        //il metodo non ha un costruttore esplicito
        //la classe anomina viene definita all'interno dell'espressione new
        //new è un supertipo della classe anomina
        //Iterator = invoca il costruttore no-arg della superclasse Object ed è l'unico
        //costruttore che puo essere utilizzato SEMPRE nei casi in cui il TIPO DI UNA CLASSE ANOMINA
        //sia una INTERFACCIA PAG. 141
        /*
        Iterator è una interfaccia e quindi la classe anonima all'inerno di
        walkThrough ESTENDE Object e IMPLEMENTA Iterator.
        DIVIETI: la classe anonima non puo essere dotata di :
            - no clausola extends
            - no implements
            - no modificati e no annotazioni.
            - no costruttore esplicito perche non possono attribuirgli un nome.
            la classe anonima puo essere dotata:
            - SI  di inizializzatori e blocchi di inizializzatori a cui puoi passare
                    parametri logici come argomenti al costruttore. pag 141
        COSTRUTTORE ESPLICITO
            si deve invocare un costruttore esplicito di una superclasse e per risolvere questo
            problema l'espressione NEW = viene scritta come se si dovessere costruire una istanza
            della superclasse.
            ES. la SOTTOCLASSE ANONOMA Attr invoca il costruttore a singolo argomento della classe
            Attr                     */

        Attr name = new Attr("Name") {
            public Object setValue(Object nv) {
                System.out.println("Name set to " + nv);
                return super.setValue(nv);
            }
       };

        //mi ha chiesto un ritorno ho messo null.??
        return null;
    }
    /* RACCOMANDAZIONE = LE CLASSI ANOMINE sono di uso semplice ed immediato, MA POSSONO
       DIVENTARE DIFFICILI DA INTERPRETARE man mano che si innestano in profondita diventanto
       sempre piu indecifrabili, per cui si raccomanda di COSTRUIRE CLASSE ANOMINE  al max
       6 righe di piu diventano indecifrabili.
     */
    //------------------------------------------------------------------------------
}
