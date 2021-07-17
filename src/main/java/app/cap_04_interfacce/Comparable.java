package app.cap_04_interfacce;

/**
 * INTERFACCIA COMPARABLE PAG 114
 */
public interface Comparable <T> {
    /* metodo interface ha un solo
    argomento ed un solo oggetto di tipo T e lo confronta con  l'oggetto
    corrente di tipo T; restituisce
    - 1 = se l'oggetto corrente è minore
    0   = se uguale
    + 1 =  maggiore dell'oggetto passato come parametro
     *
     *
     *
     */
    int compareTo (T obj);
}
