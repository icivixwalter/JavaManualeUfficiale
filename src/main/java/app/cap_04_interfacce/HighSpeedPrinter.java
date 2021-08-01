package app.cap_04_interfacce;
/**
 * CLASSE HIGH SPEED PRINTER cap. 5.5 Ereditarieta dei tipi innestati pag. 141
 * DEVE RIDEFINIRE la CLASSE PRINTER in modo che :
 *      il campo serial
 * FACCIA RIFERIMENTO ALL'OGGETTO CORRETTO
 */
public class HighSpeedPrinter extends Printer {
    /*
    ATTENZIONE la classe PRINTER NON VIENE INFLUENZATA dalla
        sottoclasse SerialPort definita all'interno di HighSpeedPrinter e
        nemmeno dalla nuova sottoclasse
     */
    /* CLASSE INTERNA SPECIALIZZATA SerialPort
     che ridefinisce il metodo di costruzione in modo da ottenere un'istanza della
     classe.
     quindi viene cambiato il nome per evitare l'adombramento da
        SerialPort ---> EnhancedSerialPort
    INIZIALIZZAZIONI all'interno di printer inoltre il metodo della sottoclasse EnhancedSerialPort
            ----> createSerialPort ()
            viene invocato PRIMA che l'oggetto della sottoclasse sia completamente costruito,
            con il rischio che se ci fossero de campi da inizializzare che appartengono alla
            super classe HighSpeedPrinter quest'ultimi avrebbero un valore di default quindi
            bisogna fare attenzione..
     */
    class EnhancedSerialPort extends SerialPort{
        //.... qui non ci sono campi di HighSpeedPrinter da inizializzare perchè darebbero problemi
        // in quanto avrebbero un valore di default quindi rischioso... pag 143
    }
        protected Port createSerialPort() { //metodo che restituisce un'istanza di EnhancedSerialPort
        return new EnhancedSerialPort();
    }
}
