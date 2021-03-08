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
    private String hexadecimalo;
    private String hexadecimalf;
    private int ancho, altura, posicionY, posicionFinal, ContadorPrograma, alturaCP;
    
    public int getContadorPrograma() {
        return ContadorPrograma;
    }

    public void setContadorPrograma(int ContadorPrograma) {
        this.ContadorPrograma = ContadorPrograma;
    }

    public Proceso(int numProceso, int posicionY, int altura, int time) {
        ancho = 186;
        label = new JLabel("Proceso " + numProceso, SwingConstants.CENTER);
        label.setBounds(0, posicionY, ancho, altura);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setFont( new Font("Serif", Font.BOLD, 14));
        verde();
        this.altura = altura;
        this.posicionY = posicionY;
        this.ContadorPrograma = posicionY;
        this.posicionFinal = altura + posicionY;
        this.tiempoEjecucion = time;
        
        //HEXA BASE  
        hexadecimalo = Integer.toHexString(this.posicionY);
        hexadecimalo = rellenar(hexadecimalo);
        hexao = new JLabel(hexadecimalo,SwingConstants.LEFT);
        hexao.setBounds(0, posicionY, 40, 10);
        hexao.setBackground(Color.black);
        hexao.setFont(new Font("serif",Font.PLAIN,10));
        
        //HEXA LIMITE
        hexadecimalf = Integer.toHexString(this.posicionFinal);
        hexadecimalf = rellenar(hexadecimalf);
        hexaf = new JLabel(hexadecimalf,SwingConstants.LEFT);
        hexaf.setBounds(0, posicionFinal, 40, 10);
        hexaf.setBackground(Color.black);
        hexaf.setFont(new Font("serif",Font.PLAIN,10));
        alturaCP = altura/time;
    }

    public int getAlturaCP() {
        return alturaCP;
    }

    public void setAlturaCP(int alturaCP) {
        this.alturaCP = alturaCP;
    }

    public String getHexadecimalo() {
        return hexadecimalo;
    }

    public void setHexadecimalo(String hexadecimalo) {
        this.hexadecimalo = hexadecimalo;
    }

    public String getHexadecimalf() {
        return hexadecimalf;
    }

    public void setHexadecimalf(String hexadecimalf) {
        this.hexadecimalf = hexadecimalf;
    }
    
    public String rellenar(String r)
    {
        int tam = 4 - (r.length()-1);
        String n = "0x";
        for(int x = 0; x<tam;x++)
        {
            n = n + "0";
        }
        n = n + r;
        return n;
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

    public JLabel getHexao() {
        return hexao;
    }

    public void setHexao(JLabel hexao) {
        this.hexao = hexao;
    }

    public JLabel getHexaf() {
        return hexaf;
    }

    public void setHexaf(JLabel hexaf) {
        this.hexaf = hexaf;
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
