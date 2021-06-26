package app.cap_01_panoramica.deck;

/**
 * classe con ARRAY
 */

public class Deck {
    public static final int DECK_SIZE = 52;
    /*cards = dichiarato privato ed array [] per far riferimento a tutte le carte
     con le [] si ha una array di oggetti.
     pag. 18 da errore CArd o Dek
    * */
    private Card[] cards = new Card[DECK_SIZE];

    public void print() {
        for (int i = 0; i < cards.length; i++)
            System.out.println(cards[i]);
    }

    /**
     * METODO average
     * media dei valori pag 19
     */
    static double average(int[] values) {
        /**
         * I° controllo se l'arrya è null
         * ma per fare il doppio controllo sia = null o lunghezza zero occorre utilizza  OR conzionale
         * if (values==null :: values.length ==0)
         * OR CONDIZIONALE il pipe ||
         */
        if (values == null || values.length == 0)

            throw new IllegalArgumentException();

        if (values == null)
            throw new IllegalArgumentException();
        else {
            double sum = 0.0;
            //II controllo della lunghezza ARRAY  è fuori indice: lunghezza -1
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return sum / values.length;
        }
    }
}
