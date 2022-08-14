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
    private JTextField txtBubble = new JTextField();
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
        //añadiendoElementosMenuInicio();
        //añadiendoElementosMenuOperaciones();
        menuInicio.setVisible(true);
        btnInicio.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Funciona");
        });
        btnArreglo.addActionListener(e -> {
            tamaño = Integer.parseInt(txttamaño.getText());
            arreglo = new int[tamaño];
            if (tamaño<10 || tamaño>20){
                JOptionPane.showMessageDialog(null,"Ingrese un número entre 10 y 20");
                txttamaño.setText("");
            }else {
                //System.out.print(arreglo.length);
                //txtBubble.setText(arreglo.length + "");
                asignandoValores(arreglo, random);
                mostrarArreglo(txtBubble,arreglo);
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
        boolean editable=false;
        //Definiendo la posicion
        txttamaño.setBounds(150,100,100,20);
        txtBubble.setBounds(10,10,400,40);
        btnArreglo.setBounds(270,100,80,20);
        txtBubble.setEditable(editable);
        //añadiendo al jframe
        add(txttamaño);
        add(txtBubble);
        add(btnArreglo);
    }
    public static void asignandoValores(int[] a,Random aleatorio){
        for (int i=0;i<a.length;i++){
            a[i]= aleatorio.nextInt(0,20);
        }
    }
    public static void mostrarArreglo(JTextField espacio, int[] s){
        String numeros="";
        for (int i=0;i<s.length;i++){
            //System.out.print(s[i] + " - ");
            numeros+=s[i] + " - ";
        }
        System.out.print(numeros);
        espacio.setText(numeros);
    }


}
