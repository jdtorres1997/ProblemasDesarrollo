/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

;
package Problema2;

/**
 *
 * @author krypth
 */
import cuenta.*;
import tarjetas.*;
import Problema2.MiFachada;
import problema1.*;

public class Problema2 extends javax.swing.JPanel {

    /**
     * Creates new form Problema2
     */
    public Problema2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coro = new javax.swing.JRadioButton();
        cestandar = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tdjoven = new javax.swing.JRadioButton();
        td10 = new javax.swing.JRadioButton();
        tdoro = new javax.swing.JRadioButton();
        tdestandar = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        destinoField = new javax.swing.JTextField();
        cantidadField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        transButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cjoven = new javax.swing.JRadioButton();
        c10 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        tc10 = new javax.swing.JRadioButton();
        tcoro = new javax.swing.JRadioButton();
        operacionField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        coro.setText("Cuenta Oro");
        coro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coroActionPerformed(evt);
            }
        });

        cestandar.setText("Cuenta Estandar");

        jLabel5.setText("Tipo de tarjeta origen");

        jLabel6.setText("Débito");

        tdjoven.setText("Tarjeta joven");
        tdjoven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdjovenActionPerformed(evt);
            }
        });

        td10.setText("Tarjeta 10");

        tdoro.setText("Tarjeta Oro");

        tdestandar.setText("Tarjeta Estandar");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Realizar transferencia");

        destinoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Cuenta destino");

        jLabel3.setText("Cantidad");

        transButton.setText("Realizar operacion");
        transButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Tipo de cuenta destino");

        cjoven.setText("Cuenta Joven");

        c10.setText("Cuenta 10");

        jLabel7.setText("Credito");

        tc10.setText("Tarjeta 10");

        tcoro.setText("Tarjeta Oro");

        operacionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Operacion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(transButton)
                        .addGap(277, 277, 277))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(operacionField)
                    .addComponent(destinoField, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(cantidadField, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cestandar)
                                .addComponent(c10)
                                .addComponent(cjoven)
                                .addComponent(coro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(14, 14, 14)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22))
                            .addComponent(tdoro)
                            .addComponent(tdestandar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tdjoven)
                                    .addComponent(td10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tcoro)
                                    .addComponent(tc10)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(operacionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(destinoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cjoven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(coro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cestandar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tdjoven)
                                    .addComponent(tc10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(td10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tcoro))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tdoro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tdestandar)
                                .addGap(3, 3, 3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(transButton)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void coroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coroActionPerformed

    private void tdjovenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdjovenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdjovenActionPerformed

    private void destinoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinoFieldActionPerformed

    private void transButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transButtonActionPerformed
      String destino = "";
        float cantidad;
        String operacion= "";
        operacion = operacionField.getText();
        destino = destinoField.getText();
        cantidad = Float.parseFloat(cantidadField.getText());
        Cuenta cuenta = null;

        if (cjoven.isSelected()) {
            cuenta = new CuentaJoven();
        } else if (c10.isSelected()) {
            cuenta = new Cuenta10();
        } else if (coro.isSelected()) {
            cuenta = new CuentaOro();
        } else if (cestandar.isSelected()) {
            cuenta = new CuentaEstandar();
        }
       
        int flag = 0;
        TarjetaDebito tarjetaD = null;
        TarjetaCredito tarjetaC = null;
        if(tdjoven.isSelected()){
            tarjetaD = new TarjetaDebitoJoven();
            flag = 1;
        } else if (td10.isSelected()){
            tarjetaD = new TarjetaDebito10();
            flag = 1;
        }else if (tdoro.isSelected()){
            tarjetaD = new TarjetaDebitoOro();
            flag = 1;
        }else if (tdestandar.isSelected()){
            tarjetaD = new TarjetaDebitoEstandar();
            flag = 1;
        } else if (tc10.isSelected()){
            tarjetaC = new TarjetaCredito10();
            flag = 2;
        }else if (tcoro.isSelected()){
            tarjetaC = new TarjetaCreditoOro();
            flag = 2;
        }
        MiFachada fachada = new MiFachada();
        fachada.llamar(cantidad, destino, operacion, flag, cuenta, tarjetaD,tarjetaC);
    }//GEN-LAST:event_transButtonActionPerformed

    private void operacionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_operacionFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton c10;
    private javax.swing.JTextField cantidadField;
    private javax.swing.JRadioButton cestandar;
    private javax.swing.JRadioButton cjoven;
    private javax.swing.JRadioButton coro;
    private javax.swing.JTextField destinoField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField operacionField;
    private javax.swing.JRadioButton tc10;
    private javax.swing.JRadioButton tcoro;
    private javax.swing.JRadioButton td10;
    private javax.swing.JRadioButton tdestandar;
    private javax.swing.JRadioButton tdjoven;
    private javax.swing.JRadioButton tdoro;
    private javax.swing.JButton transButton;
    // End of variables declaration//GEN-END:variables
}