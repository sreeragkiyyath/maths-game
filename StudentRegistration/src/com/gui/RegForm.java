package com.gui;

import com.bean.Common;
import com.bean.Record;
import com.bean.Student;
import com.serial.SerialDeserial;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegForm extends javax.swing.JFrame {

    public static String fileName = null;

    public RegForm() {
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
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NAME:");

        jLabel2.setText("AGE:");

        jLabel3.setText("ROLL NO:");

        jLabel4.setText("COLLEGE:");

        submitBtn.setText("SUBMIT");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
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
                    .addComponent(submitBtn)
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
                .addComponent(submitBtn)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
    String name = nameTxtFld.getText();
    String college = collegeTxtFld.getText();
    int age = Integer.parseInt(ageTxtFld.getText());
    int rollNo = Integer.parseInt(rollNoTxtFld.getText());
    dummyButton(name, college, age, rollNo);
}//GEN-LAST:event_submitBtnActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RegForm().setVisible(true);
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
    private javax.swing.JTextField rollNoTxtFld;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

    private void commonSetCount(int cnt) {
        Record record = new Record();
        record.setCount(cnt);
        SerialDeserial.save(record, "record");

    }

    public void dummyButton(String name, String college, int age, int rollNo) {
        if (fileName == null) {
            File file = new File("record.ser");
            if (!file.exists()) {
                commonSetCount(0);
            }

            Common deserial = SerialDeserial.deserial("record");
            if (deserial != null) {
                if (deserial instanceof Record) {
                    Record record = (Record) deserial;
                    int count = record.getCount();
                    count = count + 1;
                    Student student = new Student(name, rollNo, age, college);
                    student.setMetaName(String.valueOf(count) + ".ser");
                    SerialDeserial.save(student, String.valueOf(count));
                    commonSetCount(count);
                    JOptionPane.showMessageDialog(this, "Record Saved");
                    nameTxtFld.setText("");
                    collegeTxtFld.setText("");
                    ageTxtFld.setText("");
                    rollNoTxtFld.setText("");

                }
            }

        } else {

            Student student = new Student(name, rollNo, age, college);
            student.setMetaName(fileName);
            String substring = fileName.substring(0, fileName.indexOf("."));
            System.out.println(substring);
            SerialDeserial.save(student, String.valueOf(substring));
        }
    }
}