package finalhybrid;

import static finalhybrid.RSA.buildKeyPair;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.System.*;

public class hybrid extends javax.swing.JFrame
{
    
    AES AES = new AES();
    RSA RSA =new RSA();
    KeyPair keyPair;
    PublicKey pubKey;
    PrivateKey privateKey;
    String cipherMessage;
    byte [] encryptedKey;
    byte[] secret;
       
   
    
    public hybrid()
    {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        eplainText = new javax.swing.JTextField();
        eencryptionKey = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        eoutputWindow = new javax.swing.JTextArea();
        encryptButton = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        decryptButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        doutputWindow = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HYBRID CRYPTO");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        setForeground(new java.awt.Color(0, 51, 204));
        setResizable(false);

        eplainText.setText("Enter the message ..");
        eplainText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eplainTextMouseClicked(evt);
            }
        });

        eoutputWindow.setColumns(20);
        eoutputWindow.setRows(5);
        jScrollPane1.setViewportView(eoutputWindow);

        encryptButton.setText("Encrypt");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("HYBRID CRYPTO");

        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        doutputWindow.setColumns(20);
        doutputWindow.setRows(5);
        jScrollPane2.setViewportView(doutputWindow);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(encryptButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eencryptionKey, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                            .addComponent(decryptButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eplainText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {decryptButton, eencryptionKey, encryptButton, eplainText, jScrollPane1, jScrollPane2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(eplainText, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eencryptionKey, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(decryptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {decryptButton, eencryptionKey, encryptButton, eplainText});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        // TODO add your handling code here:
       
        if(eplainText.getText() !=null && eencryptionKey.getText()!=null)
        {
            try 
            {
                 long startTime=System.nanoTime();
                //building the keys
                keyPair = buildKeyPair();
                pubKey = keyPair.getPublic();
                privateKey = keyPair.getPrivate();
                //encrypted the message using the secret key
                cipherMessage=AES.encrypt(eplainText.getText(),eencryptionKey.getText());          
                try 
                {
                    //encrypting the secret key using the private key
                    encryptedKey = RSA.encrypt(privateKey,eencryptionKey.getText());
                    long endTime=System.nanoTime();
                    long diff=endTime-startTime;
                    eoutputWindow.setText("Cipher Message:"+AES.encrypt(eplainText.getText(),eencryptionKey.getText())+"Cipher Key:"+new String(encryptedKey)+"Time Required:"+diff+"Message Length:"+eplainText.getText().length());                    
                } 
                catch (Exception ex)
                {
                    Logger.getLogger(hybrid.class.getName()).log(Level.SEVERE, null, ex);
                }              
            } 
            catch (NoSuchAlgorithmException ex)
            {
                Logger.getLogger(hybrid.class.getName()).log(Level.SEVERE, null, ex);
            }          
        }
        else
        {
            eoutputWindow.setText("Unable to encrypt!!Please enter All the field!!");
        }
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        // TODO add your handling code here:
        //dencryptionKey.setText(new String(encryptedKey));
        try 
        {
            long startTime=System.nanoTime();
            secret = RSA.decrypt(pubKey,encryptedKey);//secret key decrypted
            String DecryptedMessage=AES.decrypt(cipherMessage,  new String(secret));
            long endTime=System.nanoTime();
            long diff=endTime-startTime;
            doutputWindow.setText("Decrypted Message:"+DecryptedMessage+"Decrypted Key:"+new String(secret)+"Time Required:"+diff);
        } 
        catch (Exception ex)
        {
            Logger.getLogger(hybrid.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void eplainTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eplainTextMouseClicked
        // TODO add your handling code here:
        eplainText.setText(" ");
    }//GEN-LAST:event_eplainTextMouseClicked

   
    public static void main(String args[]) 
    {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hybrid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(() -> {
            new hybrid().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decryptButton;
    private javax.swing.JTextArea doutputWindow;
    private javax.swing.JPasswordField eencryptionKey;
    private javax.swing.JButton encryptButton;
    private javax.swing.JTextArea eoutputWindow;
    private javax.swing.JTextField eplainText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
