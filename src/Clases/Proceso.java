/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Proceso {

    private int tiempoEjecucion;
    private JLabel label;
    private JLabel hexao;
    private JLabel hexaf;
    
    private int ancho, altura, posicionY, posicionFinal;

    public Proceso(int numProceso, int posicionY, int altura, int time) {
        ancho = 186;
        label = new JLabel("Proceso " + numProceso, SwingConstants.CENTER);
        label.setBounds(0, posicionY, ancho, altura);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setFont( new Font("Serif", Font.BOLD, 18));
        verde();
        this.altura = altura;
        this.posicionY = posicionY;
        System.out.println(this.posicionY);
        
        //HEXA BASE  
        String hexadecimalo = Integer.toHexString(this.posicionY);
        hexao = new JLabel(hexadecimalo,SwingConstants.LEFT);
        hexao.setBounds(0, posicionY, 30, 10);
        hexao.setBackground(Color.black);
        hexao.setFont(new Font("serif",Font.PLAIN,10));
        
        //HEXA LIMITE
        String hexadecimalf = Integer.toHexString(this.posicionY);
        hexao = new JLabel(hexadecimalf,SwingConstants.LEFT);
        hexao.setBounds(0, posicionY, 30, 10);
        hexao.setBackground(Color.black);
        hexao.setFont(new Font("serif",Font.PLAIN,10));
        
        
        this.posicionFinal = altura + posicionY;
        this.tiempoEjecucion = time;
    }
    public void azul()
    {
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLUE);
        System.out.println("COLOR AZUL");
        label.setOpaque(true);
    }
    public void verde()
    {
        label.setForeground(Color.BLACK);
        label.setBackground(Color.GREEN);
        System.out.println("COLOR VERDE");
        label.setOpaque(true);
    }
    public JLabel getHexa() {
        return hexa;
    }
    public void setHexa(JLabel hexa) {
        this.hexa = hexa;
    }
    public JLabel getLabel() {
        return label;
    }

    public int getAltura() {
        return this.altura;
    }

    public int getPosicionY() {
        return this.posicionY;
    }

    public int getPosicionFinal() {
        return this.posicionFinal;
    }
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }
}
