package app.cap_02_classi_e_oggetti;

/**
 * CLASSE  PASSAGGIO PARAMETRI PAG 60
 */

public class PassByValue {
    public static  void halveIt (double arg){
        arg /= 2.0; //divide arg per due
        System.out.println("halved: arg = " + arg);
    }

    //MAIN
    //____________________________________________________________________________//
    public static void main(String[] args) {
        double one=1.0;
        System.out.println("before: one = "+ one);
        halveIt(one);
        System.out.println("after: one = "+ one);

    }
    //____________________________________________________________________________//

}
