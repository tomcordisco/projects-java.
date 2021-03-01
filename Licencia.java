import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel label1, label2;
  private JCheckBox check1;
  private JButton boton1, boton2;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  String nombre = "";

  public Licencia(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle ("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    Bienvenida ventanaBienvenida = new Bienvenida();
    nombre = ventanaBienvenida.texto;  

    label1 = new JLabel("TERMINOS Y CONDICIONES");
    label1.setBounds(215,5,200,30);
    label1.setFont(new Font("Andale Mono", 1, 14));
    label1.setForeground(new Color(0,0,0));
    add(label1);

    textarea1 = new JTextArea();
    textarea1.setEditable(false);
    textarea1.setFont(new Font("Andale Mono", 0, 10));
    textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
                      "\n\n          A. PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE CORDISCO'S COMPANY." +
                      "\n          B.CORDISCO'S COMPANY NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."      +
                      "\n\n         LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACION RIGEN ESTRICTAMENTE BAJO EL USO "  +
                      "\n         QUE USTED HAGA CON EL SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR LOS TERMINOS Y"     +
                      "\n         CONDICIONES HAGA CLICK EN (ACEPTO), DE LO CONTRARIO HAGA CLICK EN (NO ACEPTO)."  +
                      "\n         PARA MAYOR INFORMACION SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE:"  +
                      "\n         https://www.linkedin.com/in/tom%C3%A1s-cordisco-b790a51b1/"                      +
                      "\n\n                                                                                      ");

    scrollpane1 = new JScrollPane(textarea1);
    scrollpane1.setBounds(15,40,575,200);
    add(scrollpane1);

    check1 = new JCheckBox("Yo " + nombre + " Acepto");
    check1.setBounds(10,250,300,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,290,100,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);
    
    boton2 = new JButton("No Acepto");
    boton2.setBounds(120,290,100,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

    ImageIcon imagen = new ImageIcon("cordisco-logo.png");
    label2 = new JLabel(imagen);
    label2.setBounds(295,135,300,300);
    add(label2);
  }
  
  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else {
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
       Principal ventanaPrincipal = new Principal();
       ventanaPrincipal.setBounds(0,0,640,535);
       ventanaPrincipal.setVisible(true);
       ventanaPrincipal.setResizable(false);
       ventanaPrincipal.setLocationRelativeTo(null); 
       this.setVisible(false);
    } else if(e.getSource() == boton2){
        Bienvenida ventanabienvenida = new Bienvenida();
        ventanabienvenida.setBounds(0,0,350,450);
        ventanabienvenida.setVisible(true);
        ventanabienvenida.setResizable(false);
        ventanabienvenida.setLocationRelativeTo(null);
        this.setVisible(false);
    }
  }

  public static void main(String args[]){
    Licencia ventanalicencia = new Licencia();
    ventanalicencia.setBounds(0,0,620,370);
    ventanalicencia.setVisible(true);
    ventanalicencia.setResizable(false);
    ventanalicencia.setLocationRelativeTo(null);
  }
}