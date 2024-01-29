package com.proyecto.proyectocg;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Formulario extends JFrame {

  public Formulario() {
    // Crear y nombrar la ventana
    JFrame Ventana = new JFrame();
    // Inicializar el panel con sus respectivos componentes
    iniciarComponentes();
    Ventana.setSize(500, 500);
    Ventana.setTitle("Formulario Del Usuario");
    Ventana.setResizable(false);
    Ventana.setLocationRelativeTo(null);
    Ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public void iniciarComponentes() {
    // Asignación de los distintos elementos
    // Jlabel se usa para el texto que se muestra.
    JLabel EN = new JLabel("Nombre Completo: ");
    //JTextField para el cuadro de texto
    JTextField TN = new JTextField();
    JLabel CI = new JLabel("C.I: ");
    JTextField TCI = new JTextField();
    JLabel CP = new JLabel("Código Postal: ");
    JTextField TCP = new JTextField();
    JLabel DRCCN = new JLabel("Dirección De Vivienda: ");
    JTextField TDRCCN = new JTextField();
    JLabel NMR = new JLabel("No. Telefónico: ");
    JTextField TNMR = new JTextField();
    JLabel EM = new JLabel("Email: ");
    JTextField TEM = new JTextField();
    JLabel LDN = new JLabel("Lugar De Nacimiento: ");
    JTextField TLDN = new JTextField();
    JLabel FDN = new JLabel("Fecha De Nacimiento: ");

    String[] DA = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
      "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
      "24", "25", "26", "27", "28", "29", "30", "31"};

    JComboBox FDND = new JComboBox<>(DA);

    String[] MA = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo",
      "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    JComboBox FDNM = new JComboBox<>(MA);
    String[] AA = new String[]{"1960", "1961", "1962", "1963", "1964", "1965",
      "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974",
      "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983",
      "1984", "1985", "1986", "1987", "1988", "1988", "1989", "1990", "1991",
      "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000",
      "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
      "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018",
      "2019", "2020", "2021", "2022", "2023", "2024"};

    JComboBox FDNA = new JComboBox<>(AA);

    // Esta en especifico esta para solucionar un problema
    JLabel FTS = new JLabel("");
    //a la hora de colocar las etiquetas ya que por alguna razon que me da flojera buscar, la
    //ultima en colocarse no detecta su ubicacion y solo se ubica en el medio. asi que la ultima
    //será esta etiqueta sin texto.

    //Con esto se ubican los elementos con coordenadas y radio (me quiero matar)
    EN.setBounds(15, 20, 200, 30);
    TN.setBounds(25, 50, 345, 20);
    CI.setBounds(15, 70, 200, 30);
    TCI.setBounds(25, 100, 150, 20);
    CP.setBounds(200, 70, 200, 30);
    TCP.setBounds(200, 100, 170, 20);
    DRCCN.setBounds(15, 120, 200, 30);
    TDRCCN.setBounds(25, 150, 345, 20);
    NMR.setBounds(15, 170, 200, 30);
    TNMR.setBounds(25, 200, 150, 20);
    EM.setBounds(200, 170, 200, 30);
    TEM.setBounds(200, 200, 170, 20);
    LDN.setBounds(15, 220, 200, 30);
    TLDN.setBounds(25, 250, 345, 20);
    FDN.setBounds(15, 270, 200, 30);
    FDND.setBounds(25, 300, 50, 30);
    FDNM.setBounds(85, 300, 100, 30);
    FDNA.setBounds(195, 300, 100, 30);

    JPanel Panel = new JPanel();
    Panel.setLayout(null);
    this.getContentPane().add(Panel);

    //Aqui se ponen los elementos en la pestaña
    Panel.add(EN);
    Panel.add(TN);
    Panel.add(CI);
    Panel.add(TCI);
    Panel.add(CP);
    Panel.add(TCP);
    Panel.add(DRCCN);
    Panel.add(TDRCCN);
    Panel.add(NMR);
    Panel.add(TNMR);
    Panel.add(EM);
    Panel.add(TEM);
    Panel.add(LDN);
    Panel.add(TLDN);
    Panel.add(FDN);
    Panel.add(FDND);
    Panel.add(FDNM);
    Panel.add(FDNA);
    Panel.add(FTS);
  }
}
