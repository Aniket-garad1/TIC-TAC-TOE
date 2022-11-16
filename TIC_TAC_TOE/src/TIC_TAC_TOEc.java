
import static java.awt.Color.magenta;
import static java.awt.Color.red;
import static java.awt.Color.orange;
import static java.awt.Color.gray;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class TIC_TAC_TOEc extends javax.swing.JFrame {

     private String turn ="O";
     private int xcount=0;
     private int ocount=0;
     
    public TIC_TAC_TOEc() {
        initComponents();
    }
    
    private void ChoosePlayer()
    {
        if(turn.equalsIgnoreCase("X"))
        {
            turn="O";
        }else{
            turn="X";
        }
    }
    
    private void SetScore(){
        
        xscore.setText(String.valueOf(xcount));
        oscore.setText(String.valueOf(ocount));
        
    }
    
    public void winingGame()
    {
        String btn1 = txtbtn1.getText();
        String btn2 = txtbtn2.getText();
        String btn3 = txtbtn3.getText();
        String btn4 = txtbtn4.getText();
        String btn5 = txtbtn5.getText();
        String btn6 = txtbtn6.getText();
        String btn7 = txtbtn7.getText();
        String btn8 = txtbtn8.getText();
        String btn9 = txtbtn9.getText();

            if((btn1 == btn2) && (btn2 == btn3) && (btn1 != "")){
            
            String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
            txtbtn1.setBackground(orange);
            txtbtn2.setBackground(orange);
            txtbtn3.setBackground(orange);              
           
            }else if((btn4 == btn5)&&(btn5 == btn6) && (btn4 != "")){
                 String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             txtbtn4.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn6.setBackground(orange); 
            }else if((btn7 == btn8)&&(btn8 == btn9) && (btn7 != "")){
                 String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             txtbtn7.setBackground(orange);
            txtbtn8.setBackground(orange);
            txtbtn9.setBackground(orange);
            }else if((btn1 == btn4)&&(btn4 == btn7) && (btn1 != "")){
                 String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             txtbtn1.setBackground(orange);
            txtbtn4.setBackground(orange);
            txtbtn7.setBackground(orange);
            }else if((btn2 == btn5)&&(btn5 == btn8) && (btn2 != "")){
                 String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             txtbtn2.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn8.setBackground(orange);
            }else if((btn3 == btn6)&&(btn6 == btn9) && (btn3 != "")){
                 String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             txtbtn3.setBackground(orange);
            txtbtn6.setBackground(orange);
            txtbtn9.setBackground(orange);
            }else if((btn1 == btn5)&&(btn5 == btn9) && (btn1 != "")){
                 String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             txtbtn1.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn9.setBackground(orange);
            
            }else if((btn3 == btn5) && (btn5 == btn7) && (btn3 != "")){
                 String msg;
            if(turn.equalsIgnoreCase("O")){
                msg="Player O Wins";
                ocount++;
            }else{
                msg="Player X Wins";
                xcount++;
            }
            
            JOptionPane.showMessageDialog(this, msg,"Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
             txtbtn3.setBackground(orange);
            txtbtn5.setBackground(orange);
            txtbtn7.setBackground(orange);
            }
            SetScore();
            
    }
    
    

    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE");
        setBackground(new java.awt.Color(204, 204, 0));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        txtbtn1.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn7.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 51, 51));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        txtbtn9.setBackground(new java.awt.Color(153, 153, 153));
        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(153, 255, 153));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 102, 255));
        jLabel2.setText("Scorecard");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Player O :-");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Player X :-");

        xscore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        xscore.setForeground(new java.awt.Color(153, 0, 153));
        xscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xscore.setText("______");
        xscore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        oscore.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        oscore.setForeground(new java.awt.Color(153, 0, 153));
        oscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oscore.setText("______");
        oscore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        oscore.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xscore)
                            .addComponent(oscore))))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(jLabel4)
                    .addContainerGap(198, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(xscore)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oscore))
                .addGap(54, 54, 54))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(104, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
          if(txtbtn3.getText()!="")
        {
            return;
        }
        txtbtn3.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn3.setForeground(red);
        }else{
            txtbtn3.setForeground(magenta);
        }
         winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn3ActionPerformed

     
    
    
    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
      
        JFrame frame =new JFrame("Exit");
        
        
        if(JOptionPane.showConfirmDialog(frame,"confurm if you want to exit","TIC_TAC_TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    
    
    
    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
          if(txtbtn1.getText()!="")
        {
            return;
        }
        txtbtn1.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn1.setForeground(red);
        }else{
            txtbtn1.setForeground(magenta);
        }
        winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    
    
    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        if(txtbtn2.getText()!="")
        {
            return;
        }
        txtbtn2.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn2.setForeground(red);
        }else{
            txtbtn2.setForeground(magenta);
        }
         winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    
    
    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
          if(txtbtn4.getText()!="")
        {
            return;
        }
        txtbtn4.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn4.setForeground(red);
        }else{
            txtbtn4.setForeground(magenta);
        }
           winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    
    
    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
         if(txtbtn5.getText()!="")
        {
            return;
        }
        txtbtn5.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn5.setForeground(red);
        }else{
            txtbtn5.setForeground(magenta);
        }
           winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    
    
    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
 
             if(txtbtn6.getText()!="")
        {
            return;
        }
        txtbtn6.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn6.setForeground(red);
        }else{
            txtbtn6.setForeground(magenta);
        }
           winingGame();
        ChoosePlayer();
             
    }//GEN-LAST:event_txtbtn6ActionPerformed

    
    
    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        if(txtbtn7.getText()!="")
        {
            return;
        }
        
        txtbtn7.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn7.setForeground(red);
        }else{
            txtbtn7.setForeground(magenta);
        }
        winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    
    
    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
          if(txtbtn8.getText()!="")
        {
            return;
        }
        txtbtn8.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn8.setForeground(red);
        }else{
            txtbtn8.setForeground(magenta);
        }
          winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    
    
    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
         if(txtbtn9.getText() != "")
        {
            return;
        }
        
        txtbtn9.setText(turn);
        
        if(turn.equalsIgnoreCase("X"))
        {
            txtbtn9.setForeground(red);
        }else{
            txtbtn9.setForeground(magenta);
        }
          winingGame();
        ChoosePlayer();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        
        txtbtn1.setText("");
        txtbtn2.setText("");
        txtbtn3.setText("");
        txtbtn4.setText("");
        txtbtn5.setText("");
        txtbtn6.setText("");
        txtbtn7.setText("");
        txtbtn8.setText("");
        txtbtn9.setText("");
        
        txtbtn1.setBackground(gray);
        txtbtn2.setBackground(gray);
        txtbtn3.setBackground(gray);
        txtbtn4.setBackground(gray);
        txtbtn5.setBackground(gray);
        txtbtn6.setBackground(gray);
        txtbtn7.setBackground(gray);
        txtbtn8.setBackground(gray);
        txtbtn9.setBackground(gray);
    }//GEN-LAST:event_resetbtnActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOEc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOEc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel oscore;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
