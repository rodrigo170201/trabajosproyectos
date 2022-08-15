package Practico1;

import javax.swing.*;
import java.util.Random;

public class Ventana extends JFrame {
    private JTextField txtTamaño = new JTextField();
    private JButton btnIniciar = new JButton("Iniciar");
    private OrdenamientoInsercion ordenInsercion = new OrdenamientoInsercion();
    private OrdenamientoBubble ordenBubble = new OrdenamientoBubble();
    private Random random = new Random();
    private long[] arreglo;
    private int tamaño;
    public Ventana(){
        setTitle("Practico 1");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        cargarElementos();
        setVisible(true);
        btnIniciar.addActionListener(e -> {
            long limite =50;
            long inicio =10;
            tamaño = Integer.parseInt(txtTamaño.getText());
            arreglo = new long[tamaño];
            if (tamaño<inicio || tamaño>limite){
                JOptionPane.showMessageDialog(null, "Ingrese un número entre "+ inicio + " y "+ limite);
            }else {
                asignandoValores(arreglo,random);
                mostrarArreglo(arreglo);
                System.out.println("");
                //ordenInsercion.ordenandoInsercion(arreglo);
                ordenBubble.ordenandoBubble(arreglo);
                mostrarArreglo(arreglo);
            }
        });
    }

    public void cargarElementos(){
        setLayout(null);
        txtTamaño.setBounds(50,110,80,20);
        btnIniciar.setBounds(150,110,70,20);
        add(txtTamaño);
        add(btnIniciar);
    }
    public static void asignandoValores(long [] a, Random aleatorio){
        for (int i=0;i<a.length;i++){
            a[i] = aleatorio.nextInt(100,300);
        }
    }
    public static void mostrarArreglo(long [] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " - ");
        }
    }

}
