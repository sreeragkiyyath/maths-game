package com.gui;

import com.bean.Common;
import com.bean.Record;
import com.bean.Student;
import com.serial.SerialDeserial;
import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ViewForm extends javax.swing.JFrame {

    static int count = 0;

    public ViewForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxtFld = new javax.swing.JTextField();
        ageTxtFld = new javax.swing.JTextField();
        rollNoTxtFld = new javax.swing.JTextField();
        collegeTxtFld = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        prevBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NAME:");

        jLabel2.setText("AGE:");

        jLabel3.setText("ROLL NO:");

        jLabel4.setText("COLLEGE:");

        nextBtn.setText("Next");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        prevBtn.setText("Prev");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nextBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prevBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(collegeTxtFld)
                        .addComponent(nameTxtFld, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(rollNoTxtFld)
                        .addComponent(ageTxtFld, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ageTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rollNoTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(collegeTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prevBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
    Common deserial = SerialDeserial.deserial("record");
    if (deserial != null) {
        count++;
        Record record = (Record) deserial;
        int maxCount = record.getCount();
        setViewForm(count, 1, maxCount);
    }

}//GEN-LAST:event_nextBtnActionPerformed

private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
    Common deserial = SerialDeserial.deserial("record");
    if (deserial != null) {
        count--;
        System.out.println("count" + count);
        Record record = (Record) deserial;
        int maxCount = record.getCount();
        System.out.println("maxcount" + maxCount);
        setViewForm(count, -1, maxCount);
    }
}//GEN-LAST:event_prevBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ViewForm().setVisible(true);
                new JFrame().setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTxtFld;
    private javax.swing.JTextField collegeTxtFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nameTxtFld;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton prevBtn;
    private javax.swing.JTextField rollNoTxtFld;
    // End of variables declaration//GEN-END:variables

    private void setViewForm(int index, int dir, int max) {

        while (true) {
            File file = new File(index + ".ser");
            if (file.exists()) {
                Common deserial = SerialDeserial.deserial(String.valueOf(index));
                if (deserial != null && deserial instanceof Student) {
                    Student student = (Student) deserial;
                    nameTxtFld.setText(student.getName());
                    ageTxtFld.setText(String.valueOf(student.getAge()));
                    rollNoTxtFld.setText(String.valueOf(student.getRollNo()));
                    collegeTxtFld.setText(student.getCollege());
                    break;
                }
            } else {
                if (index <= 1) {
                    index = 1;
                    count = index;
                    JOptionPane.showMessageDialog(this, "First Record !");
                    break;
                } else if (index > max) {
                    index = max;
                    count = index;
                    JOptionPane.showMessageDialog(this, "Last Record !");
                    break;
                } else {//1.ser 3.ser exists...
                    System.out.println("else record " + index);
                    index += 1 * dir;
                    count = index;
                    
                                   }
            }
        }
    }
    /*rollNo=1,name='manu'*/
}
