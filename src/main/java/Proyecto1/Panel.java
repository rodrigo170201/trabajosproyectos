package Proyecto1;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(){
        setLayout(null);
        setSize(400,400);
        setBackground(Color.green);
    }
    public Panel(int alto, int ancho, Color fondo){
        setSize(alto, ancho);
        setBackground(fondo);
    }
}
