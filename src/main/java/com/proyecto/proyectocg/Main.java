package com.proyecto.proyectocg;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialLiteTheme;

public class Main {

  public static void main(String[] args) {
    // tema
    try {
      UIManager.setLookAndFeel(new MaterialLookAndFeel(new MaterialLiteTheme()));
    } catch (UnsupportedLookAndFeelException e) {
      e.printStackTrace();
    }

    Formulario formulario = new Formulario();
    formulario.setVisible(true);
  }

}
