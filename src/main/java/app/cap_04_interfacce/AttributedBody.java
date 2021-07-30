package app.cap_04_interfacce;

import app.cap_02_classi_e_oggetti.Body;
import app.cap_03_estensione_classi.Attr;

import java.util.Iterator;

/**
 * CLASSE ATTRIBUTED BODY PAG 125
 * Dichiarazione = extends Body con la quale estendi Body +
 * implements Attributed = implementi l'interfaccia attributed
 * cosituisce il CONTRATTO di  AttributedBody
 */
//todo: esercizi 4.1, 4.2, 4.3, 4.4, 4.5, 4.6
public class AttributedBody extends Body implements Attributed {
    private AttributedImp1 attImp1 = new AttributedImp1();

    public AttributedBody() {
        super();
    }

    public AttributedBody(String name, Body orbits) {
        super(name, orbits);
    }

    /*reindirizza tutti i metodi Attributed all'oggetto attrImp1
    Ogni metodo Attributed viene  implementatpo, reindirizzando l'invocazione
    al metodo equivalente dell'oggetto AttributedImp1.
    Pag 126 = il reindirizzamente è un meccanismo immediato e meno dipsendioso
    dell'implementazione da zero dell'interfaccia Attributed con possibilita di
    cambiare velocmente l'implementazione  quando fosse possibile una migliore
    implementazione di Attributed.
        */
    public void add(Attr newAttr) {
        attImp1.add(newAttr);
    }

    public Attr find(String name) {
        return attImp1.find(name);
    }

    public Attr remove(String name) {
        return attImp1.remove(name);
    }

    public Iterator<Attr> attrs() {
        return attImp1.attrs();
    }
}

