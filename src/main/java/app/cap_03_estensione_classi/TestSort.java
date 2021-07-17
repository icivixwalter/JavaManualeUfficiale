package app.cap_03_estensione_classi;

/**
 * CLASSE TEST SORT PAG 109
 * Testa gli algoritmi di ordinamento
 * il main attiva il test che funziona cosi:
 *      - crea un oggetto della classe estesa SortDouble
 *      - fornisce i dati ed invoca sort
 *      - il metodo sort inizializza i dati e fornisce la metrica ed invoca il metodo astrato doSort.
 */
public class TestSort {
    static double[] testData ={
            0.3, 1.3e-2, 7.9, 3.17
    };

    public static void main(String[] args) {
        SortDouble bsort = new SimpleSortDouble(); /* crea un'oggetto della classe estesa  SortDouble
            gli fornisce i dati e invoca sort */
        /* il metodo sort invocato dalla classe estesa SortDouble  memorizza i dati inizializza la metrica
        * ed  invoca il metodo astratto  doSort */
        SortMetrics metrics = bsort.sort(testData);

        System.out.println("Metrics: " + metrics);

        for (int i = 0; i<testData.length; i++){
            System.out.println("\t"+ testData[i]);
        }
    }
}
