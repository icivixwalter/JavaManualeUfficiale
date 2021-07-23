package app.cap_04_interfacce;

import app.cap_03_estensione_classi.Attr;

import java.util.*;


/**
 * CLASSE ATTRIBUTED IMP 1
 * PAG 124
 * tale classe utilizza LE CLASSI DI UTILITA = java.until.HashMap
 * e quindi utilizza una Hasmap
 * ATTENZIONE vengono impletate 2 interfacce Attributed, Iterable <Attr> = itera solo su vari
 * elementi Attr
 */
public class AttributedImpl implements Attributed, Iterable<Attr> {
    //attrTable= campo MAP (hasmap) String = chiave -> Attr = è un valore es. Walter, 3 + Giacomo, 5
    protected Map<String, Attr> attrTable = new HashMap<String, Attr>();

    //metodo add di Attributed
    public void add(Attr newAttr) {
        attrTable.put(newAttr.getName(), newAttr);
    }

    //metodo find di Attributed
    public Attr find (String name) {
        return attrTable.get(name);
    }


    //metodo remove di Attributed
    public Attr remove(String name) {
        return attrTable.remove(name);
    }

    //METODO attrs di Attributed
    public Iterator <Attr> attrs () {
        return attrTable.values().iterator();
    }
    //METODO della Interfaccia Iterable che richiama quello sopra attrs
    public Iterator <Attr>  iterator () {
        return attrs();
    }


}

