package Practico1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Ventana extends JFrame {
    private static final Logger logger = LogManager.getLogger(Ventana.class);
    private JTextField txtTamaño = new JTextField();
    private JButton btnIniciar = new JButton("Iniciar");
    private OrdenamientoInsercion ordenInsercion = new OrdenamientoInsercion();
    private OrdenamientoBubble ordenBubble = new OrdenamientoBubble();
    private OrdenamientoQuick ordenQuick = new OrdenamientoQuick();
    private Random random = new Random();
    private int[] arreglo;
    private int[] arregloAux;
    private int[] arregloAux2;
    private int tamaño;

    private Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ordenBubble.getClass();
        }
    });
    public Ventana(){
        timer.start();
        setTitle("Practico 1");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        cargarElementos();
        setVisible(true);
        btnIniciar.addActionListener(e -> {
            long limite =1000000;
            long inicio =10000;
            tamaño = Integer.parseInt(txtTamaño.getText());
            arreglo = new int[tamaño];
            if (tamaño<inicio || tamaño>limite){
                JOptionPane.showMessageDialog(null, "Ingrese un número entre "+ inicio + " y "+ limite);
            }else {
                asignandoValores(arreglo,random);
                arregloAux = arreglo;
                mostrarArreglo(arreglo);
                System.out.println("");
                ordenInsercion.ordenandoInsercion(arreglo);
                ordenBubble.ordenandoBubble(arregloAux);
                //ordenQuick.ordenarQuick(arregloAux);
                mostrarArreglo(arreglo);
                System.out.println("");
                mostrarArreglo(arregloAux);
                timer.stop();
                System.out.println(timer.getDelay());
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
    public static void asignandoValores(int[] a, Random aleatorio){
        for (int i=0;i<a.length;i++){
            a[i] = aleatorio.nextInt(0,100000);
        }
    }
    public static void mostrarArreglo(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + " - ");
        }
    }

}
