package app.cap_03_estensione_classi;

/**
 * CLASSE SORTMETRICS PAG 107
 * oggetti che descrino IL COSTO delle operazioni di ordinamento ed il suo
 * scopo è quello di COMUNICARE I DATI che non vengono nascoti MA VENGONO FORNITI
 * IN COPIA in modo da escludere qualsiasi riferimento ai suo dati interni.
 */
final public class SortMetrics implements Cloneable {
    public long probeCnt,       //test semplici dei dati
            compareCnt,     //confronti tra due elementi
            swapCnt;        //scambi di due elementi.

    //metodo INIT
    public void init() {
         probeCnt =swapCnt = compareCnt;

    }

    public String toString() {
        return probeCnt + " probes " +
               compareCnt + " compares " +
               swapCnt + " swaps";
    }

    /*
    questa classe supporta clone
     */
    public SortMetrics clone (){
        try {
            //esegue il meccanismo di defalut
            return (SortMetrics) super.clone();
            } catch (CloneNotSupportedException e){
            //non puo succedere : thi e Object vengono entrambi clonati
            throw new InternalError(e.toString());

        }
    }
}
