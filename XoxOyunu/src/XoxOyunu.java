
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sina Arda
 */
public class XoxOyunu extends javax.swing.JFrame {
   int sayi= 0;
   int [] kullanilanButonlar={0,0,0,0,0,0,0,0,0};
   int [] xKazanmasi= {0,0,0,0,0,0,0,0,0};
   int [] oKazanmasi= {0,0,0,0,0,0,0,0,0};
   boolean bitis=false;
   public int xKazansin(){
     if (xKazanmasi[0]==1 && xKazanmasi[1]== 1 && xKazanmasi[2]==1){
      return 1;
     }
     if (xKazanmasi[3]==1 && xKazanmasi[4]== 1 && xKazanmasi[5]==1){
      return 1;
     }
     if (xKazanmasi[6]==1 && xKazanmasi[7]== 1 && xKazanmasi[8]==1){
      return 1;
     } 
      if (xKazanmasi[0]==1 && xKazanmasi[3]== 1 && xKazanmasi[6]==1){
      return 1;
     }
      if (xKazanmasi[1]==1 && xKazanmasi[4]== 1 && xKazanmasi[7]==1){
      return 1;
     }
       if (xKazanmasi[2]==1 && xKazanmasi[5]== 1 && xKazanmasi[8]==1){
      return 1;
     }
      if (xKazanmasi[0]==1 && xKazanmasi[4]== 1 && xKazanmasi[8]==1){
      return 1;
     }
      if (xKazanmasi[2]==1 && xKazanmasi[4]== 1 && xKazanmasi[6]==1){
      return 1;
     }
     return 0;
   }
    public int oKazansin(){
     if (oKazanmasi[0]==1 && oKazanmasi[1]== 1 && oKazanmasi[2]==1){
      return 1;
     }
     if (oKazanmasi[3]==1 && oKazanmasi[4]== 1 && oKazanmasi[5]==1){
      return 1;
     }
     if (oKazanmasi[6]==1 && oKazanmasi[7]== 1 && oKazanmasi[8]==1){
      return 1;
     } 
      if (oKazanmasi[0]==1 && oKazanmasi[3]== 1 && oKazanmasi[6]==1){
      return 1;
     }
      if (oKazanmasi[1]==1 && oKazanmasi[4]== 1 && oKazanmasi[7]==1){
      return 1;
     }
       if (oKazanmasi[2]==1 && oKazanmasi[5]== 1 && oKazanmasi[8]==1){
      return 1;
     }
      if (oKazanmasi[0]==1 && oKazanmasi[4]== 1 && oKazanmasi[8]==1){
      return 1;
     }
      if (oKazanmasi[2]==1 && oKazanmasi[4]== 1 && oKazanmasi[6]==1){
      return 1;
     }
     return 0;
   }
   /**
     * Creates new form XoxOyunu
     */
    public XoxOyunu() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(this);
    }
    public void resetle(){
    btn1.setText("");
    btn2.setText("");
    btn3.setText("");
    btn4.setText("");
    btn5.setText("");
    btn6.setText("");
    btn7.setText("");
    btn8.setText("");
    btn9.setText("");
    sıra.setText("X'de");
    sayi=0;
    for(int i = 0; i < kullanilanButonlar.length; i++) {
        kullanilanButonlar[i]=0;
        xKazanmasi[i]=0;
        oKazanmasi[i]=0;
    }
  
    }
     public void oyunBitir(boolean kontrol){
if (kontrol==true){
    JOptionPane.showMessageDialog(rootPane, "Oyun bitti! Yeniden Başlatılıyor...");
    resetle();
   }
int berabere=0;


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
        jLabel2 = new javax.swing.JLabel();
        sıra = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        restart = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Tic Tac Toe");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Oyun Sırası-->");

        sıra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sıra.setForeground(new java.awt.Color(204, 204, 0));
        sıra.setText("X'de");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sıra, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sıra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        btn9.setBackground(new java.awt.Color(102, 0, 51));
        btn9.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn9.setForeground(new java.awt.Color(0, 0, 102));
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(102, 0, 51));
        btn4.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn4.setForeground(new java.awt.Color(0, 0, 102));
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(102, 0, 51));
        btn5.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn5.setForeground(new java.awt.Color(0, 0, 102));
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(102, 0, 51));
        btn7.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn7.setForeground(new java.awt.Color(0, 0, 102));
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(102, 0, 51));
        btn1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn1.setForeground(new java.awt.Color(0, 0, 102));
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(102, 0, 51));
        btn8.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn8.setForeground(new java.awt.Color(0, 0, 102));
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(102, 0, 51));
        btn2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn2.setForeground(new java.awt.Color(0, 0, 102));
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 0, 51));
        btn3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn3.setForeground(new java.awt.Color(0, 0, 102));
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(102, 0, 51));
        btn6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        btn6.setForeground(new java.awt.Color(0, 0, 102));
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 5));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        restart.setBackground(new java.awt.Color(0, 0, 102));
        restart.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        restart.setForeground(new java.awt.Color(102, 0, 0));
        restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/26715-6-restart-photo-ezgif.com-resize.png"))); // NOI18N
        restart.setBorderPainted(false);
        restart.setContentAreaFilled(false);
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       if(kullanilanButonlar[8]==0) {
     
        if(sayi%2==0) {
           btn9.setText("X");
        sayi++;
        kullanilanButonlar[8]= 1;
       
        xKazanmasi[8]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn9.setText("O");
        sayi++;
       kullanilanButonlar[8]= 1;
       
        oKazanmasi[8]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}
  
    }//GEN-LAST:event_btn9ActionPerformed
    
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       if(kullanilanButonlar[3]==0) {
     
        if(sayi%2==0) {
           btn4.setText("X");
        sayi++;
        kullanilanButonlar[3]= 1;
       
        xKazanmasi[3]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn4.setText("O");
        sayi++;
       kullanilanButonlar[3]= 1;
       
        oKazanmasi[3]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}

       
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       if(kullanilanButonlar[4]==0) {
     
        if(sayi%2==0) {
           btn5.setText("X");
        sayi++;
        kullanilanButonlar[4]= 1;
       
        xKazanmasi[4]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn5.setText("O");
        sayi++;
       kullanilanButonlar[4]= 1;
       
        oKazanmasi[4]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
         if(kullanilanButonlar[6]==0) {
     
        if(sayi%2==0) {
           btn7.setText("X");
        sayi++;
        kullanilanButonlar[6]= 1;
       
        xKazanmasi[6]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn7.setText("O");
        sayi++;
       kullanilanButonlar[6]= 1;
       
        oKazanmasi[6]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}

    }//GEN-LAST:event_btn7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
     if(kullanilanButonlar[0]==0) {
     
        if(sayi%2==0) {
           btn1.setText("X");
        sayi++;
        kullanilanButonlar[0]= 1;
       
        xKazanmasi[0]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn1.setText("O");
        sayi++;
       kullanilanButonlar[0]= 1;
       
        oKazanmasi[0]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
      if(kullanilanButonlar[7]==0) {
     
        if(sayi%2==0) {
           btn8.setText("X");
        sayi++;
        kullanilanButonlar[7]= 1;
       
        xKazanmasi[7]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn8.setText("O");
        sayi++;
       kullanilanButonlar[7]= 1;
       
        oKazanmasi[7]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if(kullanilanButonlar[1]==0) {
     
        if(sayi%2==0) {
           btn2.setText("X");
        sayi++;
        kullanilanButonlar[1]= 1;
       
        xKazanmasi[1]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn2.setText("O");
        sayi++;
       kullanilanButonlar[1]= 1;
       
        oKazanmasi[1]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}

        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       if(kullanilanButonlar[2]==0) {
     
        if(sayi%2==0) {
           btn3.setText("X");
        sayi++;
        kullanilanButonlar[2]= 1;
       
        xKazanmasi[2]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn3.setText("O");
        sayi++;
       kullanilanButonlar[2]= 1;
       
        oKazanmasi[2]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}

        
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       if(kullanilanButonlar[5]==0) {
     
        if(sayi%2==0) {
           btn6.setText("X");
        sayi++;
        kullanilanButonlar[5]= 1;
       
        xKazanmasi[5]=1;
        
        int resultX=xKazansin();
        int resultO=oKazansin();
        if(resultX==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> X");
        }
        if(resultO==1) {
            JOptionPane.showMessageDialog(rootPane, "Kazanan --> O");
        }
        } 
       else{
           btn6.setText("O");
        sayi++;
       kullanilanButonlar[5]= 1;
       
        oKazanmasi[5]=1;

       }
        }else JOptionPane.showMessageDialog(rootPane, "Hamle değiştirilmez birader!");   
      
     
     if (sayi%2==0){
   sıra.setText("X'de");
} else{
   sıra.setText("O'da");
}

    }//GEN-LAST:event_btn6ActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
    resetle();
    }//GEN-LAST:event_restartActionPerformed

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
            java.util.logging.Logger.getLogger(XoxOyunu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XoxOyunu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XoxOyunu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XoxOyunu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XoxOyunu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton restart;
    private javax.swing.JLabel sıra;
    // End of variables declaration//GEN-END:variables
}
