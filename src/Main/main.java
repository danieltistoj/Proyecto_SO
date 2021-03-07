/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clase.Reloj;
import Clases.Proceso;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class main extends javax.swing.JFrame {

    private Reloj reloj;
    private int espacioMemoria;
    private int contadorProceso, sizeMemoria;
    private ArrayList<Proceso> listaProcesos;
    private Hilo r=new Hilo();

    public main() {
        initComponents();
        setLocationRelativeTo(null);

        reloj = new Reloj(labelReloj);
        reloj.hilo1.start();
        System.out.println(panelMemoriaPrincipal.getWidth() + " " + panelMemoriaPrincipal.getHeight());
        System.out.println(labelSO.getWidth() + " " + labelSO.getHeight());
        espacioMemoria = panelMemoriaPrincipal.getHeight() - labelSO.getHeight();
        System.out.println(espacioMemoria);

        listaProcesos = new ArrayList<Proceso>();
        sizeMemoria = 447;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelReloj = new javax.swing.JLabel();
        panelProcesador = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        labelBase = new javax.swing.JLabel();
        labelLimite = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelCalendarizador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelMemoriaPrincipal = new javax.swing.JPanel();
        labelSO = new javax.swing.JLabel();
        btnNuevoPorceso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelSizeMemoria = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Reloj"));

        labelReloj.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        labelReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelReloj.setText("Algo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelReloj, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        panelProcesador.setBorder(javax.swing.BorderFactory.createTitledBorder("Procesador"));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setBorder(null);
        jScrollPane1.setViewportView(textArea);

        jLabel1.setText("Historial");

        labelBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBase.setText("b");
        labelBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelLimite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLimite.setText("h");
        labelLimite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Base");

        jLabel5.setText("Limite");

        labelCalendarizador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCalendarizador.setText("P");
        labelCalendarizador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calendarizador");

        javax.swing.GroupLayout panelProcesadorLayout = new javax.swing.GroupLayout(panelProcesador);
        panelProcesador.setLayout(panelProcesadorLayout);
        panelProcesadorLayout.setHorizontalGroup(
            panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcesadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProcesadorLayout.createSequentialGroup()
                        .addGroup(panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addGroup(panelProcesadorLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(labelCalendarizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelLimite, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(labelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(83, 83, 83))))
        );
        panelProcesadorLayout.setVerticalGroup(
            panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProcesadorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCalendarizador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProcesadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMemoriaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelSO.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelSO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSO.setText("S.O.");
        labelSO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelMemoriaPrincipalLayout = new javax.swing.GroupLayout(panelMemoriaPrincipal);
        panelMemoriaPrincipal.setLayout(panelMemoriaPrincipalLayout);
        panelMemoriaPrincipalLayout.setHorizontalGroup(
            panelMemoriaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
        );
        panelMemoriaPrincipalLayout.setVerticalGroup(
            panelMemoriaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMemoriaPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelSO, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnNuevoPorceso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNuevoPorceso.setText("Nuevo Proceso");
        btnNuevoPorceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPorcesoActionPerformed(evt);
            }
        });

        jLabel3.setText("Memoria Principal");

        labelSizeMemoria.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelSizeMemoria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSizeMemoria.setText("447");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Tamaño en memoria");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Limpiar Memoria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Inicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelMemoriaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(btnNuevoPorceso, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(57, 57, 57))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(labelSizeMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(121, 121, 121))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(109, 109, 109)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelProcesador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnNuevoPorceso, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSizeMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jButton2)
                                .addGap(34, 34, 34)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelMemoriaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarMemoria() {
        for (int i = 0; i < listaProcesos.size(); i++) {
            panelMemoriaPrincipal.remove(listaProcesos.get(i).getLabel());
        }
        panelMemoriaPrincipal.repaint();
        listaProcesos.clear();
        sizeMemoria = 447;
        labelSizeMemoria.setText(sizeMemoria + "");
    }


    private void btnNuevoPorcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPorcesoActionPerformed
        int sizeProceso = (int) Math.floor(Math.random() * 189 + 10);
        int tiempoeje = (int) Math.floor(Math.random() * 14 + 0);
        int posicionInicial;
        if (sizeMemoria != 0) { // si aun hay espacio en memoria
            if (listaProcesos.size() == 0) { //Si la lista esta vacia 
                contadorProceso = listaProcesos.size() + 1; //Incrementa uno en el contador, que va a indicar el numero del proceso
                Proceso proceso = new Proceso(contadorProceso, 0, sizeProceso, tiempoeje); //crea un nuevo proceso
                panelMemoriaPrincipal.add(proceso.getLabel());//agrega el proceso al panel
                panelMemoriaPrincipal.repaint();// actualiza el panel
                System.out.println("TIEMPOEJE" + tiempoeje);
                listaProcesos.add(proceso); //agrega el proceso a la lista 
                sizeMemoria = sizeMemoria - sizeProceso; // se le resta espacio a la memoria 
                labelSizeMemoria.setText(sizeMemoria + "");
                textArea.setText(listaProcesos.get(0).getLabel().getText() + " creado a las " + labelReloj.getText());
            } else {
                posicionInicial = listaProcesos.get(listaProcesos.size() - 1).getPosicionFinal(); // se optiene la posicion del nuevo proceso 

                if (posicionInicial + sizeProceso > 447) {//si el proceso acupa el espacio del sistema operativo
                    JOptionPane.showMessageDialog(null, "No hay espacio para el nuevo proceso", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    contadorProceso = listaProcesos.size() + 1;
                    posicionInicial = listaProcesos.get(listaProcesos.size() - 1).getPosicionFinal();
                    Proceso proceso = new Proceso(contadorProceso, posicionInicial, sizeProceso, tiempoeje);
                    panelMemoriaPrincipal.add(proceso.getLabel());
                    panelMemoriaPrincipal.repaint();

                    listaProcesos.add(proceso);
                    sizeMemoria = sizeMemoria - sizeProceso;
                    labelSizeMemoria.setText(sizeMemoria + "");
                    textArea.setText(textArea.getText() + "\n" + listaProcesos.get(listaProcesos.size() - 1).getLabel().getText() + " creado a las " + labelReloj.getText());
                }

            }
        } else {
            JOptionPane.showConfirmDialog(null, "ya no hay espacio en memoria", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnNuevoPorcesoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarMemoria();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(r.isAlive()==false){
        r = new Hilo();
        r.start();     
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    public class Hilo extends Thread {

        private int cuantum = 10;
        private int contador = 0;
        private int procestoeje = 0;
        @Override
        public void run() {
            try {
                //OBTIENE EL PROCESO
                while (listaProcesos.size() > 0) {
                    System.out.println("tama;o arraylis" + listaProcesos.size());
                    for (int i = 0; i < listaProcesos.size(); i++) {
                        //COPIO EL TIEMPO DE EJECUCION DEL PROCESO EN ESPECIFICO
                        procestoeje = listaProcesos.get(i).getTiempoEjecucion();
                        System.out.println("entro");

                        if (listaProcesos.get(i).getTiempoEjecucion() <= cuantum) {

                            for (int l = 0; l <= listaProcesos.get(i).getTiempoEjecucion(); l++) {

                                Thread.sleep(1000);
                                System.out.println("menos a cuantum" + procestoeje);
                            }
                            panelMemoriaPrincipal.remove(listaProcesos.get(i).getLabel());
                            panelMemoriaPrincipal.repaint();
                            //Mostrar en el historial que sale el proceso de la memoria principal
                            textArea.setText(textArea.getText()+"\n"+listaProcesos.get(i).getLabel().getText()+" sale a las "+labelReloj.getText());
                            //Se le suma a la memoria lo que acupaba el proceso, que seria la altura del label
                            sizeMemoria = sizeMemoria+listaProcesos.get(i).getAltura();
                            //se modifica el label que muestra el espacio en memoria
                            labelSizeMemoria.setText(sizeMemoria+"");
                            //se retira el proceso de la lista 
                            listaProcesos.remove(i);
                            System.out.println("remove");
                        } else if (listaProcesos.get(i).getTiempoEjecucion() > cuantum) {
                            contador = 0;
                            for (int j = 0; j < cuantum; j++) {
                                contador++;
                                Thread.sleep(1000);
                                System.out.println("entro ciclo mayor cuantum" + procestoeje + " " + contador);
                            }
                            System.out.println("mayour cuantum");
                            listaProcesos.get(i).setTiempoEjecucion(procestoeje - contador);
                        }
                    }
                }

            } catch (InterruptedException ex) {

            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoPorceso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBase;
    private javax.swing.JLabel labelCalendarizador;
    private javax.swing.JLabel labelLimite;
    private javax.swing.JLabel labelReloj;
    private javax.swing.JLabel labelSO;
    private javax.swing.JLabel labelSizeMemoria;
    private javax.swing.JPanel panelMemoriaPrincipal;
    private javax.swing.JPanel panelProcesador;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
