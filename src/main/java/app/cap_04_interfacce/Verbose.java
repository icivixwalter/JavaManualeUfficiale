package app.cap_04_interfacce;

/**
 * INTEFACCIA VERBOSE PAG 117
 */
public interface Verbose {
    //4 COSTANTI
    int SILENT      = 0;
    int TERSE       = 1;
    int NORMAL      = 2;
    int VERBOSE     = 3;
    void setVerbose (int level);
    int getVerbose ();
}
