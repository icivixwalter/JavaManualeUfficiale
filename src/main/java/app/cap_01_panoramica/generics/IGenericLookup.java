package app.cap_01_panoramica.generics;

/**
 * INTERFACCIA INTEGERLOOKUP pag 30
 * era la LookUp modificata per creare una intefaccia generica
 * restituisce una parametro Generico di tipo T
 * <p>
 * Struttura dati su cui si puo cercare un elemento e riceve un parametro
 * T = tipo generico (classe, interfaccia, Numeric
 */
public interface IGenericLookup<T> {
    T find(String name);

}


