package app.cap_04_interfacce;

/**
 * classe UNRELATE costruita per es. pag 135
 * estende O
 */
public class  Unrelated extends Outer.Inner{

    /*  QUANDO OCCORRE UN RIFERIMENTO ESPLICITO ALL'OGGETTO OUTER :
        pag. 135
            A) NEL CASO DI UNA CLASSE CONTENITRICE che ha una classe interna CHE NON E' OUTER
            oppure
            B) LA SOTTOCOLASSE INTERNA non è una sottoclasse interna
        in questo caso occorre offrire al costruttore di Inner quando invocato con super, UN
        RIFERIMENTO ESPLICITIO ad un oggetto Outer;
        esempio con Unreleated
            */
        /* Unrelated NON E' UNA CLASSE INTERNA  E NON E' SOTTOCLASSE DI OUTER,
           e quindi Unlelate non puo essere un  oggetto contenitore valido per Outer, per
           cui OCCORRE UN RIFERIMENTO ESPLICITO AL COSTRUTTORE di Outer
           con l'oggetto della super classe:
            ref.super = fai riferimento esplicito al costruttore di Inner un per arrivare
            all'oggetto Outer.
         */
       Unrelated (Outer ref) {
            //chiamo il costruttore con super pag. 135.
            ref.super();
        }
}
