package app.cap_03_estensione_classi;

/**
 * CLASSE CLONABILE MyClass PAG 99
 * per essere clonabile bisogna usare l'interfaccia Cloneable +
 * ridefinendo un metodo pubblico clone.
 * In questo modo è possibile costruire un qualunque oggetto della MyClass
 * in ogni altro punto del codice.
 */
//todo : HerClass non esiste ??
public class MyClass implements Cloneable {
    /**
     * Metodo clone pubblico ridefinito ed in questo caso restituisce
     * una istanza di MyClass non di Object
     * ATTENZIONE a pag. 99 prevedeva Herclass forse è un errore e quindi
     * l'ho tolta da extends.
     */
    public MyClass clone() throws CloneNotSupportedException {
        return (MyClass) super.clone();
    }
    //todo: pag 99....?
}
