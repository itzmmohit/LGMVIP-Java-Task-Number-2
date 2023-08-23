import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
@SuppressWarnings("serial")
public class TicTacToe extends javax.swing.JFrame {
	

    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerocount;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxcount;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;

    private String startGame="X";
    private int xCount=0;
    private int oCount=0;
    
    private String playerXName = "";
    private String playerOName = "";
    private JLabel lblNewLabel_2;

    
    public TicTacToe() {
    	getContentPane().setBackground(new Color(255, 111, 111));
        initComponents();
    }
    
    private void gameScore(){
        playerxcount.setText(String.valueOf(xCount));
        playerocount.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame= "O";
        }
        else{
            startGame="X";
        }
    }
    
    private void WinningGame(){
        String b1= txtbtn1.getText();
        String b2= txtbtn2.getText();
        String b3= txtbtn3.getText();
        
        String b4= txtbtn4.getText();
        String b5= txtbtn5.getText();
        String b6= txtbtn6.getText();
        
        String b7= txtbtn7.getText();
        String b8= txtbtn8.getText();
        String b9= txtbtn9.getText();
        
        if(b1==("X") && b2==("X") && b3==("X")){
            JOptionPane.showMessageDialog(this," "+playerXName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.YELLOW);
            txtbtn2.setBackground(Color.YELLOW);
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b4==("X") && b5==("X") && b6==("X")){
            JOptionPane.showMessageDialog(this," "+playerXName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b7==("X") && b8==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this," "+playerXName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
        }
        if(b1==("X") && b4==("X") && b7==("X")){
            JOptionPane.showMessageDialog(this," "+playerXName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.YELLOW);
            txtbtn4.setBackground(Color.YELLOW);
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b2==("X") && b5==("X") && b8==("X")){
            JOptionPane.showMessageDialog(this," "+playerXName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn1.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b3==("X") && b6==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this," "+playerXName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
        }
        if(b1==("X") && b5==("X") && b9==("X")){
            JOptionPane.showMessageDialog(this," "+playerXName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
        }
        if(b3==("X") && b5==("X") && b7==("X")){
            JOptionPane.showMessageDialog(this," "+playerXName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn7.setBackground(Color.YELLOW);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        
        //PLAYER O CODING
        if(b1==("O") && b2==("O") && b3==("O")){
            JOptionPane.showMessageDialog(this," "+playerOName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b4==("O") && b5==("O") && b6==("O")){
            JOptionPane.showMessageDialog(this," "+playerOName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b7==("O") && b8==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this," "+playerOName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
        }
        if(b1==("O") && b5==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this," "+playerOName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
        }
        if(b3==("O") && b5==("O") && b7==("O")){
            JOptionPane.showMessageDialog(this," "+playerOName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b1==("O") && b4==("O") && b7==("O")){
            JOptionPane.showMessageDialog(this," "+playerOName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn2.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn8.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b2==("O") && b5==("O") && b8==("O")){
            JOptionPane.showMessageDialog(this," "+playerOName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn1.setEnabled(false);
            txtbtn3.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn6.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn9.setEnabled(false);
        }
        if(b3==("O") && b6==("O") && b9==("O")){
            JOptionPane.showMessageDialog(this," "+playerOName+" Wins","Tic Tac Toe",
                    JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            txtbtn1.setEnabled(false);
            txtbtn2.setEnabled(false);
            txtbtn4.setEnabled(false);
            txtbtn5.setEnabled(false);
            txtbtn7.setEnabled(false);
            txtbtn8.setEnabled(false);
        }
    }
    
  
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn3 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(new Color(255, 198, 198));
        playerxcount = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playerocount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-Tac-Toe Task-2");
        setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE");
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mmmeh\\OneDrive\\Documents\\GitHub\\LGMVIP-Java-Task-Number-2\\2.png"));
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mmmeh\\OneDrive\\Documents\\GitHub\\LGMVIP-Java-Task-Number-2\\2.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
        			.addGap(133)
        			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new Color(75, 228, 152));
        txtreset.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        txtexit.setBackground(new Color(255, 49, 49));
        txtexit.setFont(new Font("Segoe UI", Font.BOLD, 14)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerxcount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerxcount.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, new java.awt.Color(255, 255, 255)));

        playero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playero.setText(playerXName);

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerx.setText(playerOName);

        playerocount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerocount.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.white));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerocount, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerxcount, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerxcount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playerocount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        
        JButton btnClear = new JButton();
        btnClear.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		txtbtn1.setEnabled(true);
                txtbtn2.setEnabled(true);
                txtbtn3.setEnabled(true);
                txtbtn4.setEnabled(true);
                txtbtn5.setEnabled(true);
                txtbtn6.setEnabled(true);
                txtbtn7.setEnabled(true);
                txtbtn8.setEnabled(true);
                txtbtn9.setEnabled(true);
                
                txtbtn1.setText(null);
                txtbtn2.setText(null);
                txtbtn3.setText(null);
                
                txtbtn4.setText(null);
                txtbtn5.setText(null);
                txtbtn6.setText(null);
                
                txtbtn7.setText(null);
                txtbtn8.setText(null);
                txtbtn9.setText(null);
                
                txtbtn1.setBackground(Color.LIGHT_GRAY);
                txtbtn2.setBackground(Color.LIGHT_GRAY);
                txtbtn3.setBackground(Color.LIGHT_GRAY);
                
                txtbtn4.setBackground(Color.LIGHT_GRAY);
                txtbtn5.setBackground(Color.LIGHT_GRAY);
                txtbtn6.setBackground(Color.LIGHT_GRAY);
                
                txtbtn7.setBackground(Color.LIGHT_GRAY);
                txtbtn8.setBackground(Color.LIGHT_GRAY);
                txtbtn9.setBackground(Color.LIGHT_GRAY);
                
                showTurnDialog(); // Show whose turn it is
        	}
        });
        btnClear.setText("CLEAR");
        btnClear.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btnClear.setBackground(new Color(230, 230, 74));
        
        lblNewLabel_2 = new JLabel("Made By: Mohit Mehta");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(28)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(txtbtn1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(txtbtn2, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(txtbtn7, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(txtbtn8, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(txtbtn4, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(txtbtn5, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)))
        					.addGap(0, 0, Short.MAX_VALUE)))
        			.addGap(6)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(txtbtn6, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtbtn3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtbtn9, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(42)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(txtreset)
        							.addGap(18)
        							.addComponent(txtexit, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
        							.addGap(9))
        						.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(249)
        					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtbtn2, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtbtn1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtbtn3, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
        					.addGap(15)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtbtn4, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtbtn5, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtbtn6, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(15)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtbtn7, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtbtn8, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtbtn9, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
        					.addContainerGap(20, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(31)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(txtreset, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtexit, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addComponent(lblNewLabel_2)
        					.addGap(8))))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }
    
    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        txtbtn3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn3.setForeground(Color.RED);
        }
        else{
            txtbtn3.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {
        
        txtbtn6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn6.setForeground(Color.RED);
        }
        else{
            txtbtn6.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        txtbtn2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn2.setForeground(Color.RED);
        }
        else{
            txtbtn2.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {
    
         txtbtn1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn1.setForeground(Color.RED);
        }
        else{
            txtbtn1.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }
    
    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {
        txtbtn4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn4.setForeground(Color.RED);
        }
        else{
            txtbtn4.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {
        
        txtbtn5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn5.setForeground(Color.RED);
        }
        else{
            txtbtn5.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {
        
        txtbtn7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn7.setForeground(Color.RED);
        }
        else{
            txtbtn7.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {
       
        txtbtn8.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn8.setForeground(Color.RED);
        }
        else{
            txtbtn8.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {
        txtbtn9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            txtbtn9.setForeground(Color.RED);
        }
        else{
            txtbtn9.setForeground(Color.BLUE);
        }
        choose_a_Player();
        WinningGame();
    }

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	txtbtn1.setEnabled(true);
        txtbtn2.setEnabled(true);
        txtbtn3.setEnabled(true);
        txtbtn4.setEnabled(true);
        txtbtn5.setEnabled(true);
        txtbtn6.setEnabled(true);
        txtbtn7.setEnabled(true);
        txtbtn8.setEnabled(true);
        txtbtn9.setEnabled(true);
        
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
        
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        
        xCount=0;
        oCount=0;
        gameScore();
        
        showTurnDialog(); // Show whose turn it is
    }

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame= new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want Exit",
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        
    }
    
    private void getPlayerNames() {
        playerXName = JOptionPane.showInputDialog(this, "Enter name for Player X:", "Player X Name", JOptionPane.INFORMATION_MESSAGE);
        if (playerXName == null || playerXName.trim().isEmpty()) {
            playerXName = "Player X";
        }

        playerOName = JOptionPane.showInputDialog(this, "Enter name for Player O:", "Player O Name", JOptionPane.INFORMATION_MESSAGE);
        if (playerOName == null || playerOName.trim().isEmpty()) {
            playerOName = "Player O";
        }
        
        updatePlayerLabels(); 
    }

    
    private void updatePlayerLabels() {
        playerx.setText(playerXName + " :");
        playero.setText(playerOName + " :");
    }

    
    private void showTurnDialog() {
        String message = "It's " + (startGame.equals("X") ? playerXName : playerOName) + "'s turn.";
        JOptionPane.showMessageDialog(this, message, "Player Turn", JOptionPane.INFORMATION_MESSAGE);
    }

    

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	TicTacToe game = new TicTacToe();
                game.getPlayerNames();
                game.setVisible(true);
                game.showTurnDialog(); // Show whose turn it is
            }
        });
    }
}
