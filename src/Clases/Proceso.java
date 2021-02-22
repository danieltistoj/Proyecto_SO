/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Proceso {
  private JLabel label;
  private int ancho;
  public Proceso(int numProceso,int posicionX, int posicionY,int altura){
   ancho = 186;
   label = new JLabel("Proceso "+numProceso, SwingConstants.CENTER);
   label.setBounds(posicionX, posicionY, ancho,altura);
   label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
  }
  public JLabel getLabel(){
      return label;
  }
}
