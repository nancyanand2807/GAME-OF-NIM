/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttaiit.blogspot.com;
import javax.swing.JOptionPane;

/**
 *
 * @author shikha
 */
public class fork extends javax.swing.JFrame {
int arr[] = new int[2];
int a[]=new int[5]; 
int r[]=new int[7];
protected static int p=2; protected static int q=5; 
protected static int s=7;
        int flag=0;

    /**
    /**
     * Creates new form fork
     */
    public fork() {
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

        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        L12 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        L14 = new javax.swing.JLabel();
        L15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L1.setText("jLabel1");

        L2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L2.setText("jLabel2");

        L4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L4.setText("jLabel4");

        L5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L5.setText("jLabel5");

        L6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L6.setText("jLabel6");

        L7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L7.setText("jLabel7");

        L8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L8.setText("jLabel8");

        L9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L9.setText("jLabel9");

        L10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L10.setText("jLabel10");

        L12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L12.setText("jLabel11");

        L11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L11.setText("jLabel12");

        L13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L13.setText("jLabel13");

        L14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L14.setText("jLabel14");

        L15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ttaiit/blogspot/com/imagess/iconfinder_fork_2693199.png"))); // NOI18N
        L15.setText("jLabel15");

        jButton1.setText("ROW 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ROW 2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("ROW 3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("PC MOVES");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(L10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(L11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(L12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(L14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(L15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(363, 363, 363))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L7)
                            .addComponent(L8)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(L11)
                                .addComponent(L12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(L13)
                                .addComponent(L14, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(L15)
                                .addComponent(L10)
                                .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L4)
                            .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(flag==0){
        flag=1;}
        if(flag==1){
        p--;
        if(arr[0]==0){
             L1.setVisible(false);
             arr[0]=1;
         }
         else
           {
             L2.setVisible(false);
            arr[1]=1;
           }
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      if(flag==0){
        flag=2;}
      if(flag==2){
        q--;
        if(a[0]==0){
             L4.setVisible(false);
             a[0]=1;
         }
           else if(a[1]==0)
            {
             L5.setVisible(false);
             a[1]=1;
          }
          else if(a[2]==0)
           {
             L6.setVisible(false);
             a[2]=1;
           }
           else if(a[3]==0)
           {
             L7.setVisible(false);
             a[3]=1;
           }
              else
             {
             L8.setVisible(false);
             a[4]=1;
             }}
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if(flag==0){
        flag=3;}
        if(flag==3){
        
        s--;
        if(r[0]==0)
        {
             L9.setVisible(false);
             r[0]=1;
         }
        else if(r[1]==0)
            {
             L10.setVisible(false);
             r[1]=1;
          }
        else if(r[2]==0)
           {
             L11.setVisible(false);
             r[2]=1;
           }
        else if(r[3]==0)
          {
             L12.setVisible(false);
             r[3]=1;
           }
        else if(r[4]==0)
          {
             L13.setVisible(false);
             r[4]=1;
           }
        else if(r[5]==0)
           {
             L14.setVisible(false);
             r[5]=1;
         }
        
           else
            {
             L15.setVisible(false);
             r[6]=1;
            }}
    }//GEN-LAST:event_jButton3MouseClicked
   private int[] nimsum(int p,int q,int s){
      System.out.printf(""+ p+q+s);
      int pos=0,nof=0;
       int sum[][]=new int[3][3];
       for(int i=0;i<3;i++){
           if(i==0){
               sum[i][0]=p/4;
               sum[i][1]=(p%4)/2;
               sum[i][2]=((p%4)%2)/1;
               
           }
           if(i==1){
                 sum[i][0]=q/4;
               sum[i][1]=(q%4)/2;
               sum[i][2]=((q%4)%2)/1;
               
           }
           if(i==2){
             sum[i][0]=p/4;
               sum[i][1]=(p%4)/2;
               sum[i][2]=((p%4)%2)/1;
               
           }
           }
       for(int i=0;i<3;i++){
           int y=0;
           for(int j=0;j<3;j++){
             y=(y +sum[j][i]);
           }
           y=y%2;
       if(y==1){
           nof=i;
           break;
       }
       }
    
       for(int j=0; j<3; j++){
          if(sum[j][nof]==1){
              pos=j;
          } }
          if(nof==0){
              nof=4;
          }
          
          if(nof==1){
              nof=2;
          }
          
          if(nof==2){
              nof=1;
          }
        //  System.out.println(""+nof);
      // System.out.println(""+pos);
       int posnof[] = new int[]{nof, pos};
        for(int i=0;i<2;i++)
        System.out.println("" + posnof[i]);
       return (posnof);
               
   }
    
    
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
      
        flag=0;
        int[] copy=  nimsum(p,q,s);
                for(int i=0;i<2;i++){
        System.out.println("" + copy[i]);
                }
        int n=0;
        if(copy[1]==0){
           if(arr[0]==0){
             L1.setVisible(false);
             arr[0]=1;
         }
           else
           {
             L2.setVisible(false);
            arr[1]=1;
              
                }
        } 
        if(copy[1]==0){
            if(copy[0]==4){
            L14.setVisible(false);
         JOptionPane.showMessageDialog(null,"As pc makes the last move pc wons!!!!");
    }
}

         
        if(copy[1]==1){
           if(copy[0]==4){
               q=q-4;
               L4.setVisible(false);
               a[0]=1;a[1]=1;
               a[2]=2;a[3]=1;
               L5.setVisible(false);
               L6.setVisible(false);
               L7.setVisible(false);
           }
        }
        if(copy[1]==1){
           
        if(copy[0]==1){
            q=q-1;
               L8.setVisible(false);
               a[4]=1;
           }
          
        }
            
       
        
        
     
        
    }
    

      //  if(a[0]==1){
       //      L9.setVisible(false);
      //        L10.setVisible(false);
       // }
        //if((arr[0]==1) && arr[1]==1){
         //   L15.setVisible(false);
        /*}
        if((a[1]==1) && (a[2]==1) && (a[3]==1) && (a[4]==1)){
            L11.setVisible(false);
              L12.setVisible(false);
              L13.setVisible(false);
              L14.setVisible(false);
            JOptionPane.showMessageDialog(null,"As pc makes the last move pc wins!!!!");
        }}
    
    }//GEN-LAST:event_jButton4MouseClicked
*/
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
            java.util.logging.Logger.getLogger(fork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fork.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L15;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
