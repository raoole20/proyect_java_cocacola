import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pantalla extends JFrame implements ActionListener{

  private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10;
  private JMenuBar bar1;
  private JMenu menu1, menu2,menu3,menu4;
  private JMenuItem item1, item2,item3,item4,item5, item6, item7;
  private JTextField textfield1, textfield2, textfield3;
  private JComboBox combo1,combo2;
  private JScrollPane scroll1;
  private JTextArea textarea1;
  String Nombre3 ="";
  
  public Pantalla(){

   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
   setTitle("Pantalla principal");
   setIconImage(new ImageIcon(getClass().getResource ("images/icon.png")).getImage());
   getContentPane().setBackground(new Color(255,0,0));
   Bienvenida texto1 = new Bienvenida();
   Nombre3 = texto1.Nombre;   

   bar1 = new JMenuBar();
   bar1.setBackground(new Color (255,0,0));
   setJMenuBar(bar1);   

   menu1 = new JMenu("opciones");
   menu1.setForeground(new Color(255,255,255));
   menu1.setFont(new Font("Andale Mono", 1, 9));
   bar1.add(menu1);
   
   menu2 = new JMenu("colores");
   menu2.setForeground(new Color(255,0,0));
   menu1.add(menu2);

   menu3 = new JMenu("calcular");
   menu3.setForeground(new Color(255,255,255));
   menu3.setFont(new Font("Andale Mono", 1, 9));
   bar1.add(menu3);

   menu4 = new JMenu("acerca de");
   menu4.setForeground(new Color(255,255,255));
   menu4.setFont(new Font("Andale Mono", 1, 9));
   bar1.add(menu4);

   item1 = new JMenuItem("Rojo");
   item1.setForeground(new Color(255,0,0));
   item1.addActionListener(this);
   menu2.add(item1);
  

   item2 = new JMenuItem("Negro");
   item2.setForeground(new Color(255,0,0));
   item2.addActionListener(this);
   menu2.add(item2);

   item3 = new JMenuItem("Azul");
   item3.setForeground(new Color(255,0,0));
   item3.addActionListener(this);
   menu2.add(item3);


   item4 = new JMenuItem("Nuevo");
   item4.setForeground(new Color(255,0,0));
   item4.addActionListener(this);
   menu1.add(item4);

   item5 = new JMenuItem("Salir");
   item5.setForeground(new Color(255,0,0));
   item5.addActionListener(this);
   menu1.add(item5);
   

   item6 = new JMenuItem("calcular");
   item6.setForeground(new Color(255,0,0));
   item6.addActionListener(this);
   menu3.add(item6);

   item7 = new JMenuItem("Acerca de");
   item7.setForeground(new Color(255,0,0));
   item7.addActionListener(this);
   menu4.add(item7);
    
   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   label1 = new JLabel(imagen);
   label1.setBounds(5,5,250,100);
   add(label1);
   
   label2 = new JLabel("Bienvenido "+ Nombre3);
   label2.setBounds(270,40,150,60);
   label2.setForeground(new Color(255,255,255));
   label2.setFont(new Font("Andale Mono",1,20));
   add(label2);

   label3 = new JLabel("Datos del trabajador para el calculo de vacaciones");
   label3.setBounds(30,130,400,30);
   label3.setForeground(new Color(255,255,255));
   label3.setFont(new Font("Andale Mono",1,15));
   add(label3);


   label4 = new JLabel("Nombre completo:");
   label4.setBounds(20,150,100,30);
   label4.setForeground(new Color(255,255,255));
   label4.setFont(new Font("Andale Mono",0,10));
   add(label4);

   textfield1 = new JTextField();
   textfield1.setBounds(20,180,100,20);
   textfield1.setBackground(new Color (240,240,240));
   add(textfield1);
 
   label5 = new JLabel("Selecciona el departamento:");
   label5.setBounds(150,150,100,30);
   label5.setForeground(new Color(255,255,255));
   label5.setFont(new Font("Andale Mono",0,10));
   add(label5);

   combo1 = new JComboBox();
   combo1.setBounds(150,180,150,20);
   combo1.setForeground(new Color (255,0,0));
   add(combo1);
   combo1.addItem("Atencion al cliente");
   combo1.addItem("Departamento de logistica");
   combo1.addItem("Departamento de Gerengia");

   label6 = new JLabel("Apellido Paterno");
   label6.setBounds(20,200,100,30);
   label6.setForeground(new Color(255,255,255));
   label6.setFont(new Font("Andale Mono",0,10));
   add(label6);

   textfield2 = new JTextField();
   textfield2.setBounds(20,230,100,20);
   textfield2.setBackground(new Color (240,240,240));
   add(textfield2);
 
   label7 = new JLabel("Selecciona la Antiguedad");
   label7.setBounds(150,200,100,30);
   label7.setForeground(new Color(255,255,255));
   label7.setFont(new Font("Andale Mono",0,10));
   add(label7);

   combo2 = new JComboBox();
   combo2.setBounds(150,230,150,20);
   combo2.setForeground(new Color (255,0,0));
   add(combo2);
   combo2.addItem("Menos de un a?o");
   combo2.addItem("Entre 2 y 6 a?os");
   combo2.addItem("mas de 7 a?os");

   label8 = new JLabel("Apellido Paterno");
   label8.setBounds(20,250,100,30);
   label8.setForeground(new Color(255,255,255));
   label8.setFont(new Font("Andale Mono",0,10));
   add(label8);

   textfield3 = new JTextField();
   textfield3.setBounds(20,280,100,20);
   textfield3.setBackground(new Color (240,240,240));
   add(textfield3);

   label9 = new JLabel("Resultado del calculo");
   label9.setBounds(150,250,100,30);
   label9.setForeground(new Color(255,255,255));
   label9.setFont(new Font("Andale Mono",0,10));
   add(label9);

   textarea1 = new JTextArea();
   textarea1.setForeground(new Color(255,0,0));
   scroll1 = new JScrollPane(textarea1);
   textarea1.setEditable(false);
   scroll1.setBounds(150,280,200,90);
   textarea1.setText("\n \n   aqui apareceran los resultados.");
   add(scroll1);

 } 

  public void actionPerformed(ActionEvent e){
     Container fondo = this.getContentPane();

     if(e.getSource()==item1){

         fondo.setBackground(new Color(255,0,0));                 
  
   }
     if(e.getSource()==item2){

         fondo.setBackground(new Color(0,0,0));                 
  
   }
     if(e.getSource()==item3){

         fondo.setBackground(new Color(0,0,255));                 
   }

     if(e.getSource()==item4){
  
           textfield1.setText("");  
           textfield2.setText("");    
           textfield3.setText(""); 

           textarea1.setText("aqui apareceran los resultados");         
  
   }

    if(e.getSource()== item5){

          Bienvenida formulario1 = new Bienvenida();
          formulario1.setBounds(0,0,450,560);
          formulario1.setVisible(true);
          formulario1.setResizable(false);
          formulario1.setLocationRelativeTo(null);
          this.setVisible(false);

   } 

    if(e.getSource()== item6){
       
       String depa = combo1.getSelectedItem().toString();
       String Antiguedad = combo2.getSelectedItem().toString();
       String NombreTrabajador = textfield1.getText();
       String AP = textfield2.getText();
       String AM = textfield3.getText();


       if(NombreTrabajador.equals("") || AP.equals("") || AM.equals("") ){
      
          JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");

         }else {
           
           if(depa.equals("Atencion al cliente")){
             
              if(Antiguedad.equals("Menos de un a?o")){
                 textarea1.setText(Nombre3 + " Bienvenido, aun no tiene derecho a vacaciones");
               }else {

              if(Antiguedad.equals("Entre 2 y 6 a?os")){
                 textarea1.setText(Nombre3 + " Bienvenido, Tiene derecho a 15 dias de vacaciones");
                } else {
              if(Antiguedad.equals("mas de 7 a?os")){
                 textarea1.setText(Nombre3 + " Bienvenido, tiene derecho a 20 dias de vacaciones");
                 }
                }
               }

           }else{ 

          if(depa.equals("Departamento de logistica")){

           if(depa.equals("Atencion al cliente")){
             
              if(Antiguedad.equals("Menos de un a?o")){
                 textarea1.setText(Nombre3 + " Bienvenido, aun no tiene derecho a vacaciones");
               }else {

              if(Antiguedad.equals("Entre 2 y 6 a?os")){
                 textarea1.setText(Nombre3 + " Bienvenido, Tiene derecho a 25 dias de vacaciones");
                } else {
              if(Antiguedad.equals("mas de 7 a?os")){
                 textarea1.setText(Nombre3 + " Bienvenido, tiene derecho a 30 dias de vacaciones");
                 }
                }
               }
                  }else{
          if(depa.equals("Departamento de Gerengia")){

           if(depa.equals("Atencion al cliente")){
             
              if(Antiguedad.equals("Menos de un a?o")){
                 textarea1.setText(Nombre3 + " Bienvenido, aun no tiene derecho a vacaciones");
               }else {

              if(Antiguedad.equals("Entre 2 y 6 a?os")){
                 textarea1.setText(Nombre3 + " Bienvenido, Tiene derecho a 30 dias de vacaciones");
                } else {
              if(Antiguedad.equals("mas de 7 a?os")){
                 textarea1.setText(Nombre3 + " Bienvenido, tiene derecho a 40 dias de vacaciones");
                 }
                }
               }
                  } 
                 }

                }

        }
}
}


   }
  
    if(e.getSource()== item7){

            JOptionPane.showMessageDialog(null, "Ing. Raul espina 2021");

   }    
  }

  public static void main(String args[]){

   Pantalla formulario = new Pantalla();
   formulario.setBounds(0,0,500,450);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);
 }
}