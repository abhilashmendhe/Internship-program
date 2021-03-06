/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dorabjeestore;

/**
 *
 * @author abhil
 */
import StockOperations.FetchAllStockMaker;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class OutOfStockFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewStockFrame
     */
    public OutOfStockFrame() {
        super("Out of Stock");
        initComponents();
        jPanel1.setBackground(EmployeeLoginFrame.p1);
        jTable1.setBackground(EmployeeLoginFrame.p2);
        ArrayList stock = new FetchAllStockMaker().fetchallstock();
        int rowsize = stock.size();
        ArrayList col = (ArrayList) stock.get(0);
       
        int columnsize = col.size();
        String stockmat[][] = new String[rowsize][columnsize];
        int s = 0;
        for(int i=0; i<stockmat.length; i++)
        {
            ArrayList temp = (ArrayList) stock.get(i);
            int ostock = Integer.parseInt((String) temp.get(4));
            for(int j=0; j<stockmat[0].length; j++)
            if(ostock < 30)
            {
                s++;
                break;
            }
        }
        
        String stockmatinsert[][]=new String[s][columnsize];
        int k=0;
        for(int i=0; i<stockmat.length; i++)
        {
            ArrayList temp1 = (ArrayList) stock.get(i);
            int ostock = Integer.parseInt((String) temp1.get(4));
            if(ostock < 30)
            {
                for(int j=0; j<stockmat[0].length; j++)
                {
                    String temppp = (String) temp1.get(j);        
                    stockmatinsert[k][j] = temppp;     
                } 
                k++;
            } 
            System.out.println();
        }
        String column[] = {"Item Code", "Item Name", "Unit", "Price Per Unit", "Stock", "Date and Time"};
        
        jTable1.setRowHeight(40);
        jTable1.setModel(new DefaultTableModel(stockmatinsert, column));
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 3, 52)); // NOI18N
        jLabel1.setText("Dorabjee Super Market");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(260, 260, 260))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(434, 13, 1178, 115);

        jTable1.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 150, 1896, 882);

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/abhilash/Internship-program-1/Dorabjee Store/superstore.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1050);

        jMenuBar1.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N

        jMenu1.setText("Edit Profile");
        jMenu1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem1.setText("Update Admin Credentials");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Staff Management");
        jMenu2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem2.setText("Create Staff");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem3.setText("Staff Updation");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem4.setText("View Staff");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Stock Management");
        jMenu3.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem6.setText("Add Stock Item");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem7.setText("Update Stock Item");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem9.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem9.setText("View All Stocks");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem8.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem8.setText("Out Of Stock");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Exit");
        jMenu4.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jMenuItem5.setText("Logout");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        AdminCredsUpdateFrame adcredup = new AdminCredsUpdateFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        adcredup.setVisible(true);
        adcredup.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        CreateStaffFrame cs = new CreateStaffFrame();
        cs.setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        cs.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
        UpdateStaffFrame us = new UpdateStaffFrame();
        us.setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        us.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        ViewStaffFrame vs = new ViewStaffFrame();
        vs.setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        vs.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        this.dispose();
        AddStockItemFrame adi = new AddStockItemFrame();
        adi.setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        adi.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        this.dispose();
        UpdateStockItemFrame usi = new UpdateStockItemFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        usi.setVisible(true);
        usi.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        this.dispose();
        OutOfStockFrame vs = new OutOfStockFrame();
        vs.setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        vs.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.dispose();
        EmployeeLoginFrame ad = new EmployeeLoginFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        ad.setVisible(true);
        ad.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.dispose();
        ViewAllStockFrame vas = new ViewAllStockFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        vas.setVisible(true);
        vas.setSize(d);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(OutOfStockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutOfStockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutOfStockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutOfStockFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutOfStockFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
