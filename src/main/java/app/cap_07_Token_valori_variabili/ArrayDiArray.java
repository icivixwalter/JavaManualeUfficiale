package app.cap_07_Token_valori_variabili;

/**
 * ARRAY DI ARRAY PAG 170
 * creato per l'esenmpio di array in array
 */
public class ArrayDiArray {
    /**
     * inizializza Matrice array con il doppio
     * ciclo for in quanto array di array
     *
     * @param mat
     */
    //firma del metodo
    private static void setupMatrix(float[][] mat) {
        //I dimensione
        int i = 0;
        for (int riga = 0; riga < mat.length; riga++) {
            //II dimensione x = riga
            for (int colonna = 0; colonna < mat[riga].length; colonna++)
                mat[riga][colonna] = i++;
        }
    }

    /* LA PRIMA DIMENSIONE a sx deve essere specificata al momento
    della creazione dell'array; altre dimensioni possono essere specificate
    in un secondo momento pag 170.
    ARRAY INNESTATO  puo avere lunghezza diversa oppure creare ad es.
    4 array di int ognuno con lunghezza diversa sufficiente a contenere
    dati specifici.
    //TODO : PERCHE DA ERRORI??
     */
    //da errori xhe non si trova in un metodo ??
    public static void metodoArray2d() {
        // alloca la memoria per l'array bidimensionale
        float[][] mat = new float[4][4];
        setupMatrix(mat);

        for (int y = 0; y < mat.length; y++) {
            System.out.print("[ ");
            for (int x = 0; x < mat[y].length; x++) {
                System.out.print(mat[y][x] + " ");
            }
            System.out.println(" ]");
        }
    }

    public static void main(String[] args) {
        metodoArray2d();
    }
}
