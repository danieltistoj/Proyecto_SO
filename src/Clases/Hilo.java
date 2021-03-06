package Clases;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
import rojeru_san.RSLabelHora;
import rojerusan.RSTableMetro;

public class Hilo extends Thread {

    private ArrayList<JProgressBar> listaProcesos;
    private int cont;
    private int quantum;
    private int turno;
    private int progreso;
    private JPanel panelProcesos;
    private ArrayList<Integer> noProceso;
    private RSTableMetro tablita;
    private RSLabelHora hora;
    private JLabel etiqueta;

    public Hilo() {
        this.cont = 0;
        this.turno = 0;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public void setProgressbar(ArrayList<JProgressBar> progressbar) {
        this.listaProcesos = progressbar;
    }

    public void setPanelProcesos(JPanel panelProcesos) {
        this.panelProcesos = panelProcesos;
    }

    public void setNoProceso(ArrayList<Integer> noProceso) {
        this.noProceso = noProceso;
    }

    public void setTablita(RSTableMetro tablita,RSLabelHora hora) {
        this.tablita = tablita;
        this.hora = hora;
    }
    public void terminarXInterrupcion(){
        this.cont=0;
        if(this.turno+1==listaProcesos.size()){
            this.turno=0;
        }else{
            this.turno++;
        }
    }
    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }
    @Override
    public void run() {
        while (!listaProcesos.isEmpty()) {
            try {
                this.cont++;
                etiqueta.setText(""+(30+cont));
                this.progreso = listaProcesos.get(this.turno).getValue();
                this.progreso++;
                listaProcesos.get(this.turno).setValue(this.progreso);
                listaProcesos.get(this.turno).setString("Proceso " + noProceso.get(this.turno) + " " + this.progreso + "/" + listaProcesos.get(this.turno).getMaximum());
                if (this.progreso == listaProcesos.get(this.turno).getMaximum()) {
                    panelProcesos.remove(listaProcesos.get(this.turno));
                    panelProcesos.updateUI();
                    panelProcesos.validate();
                    DefaultTableModel modelo = (DefaultTableModel) tablita.getModel();
                    modelo.setValueAt(hora.getHora(), noProceso.get(this.turno)-1, 2);
                    tablita.setModel(modelo);
                    listaProcesos.remove(this.turno);
                    noProceso.remove(this.turno);
                    if (this.turno == listaProcesos.size()) {
                        this.turno = 0;
                    }

                    this.cont = 0;
                }
                if (this.cont == this.quantum) {
                    this.cont = 0;
                    this.turno++;
                    if (this.turno == listaProcesos.size()) {
                        this.turno = 0;
                    }
                }
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

