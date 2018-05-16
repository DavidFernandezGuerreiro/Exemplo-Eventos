
package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */
public class Evento1 {
    
    // Utilizando unha clase interna.
    
    JFrame marco;
    JPanel panel;
    JButton bAzul,bVermello,bAmarelo;
    
    
    public Evento1(){
        marco=new JFrame(" VENTANA EVENTOS 1 ");
        panel=new JPanel();
        bAzul=new JButton("azul");
        bVermello=new JButton("vermello");
        bAmarelo=new JButton("amarelo");
        
        marco.setSize(400,200);
        panel.add(bAzul);
        panel.add(bVermello);
        panel.add(bAmarelo);
        marco.add(panel);
        PonColor obxColor=new PonColor(); //<--Obxeto de la clase PonColor.
        bAzul.addActionListener(obxColor); //Al boton le ponemos un "escuchador".
        bVermello.addActionListener(obxColor); //Al boton le ponemos un "escuchador".
        bAmarelo.addActionListener(obxColor); //Al boton le ponemos un "escuchador".
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    //CLASE INTERNA:
    public class PonColor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object boton=e.getSource();
            if(boton==bAzul){
                panel.setBackground(Color.blue); //Le damos la acción a bAzul.
            }else if(boton==bVermello){
                panel.setBackground(Color.red); //Le damos la acción a bVermello.
            }else{
                panel.setBackground(Color.yellow); //Le damos la acción a bAmarelo.
            }
        }
    }
}
    

