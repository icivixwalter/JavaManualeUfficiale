package app.cap_03_estensione_classi;

/**
 * CLASSE STACK DI INTERI
 * crea una pila di oggetti ed implementa clone
 */
public class IntegerStack implements Cloneable { //pericoloso
    private int[] buffer;
    /*
    todo: perche non si deve copiare top ??
    pag 102 non si capisce ???
    */
    private int top;

    //Costruttore??
    public IntegerStack(int maxContents) {
        buffer = new int[maxContents];
        top = -1;
        //TODO: pag 101 SI DEVONO METTERE NEL COSTRUTTORE ?
        IntegerStack first= new IntegerStack(2);
        first.push(2);
        first.push(9);
        IntegerStack second= first.clone();
    }

    //metodo push
    public void push(int val) {
        buffer[++top] = val;
    }

    //metodo pop
    public int pop() {
        return buffer[top--];
    }

    //METODO CLONE ridefinito pubblico
    public IntegerStack clone (){
        try {
            /*clona la super classe
            metodo clone ridefinito vedi pag. 101; ed im metodo clone INVOCA super.clone()
            quindi invoca il metodo della superclasse per gestire  oggetti condivisi.
            super.clone = invoca il METODO Object.clone che cra un oggetto di tipo corretto;
            non puo essere utilizzato new perchè è scorretto per gli oggetti che estendono IntegerStack
            mentre se utiizziamo super.clone = creiamo un RIFERIMENTO ad un oggetto di IntegerStack e quindi
            è il metodo Object.clone che restituisce questo riferimento. pag 102
            */
            IntegerStack nObj = (IntegerStack) super.clone();
            nObj.buffer= buffer.clone();
                        //return (IntegerStack) super.clone();
            return nObj;


        }   //eccezione non clonabile
            catch (CloneNotSupportedException e){
            //Non puo succedere ... supportiamo clone
                throw new InternalError(e.toString());

        }

    }
}
