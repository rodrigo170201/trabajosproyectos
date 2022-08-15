package Proyecto1;

import javax.swing.*;

public class OrdenInsercion {
    int[] a;
    public OrdenInsercion(){

    }
    public OrdenInsercion(int[] a) {
        this.a = a;
    }
    public static void ordenamientoInsercion(int[] s){
        int aux;
        int cont1;
        int cont2;
        for (cont1=1;cont1<s.length;cont1++){
            aux = s[cont1];
            for (cont2=cont1-1;cont2>=0 && s[cont2]>aux;cont2--){
                s[cont2-1] = s[cont2];
                s[cont2] = aux;
            }
        }
    }
    public static void mostrarInsercion(JTextField espacio, int[] s){
        String numeros = "";
        for (int i=0;i<s.length;i++){
            numeros+=s[i] + " - ";
        }
        espacio.setText(numeros);
    }

}
