import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Terminos extends JFrame implements ActionListener, ChangeListener{

  private JLabel  label1,label2;
  private JTextArea textarea1;
  private JButton boton1, boton2;
  private JCheckBox box1;
  private JScrollPane scroll1;
  String Nombre2 = "";
 

  public Terminos(){

   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource ("images/icon.png")).getImage());
   Bienvenida ventanaBienvenida =  new Bienvenida();
   Nombre2 =  ventanaBienvenida.Nombre;

   getContentPane().setBackground(new Color(245,245,245));

   label1 = new JLabel("TERMINOS Y CONDICIONES");
   label1.setBounds(215,5,200,30);
   label1.setFont(new Font("Andale Mono",1,14));
   label1.setForeground(new Color(0,0,0));
   add(label1);
 
   ImageIcon imagen = new ImageIcon("images/coca-cola.png");
   label2 = new JLabel(imagen);
   label2.setBounds(315,135,300,300);
   add(label2);

   textarea1 = new JTextArea();
   textarea1.setEditable(false);
   textarea1.setFont(new Font("Andale Mono",0,9));
   textarea1.setText("\n\n        TÉRMINOS Y CONDICIONES"

                    +"\n\n        Ese no es tu peooooooooo"   

                    +"\n          pero tranquilo mano, usted acepta que le ira bien"

                    +"\n          pero vas a acepatar??"
                    +"\n\n        habia una vez un guebonm, que seguia leyendo los terminos y condiciones y no aceptaba"
                    +"\n          marisco apuraaaaaaaaa"


                                                              );
   scroll1 = new JScrollPane(textarea1);
   scroll1.setBounds(10,40,575,200);
   add(scroll1);

   boton1 = new JButton("NO ACEPTPO");
   boton1.setBounds(120,290,120,30);
   boton1.setBackground(new Color(245,245,245));
   boton1.addActionListener(this);
   boton1.setEnabled(true);
   add(boton1);

   boton2 = new JButton("ACEPTO");
   boton2.setBounds(10,290,100,30);
   boton2.setBackground(new Color(245,245,245));
   boton2.addActionListener(this);
   boton2.setEnabled(false);
   add(boton2);
  
   box1 = new JCheckBox("YO "+ Nombre2 + " acepto");
   box1.setBounds(10,250,300,30);
   box1.addChangeListener(this);
   add(box1); 
 }
  
  public void stateChanged(ChangeEvent e){

  if(box1.isSelected()==true){

    boton2.setEnabled(true);
    boton1.setEnabled(false);
  
 }else{
    boton1.setEnabled(true);
    boton2.setEnabled(false);
 } 
  
 }
  public void actionPerformed(ActionEvent  e){
   
   if(e.getSource() == boton1){

   Bienvenida formulario1 = new Bienvenida();
   formulario1.setBounds(0,0,450,560);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);
   this.setVisible(false);
     
  }   
    if(e.getSource() == boton2){

   Pantalla formulario = new Pantalla();
   formulario.setBounds(0,0,500,450);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
   this.setVisible(false);
 
     
  }
 }

  public static void main(String args[]){
  
   Terminos termino1 = new Terminos();
   termino1.setBounds(0,0,610,370);
   termino1.setVisible(true);
   termino1.setLocationRelativeTo(null);
   termino1.setResizable(false); 
 }

}