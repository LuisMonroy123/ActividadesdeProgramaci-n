/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_masa;

/**
 *
 * @author HP
 */
public class calculo_masa extends javax.swing.JFrame {

    /**
     * Creates new form calculo_masa
     */
    public calculo_masa() {
           initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        peso = new javax.swing.JTextField();
        estatura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jlabel = new javax.swing.JLabel();
        masaCorporal = new javax.swing.JLabel();
        estatus = new javax.swing.JLabel();
        masa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        sexo = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Calular masa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 150, 40));
        getContentPane().add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 100, 30));

        estatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estaturaActionPerformed(evt);
            }
        });
        getContentPane().add(estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, 30));

        jLabel1.setBackground(new java.awt.Color(249, 174, 137));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Bienvenido al programa para calcular tu masa corporal corporal<html>");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 660, 70));

        jLabel3.setBackground(new java.awt.Color(222, 111, 111));
        jLabel3.setText("Peso: ");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 30));

        jLabel4.setBackground(new java.awt.Color(222, 111, 111));
        jLabel4.setText("Estatura: ");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 110, 30));

        Jlabel.setBackground(new java.awt.Color(222, 111, 111));
        Jlabel.setText("Estatus");
        Jlabel.setOpaque(true);
        getContentPane().add(Jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 90, 40));

        masaCorporal.setBackground(new java.awt.Color(222, 111, 111));
        masaCorporal.setText("Masa corporal");
        masaCorporal.setOpaque(true);
        getContentPane().add(masaCorporal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 90, 40));

        estatus.setOpaque(true);
        getContentPane().add(estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 160, 40));

        masa.setOpaque(true);
        getContentPane().add(masa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 160, 40));

        jLabel5.setBackground(new java.awt.Color(222, 111, 111));
        jLabel5.setText("Nombre");
        jLabel5.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, 30));

        jLabel6.setBackground(new java.awt.Color(222, 111, 111));
        jLabel6.setText("Edad");
        jLabel6.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 30));

        jLabel9.setBackground(new java.awt.Color(222, 111, 111));
        jLabel9.setText("Sexo");
        jLabel9.setMaximumSize(new java.awt.Dimension(60, 60));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 110, 30));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, 30));
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 30));
        getContentPane().add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, 30));

        info.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        info.setOpaque(true);
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 190, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Captura de pantalla (111).png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 540, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Fondo_tarea.jpg"))); // NOI18N
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estaturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String nom, sex;
    Double pes, altura, imc;
    int age;
    nom=nombre.getText();
    nombre.setText(nom);
    sex=sexo.getText();
    sexo.setText(sex);
    age=Integer.parseInt(edad.getText());
    edad.setText(String.valueOf(age));
    pes=Double.parseDouble(peso.getText());
    peso.setText(String.valueOf(pes));
    altura=Double.parseDouble(estatura.getText());
    estatura.setText(String.valueOf(altura));
    
    imc=pes/(altura*altura);
    masa.setText(String.valueOf(imc));
      if(imc<18.5){
        estatus.setText("Bajo de peso");
        }else if(imc>=18.5 && imc<24.9){
        estatus.setText("Peso saludable");
        }else if(imc>=25 && imc <29.9){
        estatus.setText("Sobrepeso");
        }else if(imc>30){
        estatus.setText("Obesidad");
        }
      info.setText("<html>Hola "+nom+" tienes "+age+" años y eres "+sex+". \nGracias por usar nuestro programa<html>");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(calculo_masa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculo_masa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculo_masa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculo_masa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculo_masa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField estatura;
    private javax.swing.JLabel estatus;
    private javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel masa;
    private javax.swing.JLabel masaCorporal;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField sexo;
    // End of variables declaration//GEN-END:variables
}