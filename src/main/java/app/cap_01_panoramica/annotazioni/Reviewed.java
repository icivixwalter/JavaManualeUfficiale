package app.cap_01_panoramica.annotazioni;

/**
 * ANNOTAZIONE pag 34
  * simile ad interfacce e destinata all'analisi automatica.
 */
 public @interface Reviewed {
     //nome di chi fa l'annotazione
     String reviewer();
    //la data
     int date();

}


