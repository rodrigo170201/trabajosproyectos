package Practico1;

import Proyecto1.OrdenInsercion;

public class OrdenamientoInsercion {
    public OrdenamientoInsercion(){

    }
    public static void ordenandoInsercion(long[] ins){
        long aux;
        int cont1;
        int cont2;
        for (cont1=1;cont1<ins.length;cont1++){
            aux = ins[cont1];
            for (cont2=cont1-1;cont2>=0 && ins[cont2]>aux;cont2--){
                ins[cont2+1]=ins[cont2];
                ins[cont2]=aux;
            }
        }
    }
    public static void mostrarInsercion(){

    }
}
