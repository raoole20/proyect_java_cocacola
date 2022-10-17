import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Bienvenida extends JFrame implements ActionListener{

  private JLabel label1, label2, label3,label4;
  private JTextField textfield1;
  private JButton boton1;
  public  static String Nombre ="";
  
  
  public Bienvenida(){

   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);

   setTitle("Bienvenido");
   getContentPane().setBackground(new Color (255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon image = new ImageIcon("images/logo-coca.png");
   label1 = new JLabel(image);
   label1.setBounds(50,25,350,200);
   add(label1);

   label2 = new JLabel("Sistema de control Vacacional");
   label2.setBounds(125,150,200,50);
   label2.setFont(new Font("arial",3,12));
   label2.setForeground(new Color (255,255,255));
   add(label2);
   
   label3 = new JLabel("ingrese su nombre");
   label3.setBounds(10,350,129,50);
   label3.setFont(new Font("arial",0,12));
   label3.setForeground(new Color (255,255,255));
   add(label3);
   

   label4 = new JLabel("©2017 The Coca-Cola Company");
   label4.setBounds(125,500,200,30);
   label4.setFont(new Font("arial",1,12));
   label4.setForeground(new Color (255,255,255));
   add(label4);
   
   textfield1 = new JTextField();
   textfield1.setBounds(10,385,100,30);
   textfield1.setForeground(new Color (255,0,0));
   textfield1.setFont(new Font("arial",1,12));
   textfield1.setBackground(new Color (240,240,240));
   add(textfield1);

   boton1 = new JButton("aceptar");
   boton1.setBounds(10,430,110,30);
   boton1.setBackground(new Color(255,255,255));
   boton1.setForeground(new Color(255,0,0));
   boton1.addActionListener(this);
   add(boton1); 
 }  

  public void actionPerformed(ActionEvent e){

   if(e.getSource() == boton1){

          Nombre = textfield1.getText().trim();

          if(Nombre.equals("")){

            JOptionPane.show.MessageDialog(null, "Debes ingresar tu nombre");

          }else{

               Terminos termino1 = new Terminos();
               termino1.setBounds(0,0,610,370);
               termino1.setVisible(true);
               termino1.setLocationRelativeTo(null);
               termino1.setResizable(false);
               this.setVisible(flase);
          }
  }
 }

  public static void main(String args[]){

   Bienvenida formulario1 = new Bienvenida();
   formulario1.setBounds(0,0,450,560);
   formulario1.setVisible(true);
   formulario1.setResizable(false);
   formulario1.setLocationRelativeTo(null);
 }
}