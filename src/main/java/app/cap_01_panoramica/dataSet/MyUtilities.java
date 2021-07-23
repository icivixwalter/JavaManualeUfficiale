package app.cap_01_panoramica.dataSet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyUtilities {

    //costanti per i file
    private static final String PATH = "C:\\CASA\\JAVA_PROGETTI\\JAVA_MANUALE_UFFICIALE\\JavaCap01\\src\\main\\java\\app\\cap_01_panoramica\\dataSet\\";

    //setName = parametro nome file e se va tutto bene getDataSet restuisce il double al chiamante
    //throws = il metodo puo sollevare le eccezioni con la clausola throws

    /**
     * LEGGE IL FILE DATI.TXT E RESTITUISCE UNA ARRAY DI DOUBLE
     *
     * @param setName
     * @return
     * @throws BadDataSetException
     */
    public double[] getDataSet(String setName)
            throws BadDataSetException {
        //il nome del file
        String pathfile = PATH + setName;
        FileInputStream in = null;
        try {
            in = new FileInputStream(pathfile);
            return readDataSet(in);

        } catch (IOException myioException) {
            //lancio e da eccezione
            throw new BadDataSetException(pathfile,myioException);

            //la clausola finally viene eseguita per chiudere il file se fosse stato aperto con successo
        } finally {
            try {
                if (in != null)
                    in.close();

                //se si verifica un eccezione con il metodo close essa viene intercettata
                // ma ignorata stiamo a pagina 33 ??
            } catch (IOException e) {
                // IL libro dice a pag 33 di mettere il ; ma qui con la versione nuovo
                //viene omesso
                //ignora i dati sono stati letti con successo o è stata sollevata l'eccezione
                //BadDataSetException

            }
        }
    }

    /** metodo leggi dal file.txt gia preimposta con il metodo .read() che esegue
     *  la lettura carattere per carattere.
    */
    private double[] readDataSet(FileInputStream in) throws IOException {
        //ora non fa nulla
        StringBuilder s = new StringBuilder();
        List<String> lista = new ArrayList<>();
        char appoggio = 0;


        int i = 0;
        int letto_i;
        do {
            letto_i = in.read();
            //casting = (char) trasforma l'intero i char una alla volta come il ciclo do while
            appoggio = (char) letto_i;
            if (appoggio == ',' || letto_i==-1) {
                lista.add(s.toString()); // aggiungo alla lista tutto il numero letto fino alla virgola esclusa (354.3)

                s = new StringBuilder(); // crea un altro StringBuilder
                continue; // salta le virgole
            }
            //aggiunge il carattere alla fine
            s.append(appoggio);
            i++;
            if (i > 100) break;
        }
        while (letto_i != -1); // esce quando EOF

        //stream = tutta la lista salvata con indice
        double[] myDoubles = lista.stream()
                //trasforma ogni stringa indicizzata in double
                .mapToDouble(Double::parseDouble)
                //trasforma lo stream in un array di double
                .toArray();
        return myDoubles;


    }


    public static void main(String[] args) {

        //creo il file
        File file = new File(PATH + "Dati.txt");

        //se il file non esiste lo crea ma se esiste non fa nulla
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //istanzio la variabile local u che crea un rifemento alla classe MyUtilities
        MyUtilities u = new MyUtilities();
        //chiama il metodo con variabile
        try {
            double[] dataSet = u.getDataSet("Dati.txt");
            System.out.println("STAMPA con il for-each per dataset");
            for (double v : dataSet) {
                System.out.println(v);
            }
            // alternativa compatta
            System.out.println("\n ATTENZIONE: stampa alternativa con metodo Arrays.toString() che una " +
                    "classe di utilita per gli arrary ed il risultato su una riga");
            System.out.println(Arrays.toString(dataSet));
        } catch (BadDataSetException e) {
            //stampo l'eccezione
            System.out.println("c'e stato un errore gestito con questo catch");
        }

        System.out.println("ho finito tutto bene senza errori\n\n");
        try {
            u.getDataSet("FileNonEsistente.txt");
        } catch (BadDataSetException e) {
            System.out.println("c'e stato un errore gestito con questo catch\n-----------------------------------------------------");
            System.out.println(e.getNomeDataset());
            System.out.println(e.getEccezioneIO().getMessage());
        }
    }


}