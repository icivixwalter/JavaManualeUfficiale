package app.cap_01_panoramica;

public class Fibonacci {
    /**
     * sequenza fibonacci max 50
     * <p>
     * modiche MAX
     */
    private static final int MAX = 50;  //COSTANTE DENOMINATA = max valore di fibonacci
    private static final int MAX_INDEX = 9;  //COSTANTE DENOMINATA numero massimo di valori

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci_01();

        System.out.println("\n\n");
        System.out.println("fibonacci con for");

        fibonacci.fibonacci_02();

        System.out.println("\n\n");
        System.out.println("fibonacci al contrario");
        System.out.println("------------------\n\n");

        fibonacci.fibonacci_contrario();
    }

    public void fibonacci_01() {
        int lo = 1;
        int hi = 1;
        System.out.println(lo);
        //SEQUENZA CON WHILE
        while (hi < MAX) {
            System.out.println(hi);
            hi = lo + hi; //il nuovo hi
            lo = hi - lo; //la somma  - il vecchio lo
            //che in precedenza era il vecchio hi

        }
    }


    public void fibonacci_02() {
        long lo = 1;
        long hi = 1;

        //SEQUENZA CON IL CICLO FOR pag. 10
        String mark_s;

        for (int i = 2; i <= MAX_INDEX; i++) {
            if (hi % 2 == 0) {
                mark_s = " *";
            } else {
                mark_s = "";
            }
            System.out.println(i + ": " + hi + mark_s);
            hi = lo + hi; //il nuovo hi
            lo = hi - lo; //la somma  - il vecchio lo
            //che in precedenza era il vecchio hi
        }
    }

    public void fibonacci_contrario(){
        long lo = 1;
        long hi = 1;

        //SEQUENZA CON IL CICLO FOR pag. 10
        String mark_s;

        for (int i = MAX_INDEX; i >= 2; i--) {
            if (hi % 2 == 0) {
                mark_s = " *";
            } else {
                mark_s = "";
            }
            System.out.println(i + ": " + hi + mark_s);
            hi = lo + hi; //il nuovo hi
            lo = hi - lo; //la somma  - il vecchio lo
            //che in precedenza era il vecchio hi
        }
    }
}
