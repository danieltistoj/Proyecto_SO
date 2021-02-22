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
  private int ancho ,altura,posicionY,posicionFinal;
  public Proceso(int numProceso ,int posicionY,int altura){
   ancho = 186;
   label = new JLabel("Proceso "+numProceso, SwingConstants.CENTER);
   label.setBounds(0, posicionY, ancho,altura);
   label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
   this.altura = altura;
   this.posicionY = posicionY;
   this.posicionFinal = altura+posicionY;
  }
  public JLabel getLabel(){
      return label;
  }
  public int getAltura(){
      return this.altura;
  }
  public int getPosicionY(){
      return this.posicionY;
  }
  public int getPosicionFinal(){
      return this.posicionFinal;
  }
}
