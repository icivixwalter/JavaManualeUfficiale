package app.cap_03_estensione_classi;

/**
 * CLASSE SIMPLE SORTDOUBLE PAG 108
 * che estende SortDouble
 */
public class SimpleSortDouble extends SortDouble {
    protected void doSort(){
        for (int i = 0; i < getDataLenght(); i++){
            for (int j= i+1; j <getDataLenght(); j++){
                if (compare(i,j)>0 )
                        swap (i,j);
            }
        }
    }
}
