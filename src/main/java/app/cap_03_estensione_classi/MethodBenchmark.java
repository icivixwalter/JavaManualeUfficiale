package app.cap_03_estensione_classi;

/**
 * METODO BENCHMARk ESTENSIONE PAG 95
 * questa classe misura il tempo necessario a invocare un
 * metodo benchmark vuoto unitamente all'overhead richiesto ad ogni ciclo.
 * ho corretto l'errore perche non avevo messo extends Benchmark che serve
 * ad ereditare tutti i metodi e campi dei Benchmark compreso repeat()
 */
public class MethodBenchmark extends Benchmark{
    //Non esegue niente rientra immediamente
    void benchmark() {
    }

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        //metodo ereditato dalla superclasse Benchmark
        long time = new MethodBenchmark().repeat(count);
        System.out.println(count + " methods in " +
                time + " nanoseconds");
    }

}
