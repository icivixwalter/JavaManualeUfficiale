package app.cap_03_estensione_classi;

import app.cap_02_classi_e_oggetti.esercizi.Esercizio;

/**
 * BENCH MARK PAG 95
 * abstract sia classe che il metodo
 */
//todo: esercizio da fare
@Esercizio(nro = "3.6", pag = 96) // scrivere una nuova classe estesa...
public abstract class Benchmark {
    //metodo astratto deve essere implementato da ogni sottoclasse
    // ed ecco perchè ha solo una dichiarazione ma nessuna implmentazione pag 95
    abstract void benchmark();
    /* metodo repeat
    * misura il tempo necessario per eseguire benchmark in base a count
    */

    //todo: esercizio da fare
    @Esercizio(nro = "3.7", pag = 96) // modificare la classe veicolo ...
    public final long repeat (int count){
        long start = System.nanoTime();
        for (int i = 0; i < count; i++)
                benchmark();
        return (System.nanoTime()-start);
    }
}
