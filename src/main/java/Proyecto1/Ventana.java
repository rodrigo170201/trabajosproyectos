package Proyecto1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ventana extends JFrame {
    private Panel menuInicio = new Panel();
    private Panel operaciones = new Panel(400,400, Color.green);
    private JMenuBar menu = new JMenuBar();
    private JMenuItem inicio = new JMenuItem("inicio");
    //Elementos del primer panel
    private JButton btnInicio = new JButton("Iniciar");
    //Elementos del segundo panel
    private JTextField txttamaño = new JTextField();
    private JTextField txtArreglo = new JTextField();
    private JTextField txtInsercion = new JTextField();
    private JTextField txtBubble = new JTextField();
    private OrdenInsercion ordenandoInser = new OrdenInsercion();
    private JTextField txtQuick = new JTextField();
    private JButton btnArreglo = new JButton("Añadir");
    private Random random = new Random();
    private int[] arreglo;
    private int tamaño;

    public Ventana(){
        setTitle("Proyecto 1");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        cargarElementos();
        menuInicio.setVisible(true);
        btnInicio.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Funciona");
        });
        btnArreglo.addActionListener(e -> {
            int limite=50;
            int limiteInicial=10;
            tamaño = Integer.parseInt(txttamaño.getText());
            arreglo = new int[tamaño];
            if (tamaño<limiteInicial || tamaño>limite){
                JOptionPane.showMessageDialog(null,"Ingrese un número entre "+ limiteInicial + " y "+ limite);
                txttamaño.setText("");
            }else {
                asignandoValores(arreglo, random);
                mostrarArreglo(txtArreglo,arreglo);
                ordenandoInser.ordenamientoInsercion(arreglo);
                ordenandoInser.mostrarInsercion(txtInsercion,arreglo);
            }
        });
    }
    public void cargarElementos(){
        setLayout(null);
        añadiendoElementosMenuOperaciones();
    }
    public void añadiendoElementosMenuInicio(){
        //Definiendo la posicion
        btnInicio.setBounds(50,50,100,20);
        //añadiendo al jframe
        add(btnInicio);

    }
    public void añadiendoElementosMenuOperaciones(){

        //Definiendo la posicion
        txttamaño.setBounds(150,100,100,20);
        txtArreglo.setBounds(10,10,460,80);
        btnArreglo.setBounds(270,100,80,20);
        txtInsercion.setBounds(10,150,460,40);
        txtBubble.setBounds(10,200,460,40);
        txtArreglo.setEditable(false);
        txtInsercion.setEditable(false);
        txtBubble.setEditable(false);
        //añadiendo al jframe
        add(txttamaño);
        add(txtArreglo);
        add(btnArreglo);
        add(txtInsercion);
        add(txtBubble);
    }
    public static void asignandoValores(int[] a,Random aleatorio){
        for (int i=0;i<a.length;i++){
            a[i]= aleatorio.nextInt(100,300);
        }
    }
    public static void mostrarArreglo(JTextField espacio, int[] s){
        String numeros="";
        for (int i=0;i<s.length;i++){
            //System.out.print(s[i] + " - ");
            numeros+=s[i] + " - ";
            /*if (numeros.length() >= 460){
                numeros+=s.length +"\n";
            }*/
        }
        //System.out.print(numeros+"\n");
        espacio.setText(numeros);
    }
    public static void ordenamientoInsercion(int[] a){
        int aux;
        int cont1;
        int cont2;
        for (cont1=1;cont1<a.length;cont1++){
            aux = a[cont1];
            for (cont2=cont1-1;cont2>=0 && a[cont2]>aux;cont2--){
                a[cont2+1]=a[cont2];
                a[cont2]=aux;
            }
        }
    }
    public static void ordenamientoBubble(int[] a){
        int aux;
        boolean cambia=false;
        while (true){
            cambia=false;
            for (int i=1;i< a.length;i++){
                if (a[i]<a[i-1]){
                    aux=a[i];
                    a[i]=a[i-1];
                    a[i-1]=aux;
                    cambia=true;
                }
            }
            if (cambia==false){
                break;
            }
        }
    }
}
