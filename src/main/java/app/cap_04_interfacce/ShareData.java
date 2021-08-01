package app.cap_04_interfacce;

/**
 * INTERFACCIA SHARE DATA del par. 5.6.1 = variabili modificabili
 * all'interno dell'interfacce.
 */
public interface ShareData {
    //creo una classe innestata Data che conterra dati modificabili
    class Data {
        //campi + metodi
        private int x = 0;

        public int getX() {          //I metodo ritorna x
            return x;
        }

        public void setX(int newX) {  //II metodo imposta la x con il parametro ricevuto
            x = newX;
        }
    }

    /* imposta un nuovo oggetto data, e una classe che vorrebbe o
       - implementare
       - utilizzare
        ShareData condivide uno stato comune sfruttando un riferimento
        data.     */
    Data data = new Data();     //riferimento all'oggetto data

}
