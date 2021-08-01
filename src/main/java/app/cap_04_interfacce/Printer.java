package app.cap_04_interfacce;
/**
 * CLASSE PRINTER cap. 5.5 Ereditarieta dei tipi innestati pag. 141
 * ESTENDE la classe Device
 */
public class Printer extends Device {

    /* DISPOSITIVO CONCRETO che puo essere esteso come se stesso
        e questo principio vale per le cassli interne che MODELLANO
        le porte  in modo da avere un comportamento specifico. pag 142

     */
    class SerialPort extends Port{
        //......
    }
    //*** SOSTITUITO PAG 143 Port serial = new SerialPort();
    Port serial= createSerialPort();
    protected  Port createSerialPort(){       //METODO crea porta seriale
       return new SerialPort();

    };

}
