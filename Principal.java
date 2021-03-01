import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

    private JMenuBar menubar;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miCalculo, miColor1, miColor2, miColor3, miElCreador, miSalir, miNuevo;
    private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelApellido, labelDni,
                   labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
    private JTextField txtNombreTrabajador, txtApellidoTrabajador, txtDniTrabajador;
    private JComboBox comboDepartamento, comboAntiguedad;
    private JScrollPane scrollpane1;
    private JTextArea textarea1; 
    String nombre = "";         
 
    public Principal(){
      setLayout(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle("Pantalla principal");
      getContentPane().setBackground(new Color (0, 216, 105));
      setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
      Bienvenida ventanaBienvenida = new Bienvenida();
      nombre = ventanaBienvenida.texto;  

      menubar = new JMenuBar();
      menubar.setBackground(new Color(0,216,105));
      setJMenuBar(menubar);

      menuOpciones = new JMenu("Opciones");
      menuOpciones.setBackground(new Color(0, 216, 105));
      menuOpciones.setFont(new Font("Andale Mono", 1, 14));
      menuOpciones.setForeground(new Color(255, 255, 255));
      menubar.add(menuOpciones);

      menuCalcular = new JMenu("Calcular");
      menuCalcular.setBackground(new Color(0, 216, 105));
      menuCalcular.setFont(new Font("Andale Mono", 1, 14));
      menuCalcular.setForeground(new Color(255, 255, 255));
      menubar.add(menuCalcular);

      menuAcercaDe = new JMenu("Acerca De");
      menuAcercaDe.setBackground(new Color(0, 216, 105));
      menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
      menuAcercaDe.setForeground(new Color(255, 255, 255));
      menubar.add(menuAcercaDe);

      menuColorFondo = new JMenu("Color del fondo");
      menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
      menuColorFondo.setForeground(new Color(255, 255, 255));
      menuOpciones.add(menuColorFondo);

      miCalculo = new JMenuItem("Vacaciones");
      miCalculo.setFont(new Font("Andale Mono", 1, 14));
      miCalculo.setForeground(new Color(255, 255, 255));
      menuCalcular.add(miCalculo);
      miCalculo.addActionListener(this);

      miColor1 = new JMenuItem("Verde");
      miColor1.setFont(new Font("Andale Mono", 1, 14));
      miColor1.setForeground(new Color(255, 255, 255));
      menuColorFondo.add(miColor1);
      miColor1.addActionListener(this);

      miColor2 = new JMenuItem("Negro");
      miColor2.setFont(new Font("Andale Mono", 1, 14));
      miColor2.setForeground(new Color(255, 255, 255));
      menuColorFondo.add(miColor2);
      miColor2.addActionListener(this);

      miColor3 = new JMenuItem("Gris");
      miColor3.setFont(new Font("Andale Mono", 1, 14));
      miColor3.setForeground(new Color(255, 255, 255));
      menuColorFondo.add(miColor3);
      miColor3.addActionListener(this);

      miNuevo = new JMenuItem("Nuevo");
      miNuevo.setFont(new Font("Andale Mono", 1, 14));
      miNuevo.setForeground(new Color(255, 255, 255));
      menuOpciones.add(miNuevo);
      miNuevo.addActionListener(this);

      miSalir = new JMenuItem("Salir");
      miSalir.setFont(new Font("Andale Mono", 1, 14));
      miSalir.setForeground(new Color(255, 255, 255));
      menuOpciones.add(miSalir);
      miSalir.addActionListener(this);

      miElCreador = new JMenuItem("Acerca del creador");
      miElCreador.setFont(new Font("Andale Mono", 1, 14));
      miElCreador.setForeground(new Color(255, 255, 255));
      menuAcercaDe.add(miElCreador);
      miElCreador.addActionListener(this);

      ImageIcon imagen = new ImageIcon("cordisco-logo-blanco.png");
      labelLogo = new JLabel(imagen);
      labelLogo.setBounds(0,5,300,120);
      add(labelLogo);

      labelBienvenido = new JLabel("Bienvenido " + nombre);
      labelBienvenido.setBounds(300,45,300,50);
      labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
      labelBienvenido.setForeground(new Color(255, 255, 255));
      add(labelBienvenido);

      labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
      labelTitle.setBounds(30,140,900,25);
      labelTitle.setFont(new Font("Andale Mono", 1, 24));
      labelTitle.setForeground(new Color(255, 255, 255));
      add(labelTitle);

      labelNombre = new JLabel("Nombre completo:");
      labelNombre.setBounds(25,188,180,25);
      labelNombre.setFont(new Font("Andale Mono", 1, 12));
      labelNombre.setForeground(new Color(255, 255, 255));
      add(labelNombre);

      txtNombreTrabajador = new JTextField();
      txtNombreTrabajador.setBounds(25,213,150,25);
      txtNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 12));
      txtNombreTrabajador.setForeground(new java.awt.Color(0, 216, 105));
      add(txtNombreTrabajador);

      labelApellido = new JLabel("Apellidos:");
      labelApellido.setBounds(25,248,180,25);
      labelApellido.setFont(new Font("Andale Mono", 1, 12));
      labelApellido.setForeground(new Color(255, 255, 255));
      add(labelApellido);

      txtApellidoTrabajador = new JTextField();
      txtApellidoTrabajador.setBounds(25,273,150,25);
      txtApellidoTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtApellidoTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 12));
      txtApellidoTrabajador.setForeground(new java.awt.Color(0, 216, 105));
      add(txtApellidoTrabajador);

      labelDni = new JLabel("D.N.I:");
      labelDni.setBounds(25,308,180,25);
      labelDni.setFont(new Font("Andale Mono", 1, 12));
      labelDni.setForeground(new Color(255, 255, 255));
      add(labelDni);

      txtDniTrabajador = new JTextField();
      txtDniTrabajador.setBounds(25,334,150,25);
      txtDniTrabajador.setBackground(new java.awt.Color(224, 224, 224));
      txtDniTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 12));
      txtDniTrabajador.setForeground(new java.awt.Color(0, 216, 105));
      add(txtDniTrabajador);

      labelDepartamento = new JLabel("Seleciona el Departamento:");
      labelDepartamento.setBounds(220,188,180,25);
      labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
      labelDepartamento.setForeground(new Color(255, 255, 255));
      add(labelDepartamento);

      comboDepartamento = new JComboBox();
      comboDepartamento.setBounds(220,213,220,25);
      comboDepartamento.setBackground(new java.awt.Color(224, 224, 224));
      comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboDepartamento.setForeground(new java.awt.Color(0, 216, 105));
      add(comboDepartamento);
      comboDepartamento.addItem("");
      comboDepartamento.addItem("Atencion al Cliente");
      comboDepartamento.addItem("Departamento de Logistica");
      comboDepartamento.addItem("Departamento de Gerencia");
    
      labelAntiguedad = new JLabel("Selecciona la Antiguedad:");
      labelAntiguedad.setBounds(220,248,180,25);
      labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
      labelAntiguedad.setForeground(new Color(255, 255, 255));
      add(labelAntiguedad);

      comboAntiguedad = new JComboBox();
      comboAntiguedad.setBounds(220,273,220,25);
      comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
      comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
      comboAntiguedad.setForeground(new java.awt.Color(0, 216, 105));
      add(comboAntiguedad);
      comboAntiguedad.addItem("");
      comboAntiguedad.addItem("1 anio de servicio");
      comboAntiguedad.addItem("2 a 6 anios de servicio");
      comboAntiguedad.addItem("7 anios o mas de servicio");
   
      labelResultado = new JLabel("Resultado del calculo:");
      labelResultado.setBounds(220,307,180,25);
      labelResultado.setFont(new Font("Andale Mono", 1, 12));
      labelResultado.setForeground(new Color(255, 255, 255));
      add(labelResultado);

      textarea1 = new JTextArea();
      textarea1.setEditable(false);
      textarea1.setBackground(new Color(224, 224, 224));
      textarea1.setFont(new Font("Andale Mono", 1, 11));
      textarea1.setForeground(new Color(0,216,105));
      textarea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");
      scrollpane1 = new JScrollPane(textarea1);
      scrollpane1.setBounds(220,333,385,90);
      add(scrollpane1);

      labelfooter = new JLabel("2021 Cordisco's Comapny | All the rights reserved");
      labelfooter.setBounds(145,445,500,30);
      labelfooter.setFont(new Font("Andale Mono", 1, 12));
      labelfooter.setForeground(new Color(255, 255, 255));
      add(labelfooter);  
    } 
  
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == miCalculo) {

            String nombre_traba = txtNombreTrabajador.getText();
            String apellido_traba = txtApellidoTrabajador.getText();
            String dni_traba = txtDniTrabajador.getText();
            String departamento = comboDepartamento.getSelectedItem().toString();
            String antiguedad = comboAntiguedad.getSelectedItem().toString();

            if(nombre_traba.equals("") || apellido_traba.equals("") || dni_traba.equals("") || departamento.equals("") || antiguedad.equals("")){
                JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");
            } else {
                if(departamento.equals("Atencion al Cliente")){

                    if(antiguedad.equals("1 anio de servicio")){

                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 6 dias de vacaciones.");
                    }

                    if(antiguedad.equals("2 a 6 anios de servicio")){
                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 14 dias de vacaciones.");
                    }

                    if(antiguedad.equals("7 anios o mas de servicio")){
                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 20 dias de vacaciones.");
                    }
                }

                if(departamento.equals("Departamento de Logistica")){

                    if(antiguedad.equals("1 anio de servicio")){

                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 7 dias de vacaciones.");
                    }

                    if(antiguedad.equals("2 a 6 anios de servicio")){
                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 15 dias de vacaciones.");
                    }

                    if(antiguedad.equals("7 anios o mas de servicio")){
                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 22 dias de vacaciones.");
                    }
                }

                if(departamento.equals("Departamento de Gerencia")){

                    if(antiguedad.equals("1 anio de servicio")){

                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 10 dias de vacaciones.");
                    }

                    if(antiguedad.equals("2 a 6 anios de servicio")){
                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 20 dias de vacaciones.");
                    }

                    if(antiguedad.equals("7 anios o mas de servicio")){
                        textarea1.setText("\n   El trabajador " + nombre_traba + " " + apellido_traba + " con D.N.I.: " + dni_traba + 
                                          "\n   quien labora en " + departamento + " con " + antiguedad + 
                                          "\n   recibe 30 dias de vacaciones.");
                    }
                }
            }
        }

        if (e.getSource() == miColor1){
            getContentPane().setBackground(new Color(0, 216, 105));
        }

        if (e.getSource() == miColor2){
            getContentPane().setBackground(new Color(0, 0, 0));
        }

        if (e.getSource() == miColor3){
            getContentPane().setBackground(new Color(82, 82, 82));
        }

        if (e.getSource() == miNuevo){  
            txtNombreTrabajador.setText("");
            txtApellidoTrabajador.setText("");
            txtDniTrabajador.setText("");
            comboDepartamento.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            textarea1.setText("\n   Aqui aparece el resultado del calculo de las vacaciones.");  
        }

        if (e.getSource() == miSalir){
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0,0,350,450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }

        if (e.getSource() == miElCreador){
            JOptionPane.showMessageDialog(null,"                Desarrollado por Tom Cordisco\n" +
                                               "https://www.linkedin.com/in/tom%C3%A1s-cordisco-b790a51b1/");
        }
    }

    public static void main(String args[]){
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBounds(0,0,640,535);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setLocationRelativeTo(null);  
    }
}