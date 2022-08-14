package Proyecto1;

import javax.swing.*;

public class Ventana extends JFrame {
    private Panel menuInicio = new Panel();
    private Panel operaciones = new Panel();
    private JMenuBar menu = new JMenuBar();
    private JMenuItem inicio = new JMenuItem("inicio");
    //Elementos del primer panel
    private JButton btnInicio = new JButton("Iniciar");
    //Elementos del segundo panel
    private JTextField txttamaño = new JTextField();
    public Ventana(){
        setTitle("Proyecto 1");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        cargarElementos();
        añadiendoElementosMenuInicio();
        menuInicio.setVisible(true);
        btnInicio.addActionListener(e -> {
            menuInicio.setVisible(false);
            añadiendoElementosMenuOperaciones();
            operaciones.setVisible(true);

            JOptionPane.showMessageDialog(null,"Funciona");
        });
    }

    public void cargarElementos(){
        setLayout(null);
        menu.add(inicio);
        add(menu);

    }
    public void añadiendoElementosMenuInicio(){
        //Definiendo la posicion
        btnInicio.setBounds(50,50,100,20);
        //añadiendo al jframe
        add(btnInicio);

    }
    public void añadiendoElementosMenuOperaciones(){
        //Definiendo la posicion
        txttamaño.setBounds(50,50,100,20);
        //añadiendo al jframe
        operaciones.add(txttamaño);
    }


}
