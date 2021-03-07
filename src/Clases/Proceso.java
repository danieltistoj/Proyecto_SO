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
