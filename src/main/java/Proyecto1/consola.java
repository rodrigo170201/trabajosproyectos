package Proyecto1;
import java.util.Random;
import java.util.Scanner;
public class consola {
    public static void main(String[] args) {
        /*int n;
        int[] arreglo;
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola mundo");
        System.out.println("Ingrese el tamaño de su arreglo");

        n = leer.nextInt();
        if (n==0){
            System.out.println("Arreglo vacío");
        }
        while (n<0 || n>10){
            System.out.println("Ingrese el tamaño de su arreglo");
            n = leer.nextInt();
            }
        Random random = new Random();
        arreglo = new int[n];
        System.out.println("El tamaño de mi arreglo es: "+arreglo.length+"");
        for (int i=0; i<arreglo.length;i++) {
            arreglo[i] = random.nextInt(10,50);
            System.out.print(arreglo[i] + " -  ");
        }
        System.out.println("");
        insercionDirecta(arreglo);
        //bubbleSort(arreglo);
        mostrarBubble(arreglo);
        //mostrarInsercion(arreglo);*/
        Ventana n = new Ventana();
    }
    public static void insercionDirecta(int[] arreglo){
        int auxi;
        int cont1;
        int cont2;
        for (cont1=1;cont1< arreglo.length;cont1++){
            auxi = arreglo[cont1];
            for (cont2=cont1-1;cont2>=0 && arreglo[cont2]>auxi;cont2--){
                arreglo[cont2+1]=arreglo[cont2];
                arreglo[cont2]=auxi;
            }
        }
    }

    public static void mostrarBubble(int[] s){
        for (int i=0;i<s.length;i++){
            System.out.print(s[i] + " - ");
        }
    }
     public static void bubbleSort(int [] arreglo){
         int aux;
         boolean cambio = false;
         while (true){
             cambio=false;
             for (int i=1;i<arreglo.length;i++){
                 if (arreglo[i]<arreglo[i-1]){
                     aux = arreglo[i];
                     arreglo[i]=arreglo[i-1];
                     arreglo[i-1]=aux;
                     cambio=true;
                 }
             }
             if (cambio==false){
                 break;
             }
         }
     }
}
