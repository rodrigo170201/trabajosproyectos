package Practico1;

public class OrdenamientoQuick {

    public OrdenamientoQuick(){

    }
    public void ordenarQuick(int[] arreglo){
        arreglo = secuencia1(arreglo);
    }
    public int[] secuencia1(int[] numeros){
        return secuencia2(numeros,0,numeros.length-1);
    }
    public int[] secuencia2 (int[] num, int izq, int der){
        if (izq>=der){
            return num;
        }
        int gIzq = izq;
        int gDer = der;
        if (izq!=der){
            int referencia ;
            int aux;
            referencia = izq;
            while (izq!=der) {
                while (num[izq] >= num[referencia] && izq < der) {
                    gDer--;
                }
                while (num[izq] < num[referencia] && izq < der) {
                    gIzq++;
                }
                if (der != izq) {
                    aux = num[der];
                    num[der] = num[izq];
                    num[izq] = aux;
                }
                if (der == izq) {
                    secuencia2(num, gIzq, gIzq - 1);
                    secuencia2(num, gIzq + 1, gDer);
                }
                else{
                    return num;
                }
            }
        }
        return num;
    }
}
