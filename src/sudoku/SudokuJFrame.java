/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sudoku;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class SudokuJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SudokuJFrame
     */
    public SudokuJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblSudoku.setFont(new Font("arial",Font.BOLD,25));
        c1.setFont(new Font("arial",Font.PLAIN,25));
        c2.setFont(new Font("arial",Font.PLAIN,25));
        c3.setFont(new Font("arial",Font.PLAIN,25));
        c4.setFont(new Font("arial",Font.PLAIN,25));
        c5.setFont(new Font("arial",Font.PLAIN,25));
        c6.setFont(new Font("arial",Font.PLAIN,25));
        c7.setFont(new Font("arial",Font.PLAIN,25));
        c8.setFont(new Font("arial",Font.PLAIN,25));
        c9.setFont(new Font("arial",Font.PLAIN,25));
        
        c10.setFont(new Font("arial",Font.PLAIN,25));
        c11.setFont(new Font("arial",Font.PLAIN,25));
        c12.setFont(new Font("arial",Font.PLAIN,25));
        c13.setFont(new Font("arial",Font.PLAIN,25));
        c14.setFont(new Font("arial",Font.PLAIN,25));
        c15.setFont(new Font("arial",Font.PLAIN,25));
        c16.setFont(new Font("arial",Font.PLAIN,25));
        c17.setFont(new Font("arial",Font.PLAIN,25));
        c18.setFont(new Font("arial",Font.PLAIN,25));
        
        c19.setFont(new Font("arial",Font.PLAIN,25));
        c20.setFont(new Font("arial",Font.PLAIN,25));
        c21.setFont(new Font("arial",Font.PLAIN,25));
        c22.setFont(new Font("arial",Font.PLAIN,25));
        c23.setFont(new Font("arial",Font.PLAIN,25));
        c24.setFont(new Font("arial",Font.PLAIN,25));
        c25.setFont(new Font("arial",Font.PLAIN,25));
        c26.setFont(new Font("arial",Font.PLAIN,25));
        c27.setFont(new Font("arial",Font.PLAIN,25));
        
        c28.setFont(new Font("arial",Font.PLAIN,25));
        c29.setFont(new Font("arial",Font.PLAIN,25));
        c30.setFont(new Font("arial",Font.PLAIN,25));
        c31.setFont(new Font("arial",Font.PLAIN,25));
        c32.setFont(new Font("arial",Font.PLAIN,25));
        c33.setFont(new Font("arial",Font.PLAIN,25));
        c34.setFont(new Font("arial",Font.PLAIN,25));
        c35.setFont(new Font("arial",Font.PLAIN,25));
        c36.setFont(new Font("arial",Font.PLAIN,25));
        
        c37.setFont(new Font("arial",Font.PLAIN,25));
        c38.setFont(new Font("arial",Font.PLAIN,25));
        c39.setFont(new Font("arial",Font.PLAIN,25));
        c40.setFont(new Font("arial",Font.PLAIN,25));
        c41.setFont(new Font("arial",Font.PLAIN,25));
        c42.setFont(new Font("arial",Font.PLAIN,25));
        c43.setFont(new Font("arial",Font.PLAIN,25));
        c44.setFont(new Font("arial",Font.PLAIN,25));
        c45.setFont(new Font("arial",Font.PLAIN,25));
        
        c46.setFont(new Font("arial",Font.PLAIN,25));
        c47.setFont(new Font("arial",Font.PLAIN,25));
        c48.setFont(new Font("arial",Font.PLAIN,25));
        c49.setFont(new Font("arial",Font.PLAIN,25));
        c50.setFont(new Font("arial",Font.PLAIN,25));
        c51.setFont(new Font("arial",Font.PLAIN,25));
        c52.setFont(new Font("arial",Font.PLAIN,25));
        c53.setFont(new Font("arial",Font.PLAIN,25));
        c54.setFont(new Font("arial",Font.PLAIN,25));
        
        c55.setFont(new Font("arial",Font.PLAIN,25));
        c56.setFont(new Font("arial",Font.PLAIN,25));
        c57.setFont(new Font("arial",Font.PLAIN,25));
        c58.setFont(new Font("arial",Font.PLAIN,25));
        c59.setFont(new Font("arial",Font.PLAIN,25));
        c60.setFont(new Font("arial",Font.PLAIN,25));
        c61.setFont(new Font("arial",Font.PLAIN,25));
        c62.setFont(new Font("arial",Font.PLAIN,25));
        c63.setFont(new Font("arial",Font.PLAIN,25));
        
        c64.setFont(new Font("arial",Font.PLAIN,25));
        c65.setFont(new Font("arial",Font.PLAIN,25));
        c66.setFont(new Font("arial",Font.PLAIN,25));
        c67.setFont(new Font("arial",Font.PLAIN,25));
        c68.setFont(new Font("arial",Font.PLAIN,25));
        c69.setFont(new Font("arial",Font.PLAIN,25));
        c70.setFont(new Font("arial",Font.PLAIN,25));
        c71.setFont(new Font("arial",Font.PLAIN,25));
        c72.setFont(new Font("arial",Font.PLAIN,25));
        
        c73.setFont(new Font("arial",Font.PLAIN,25));
        c74.setFont(new Font("arial",Font.PLAIN,25));
        c75.setFont(new Font("arial",Font.PLAIN,25));
        c76.setFont(new Font("arial",Font.PLAIN,25));
        c77.setFont(new Font("arial",Font.PLAIN,25));
        c78.setFont(new Font("arial",Font.PLAIN,25));
        c79.setFont(new Font("arial",Font.PLAIN,25));
        c80.setFont(new Font("arial",Font.PLAIN,25));
        c81.setFont(new Font("arial",Font.PLAIN,25));  
        
        
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c2 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c20 = new javax.swing.JTextField();
        c19 = new javax.swing.JTextField();
        c21 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c15 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c23 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c22 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c24 = new javax.swing.JTextField();
        c14 = new javax.swing.JTextField();
        c16 = new javax.swing.JTextField();
        c18 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c26 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c25 = new javax.swing.JTextField();
        c9 = new javax.swing.JTextField();
        c27 = new javax.swing.JTextField();
        c17 = new javax.swing.JTextField();
        lblSudoku = new javax.swing.JLabel();
        c38 = new javax.swing.JTextField();
        c37 = new javax.swing.JTextField();
        c39 = new javax.swing.JTextField();
        c47 = new javax.swing.JTextField();
        c46 = new javax.swing.JTextField();
        c48 = new javax.swing.JTextField();
        c40 = new javax.swing.JTextField();
        c42 = new javax.swing.JTextField();
        c32 = new javax.swing.JTextField();
        c50 = new javax.swing.JTextField();
        c29 = new javax.swing.JTextField();
        c28 = new javax.swing.JTextField();
        c30 = new javax.swing.JTextField();
        c31 = new javax.swing.JTextField();
        c49 = new javax.swing.JTextField();
        c33 = new javax.swing.JTextField();
        c51 = new javax.swing.JTextField();
        c41 = new javax.swing.JTextField();
        c43 = new javax.swing.JTextField();
        c45 = new javax.swing.JTextField();
        c35 = new javax.swing.JTextField();
        c53 = new javax.swing.JTextField();
        c34 = new javax.swing.JTextField();
        c52 = new javax.swing.JTextField();
        c36 = new javax.swing.JTextField();
        c54 = new javax.swing.JTextField();
        c44 = new javax.swing.JTextField();
        c55 = new javax.swing.JTextField();
        c56 = new javax.swing.JTextField();
        c57 = new javax.swing.JTextField();
        c58 = new javax.swing.JTextField();
        c59 = new javax.swing.JTextField();
        c60 = new javax.swing.JTextField();
        c61 = new javax.swing.JTextField();
        c62 = new javax.swing.JTextField();
        c63 = new javax.swing.JTextField();
        c64 = new javax.swing.JTextField();
        c65 = new javax.swing.JTextField();
        c66 = new javax.swing.JTextField();
        c67 = new javax.swing.JTextField();
        c68 = new javax.swing.JTextField();
        c69 = new javax.swing.JTextField();
        c70 = new javax.swing.JTextField();
        c71 = new javax.swing.JTextField();
        c72 = new javax.swing.JTextField();
        c73 = new javax.swing.JTextField();
        c74 = new javax.swing.JTextField();
        c75 = new javax.swing.JTextField();
        c76 = new javax.swing.JTextField();
        c77 = new javax.swing.JTextField();
        c78 = new javax.swing.JTextField();
        c79 = new javax.swing.JTextField();
        c80 = new javax.swing.JTextField();
        c81 = new javax.swing.JTextField();
        btnResolver = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        c2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c2MousePressed(evt);
            }
        });
        c2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c2KeyPressed(evt);
            }
        });

        c1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c1MousePressed(evt);
            }
        });
        c1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                c1InputMethodTextChanged(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        c1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c1KeyPressed(evt);
            }
        });

        c3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c3MousePressed(evt);
            }
        });
        c3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c3KeyPressed(evt);
            }
        });

        c11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c11KeyPressed(evt);
            }
        });

        c10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c10KeyPressed(evt);
            }
        });

        c12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c12KeyPressed(evt);
            }
        });

        c20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c20KeyPressed(evt);
            }
        });

        c19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c19KeyPressed(evt);
            }
        });

        c21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c21KeyPressed(evt);
            }
        });

        c13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c13KeyPressed(evt);
            }
        });

        c15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c15KeyPressed(evt);
            }
        });

        c5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c5KeyPressed(evt);
            }
        });

        c23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c23KeyPressed(evt);
            }
        });

        c4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                c4MousePressed(evt);
            }
        });
        c4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c4KeyPressed(evt);
            }
        });

        c22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c22KeyPressed(evt);
            }
        });

        c6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c6KeyPressed(evt);
            }
        });

        c24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c24KeyPressed(evt);
            }
        });

        c14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c14KeyPressed(evt);
            }
        });

        c16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c16KeyPressed(evt);
            }
        });

        c18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c18KeyPressed(evt);
            }
        });

        c8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c8KeyPressed(evt);
            }
        });

        c26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c26KeyPressed(evt);
            }
        });

        c7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c7KeyPressed(evt);
            }
        });

        c25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c25KeyPressed(evt);
            }
        });

        c9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c9KeyPressed(evt);
            }
        });

        c27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c27KeyPressed(evt);
            }
        });

        c17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c17KeyPressed(evt);
            }
        });

        lblSudoku.setText("SUDOKU SOLVER");

        c38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c38KeyPressed(evt);
            }
        });

        c37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c37KeyPressed(evt);
            }
        });

        c39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c39KeyPressed(evt);
            }
        });

        c47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c47KeyPressed(evt);
            }
        });

        c46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c46KeyPressed(evt);
            }
        });

        c48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c48KeyPressed(evt);
            }
        });

        c40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c40KeyPressed(evt);
            }
        });

        c42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c42KeyPressed(evt);
            }
        });

        c32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c32KeyPressed(evt);
            }
        });

        c50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c50KeyPressed(evt);
            }
        });

        c29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c29KeyPressed(evt);
            }
        });

        c28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c28KeyPressed(evt);
            }
        });

        c30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c30KeyPressed(evt);
            }
        });

        c31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c31KeyPressed(evt);
            }
        });

        c49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c49KeyPressed(evt);
            }
        });

        c33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c33KeyPressed(evt);
            }
        });

        c51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c51KeyPressed(evt);
            }
        });

        c41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c41KeyPressed(evt);
            }
        });

        c43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c43KeyPressed(evt);
            }
        });

        c45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c45KeyPressed(evt);
            }
        });

        c35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c35KeyPressed(evt);
            }
        });

        c53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c53KeyPressed(evt);
            }
        });

        c34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c34KeyPressed(evt);
            }
        });

        c52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c52.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c52KeyPressed(evt);
            }
        });

        c36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c36KeyPressed(evt);
            }
        });

        c54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c54KeyPressed(evt);
            }
        });

        c44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c44KeyPressed(evt);
            }
        });

        c55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c55KeyPressed(evt);
            }
        });

        c56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c56KeyPressed(evt);
            }
        });

        c57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c57.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c57KeyPressed(evt);
            }
        });

        c58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c58.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c58KeyPressed(evt);
            }
        });

        c59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c59KeyPressed(evt);
            }
        });

        c60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c60.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c60KeyPressed(evt);
            }
        });

        c61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c61KeyPressed(evt);
            }
        });

        c62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c62.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c62KeyPressed(evt);
            }
        });

        c63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c63.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c63KeyPressed(evt);
            }
        });

        c64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c64.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c64KeyPressed(evt);
            }
        });

        c65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c65KeyPressed(evt);
            }
        });

        c66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c66.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c66KeyPressed(evt);
            }
        });

        c67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c67.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c67KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c67KeyReleased(evt);
            }
        });

        c68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c68.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c68KeyPressed(evt);
            }
        });

        c69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c69.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c69KeyPressed(evt);
            }
        });

        c70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c70.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c70KeyPressed(evt);
            }
        });

        c71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c71KeyPressed(evt);
            }
        });

        c72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c72.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c72KeyPressed(evt);
            }
        });

        c73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c73.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c73KeyPressed(evt);
            }
        });

        c74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c74.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c74KeyPressed(evt);
            }
        });

        c75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c75.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c75KeyPressed(evt);
            }
        });

        c76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c76.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c76KeyPressed(evt);
            }
        });

        c77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c77.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c77KeyPressed(evt);
            }
        });

        c78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c78.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c78KeyPressed(evt);
            }
        });

        c79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c79.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c79KeyPressed(evt);
            }
        });

        c80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c80.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c80KeyPressed(evt);
            }
        });

        c81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        c81.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c81KeyPressed(evt);
            }
        });

        btnResolver.setText("RESOLVER");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(130, 130, 130)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(c64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(c76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnResolver)
                        .addGap(174, 174, 174)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSudoku, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSudoku, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c42, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c50, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c51, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c49, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c29, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c28, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c38, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c39, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c47, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c48, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c46, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c35, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c43, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c53, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c54, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c52, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c58, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c59, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c60, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c68, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c75, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c74, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c55, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c56, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c57, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c65, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c66, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c64, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c73, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c63, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c61, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c62, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c70, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c72, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c76, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c80, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c78, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c77, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c79, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c81, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResolver)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        // TODO add your handling code here:
        try{
            
            //Recoger números ingresados en el sudoku
            int t1 = 0;
            if(!c1.getText().isEmpty()){
               t1 = Integer.parseInt(c1.getText());
            }else{
                c1.setForeground(Color.BLUE);
            }
            int t2 = 0;
            if(!c2.getText().isEmpty()){
               t2 = Integer.parseInt(c2.getText());
            }else{
                c2.setForeground(Color.BLUE);
            }
            int t3 = 0;
            if(!c3.getText().isEmpty()){
               t3 = Integer.parseInt(c3.getText());
            }else{
                c3.setForeground(Color.BLUE);
            }
            int t4 = 0;
            if(!c4.getText().isEmpty()){
               t4 = Integer.parseInt(c4.getText());
            }else{
                c4.setForeground(Color.BLUE);
            }
            int t5 = 0;
            if(!c5.getText().isEmpty()){
               t5 = Integer.parseInt(c5.getText());
            }else{
                c5.setForeground(Color.BLUE);
            }
            int t6 = 0;
            if(!c6.getText().isEmpty()){
               t6 = Integer.parseInt(c6.getText());
            }else{
                c6.setForeground(Color.BLUE);
            }
            int t7 = 0;
            if(!c7.getText().isEmpty()){
               t7 = Integer.parseInt(c7.getText());
            }else{
                c7.setForeground(Color.BLUE);
            }
            int t8 = 0;
            if(!c8.getText().isEmpty()){
               t8 = Integer.parseInt(c8.getText());
            }else{
                c8.setForeground(Color.BLUE);
            }
            int t9 = 0;
            if(!c9.getText().isEmpty()){
               t9 = Integer.parseInt(c9.getText());
            }else{
                c9.setForeground(Color.BLUE);
            }
            
            int t10 = 0;
            if(!c10.getText().isEmpty()){
               t10 = Integer.parseInt(c10.getText());
            }else{
                c10.setForeground(Color.BLUE);
            }
            int t11 = 0;
            if(!c11.getText().isEmpty()){
               t11 = Integer.parseInt(c11.getText());
            }else{
                c11.setForeground(Color.BLUE);
            }
            int t12 = 0;
            if(!c12.getText().isEmpty()){
               t12 = Integer.parseInt(c12.getText());
            }else{
                c12.setForeground(Color.BLUE);
            }
            int t13 = 0;
            if(!c13.getText().isEmpty()){
               t13 = Integer.parseInt(c13.getText());
            }else{
                c13.setForeground(Color.BLUE);
            }
            int t14 = 0;
            if(!c14.getText().isEmpty()){
               t14 = Integer.parseInt(c14.getText());
            }else{
                c14.setForeground(Color.BLUE);
            }
            int t15 = 0;
            if(!c15.getText().isEmpty()){
               t15 = Integer.parseInt(c15.getText());
            }else{
                c15.setForeground(Color.BLUE);
            }
            int t16 = 0;
            if(!c16.getText().isEmpty()){
               t16 = Integer.parseInt(c16.getText());
            }else{
                c16.setForeground(Color.BLUE);
            }
            int t17 = 0;
            if(!c17.getText().isEmpty()){
               t17 = Integer.parseInt(c17.getText());
            }else{
                c17.setForeground(Color.BLUE);
            }
            int t18 = 0;
            if(!c18.getText().isEmpty()){
               t18 = Integer.parseInt(c18.getText());
            }else{
                c18.setForeground(Color.BLUE);
            }
            
            int t19 = 0;
            if(!c19.getText().isEmpty()){
               t19 = Integer.parseInt(c19.getText());
            }else{
                c19.setForeground(Color.BLUE);
            }
            int t20 = 0;
            if(!c20.getText().isEmpty()){
               t20 = Integer.parseInt(c20.getText());
            }else{
                c20.setForeground(Color.BLUE);
            }
            int t21 = 0;
            if(!c21.getText().isEmpty()){
               t21 = Integer.parseInt(c21.getText());
            }else{
                c21.setForeground(Color.BLUE);
            }
            int t22 = 0;
            if(!c22.getText().isEmpty()){
               t22 = Integer.parseInt(c22.getText());
            }else{
                c22.setForeground(Color.BLUE);
            }
            int t23 = 0;
            if(!c23.getText().isEmpty()){
               t23 = Integer.parseInt(c23.getText());
            }else{
                c23.setForeground(Color.BLUE);
            }
            int t24 = 0;
            if(!c24.getText().isEmpty()){
               t24 = Integer.parseInt(c24.getText());
            }else{
                c24.setForeground(Color.BLUE);
            }
            int t25 = 0;
            if(!c25.getText().isEmpty()){
               t25 = Integer.parseInt(c25.getText());
            }else{
                c25.setForeground(Color.BLUE);
            }
            int t26 = 0;
            if(!c26.getText().isEmpty()){
               t26 = Integer.parseInt(c26.getText());
            }else{
                c26.setForeground(Color.BLUE);
            }
            int t27 = 0;
            if(!c27.getText().isEmpty()){
               t27 = Integer.parseInt(c27.getText());
            }else{
                c27.setForeground(Color.BLUE);
            }
            
            int t28 = 0;
            if(!c28.getText().isEmpty()){
               t28 = Integer.parseInt(c28.getText());
            }else{
                c28.setForeground(Color.BLUE);
            }
            int t29 = 0;
            if(!c29.getText().isEmpty()){
               t29 = Integer.parseInt(c29.getText());
            }else{
                c29.setForeground(Color.BLUE);
            }
            int t30 = 0;
            if(!c30.getText().isEmpty()){
               t30 = Integer.parseInt(c30.getText());
            }else{
                c30.setForeground(Color.BLUE);
            }
            int t31 = 0;
            if(!c31.getText().isEmpty()){
               t31 = Integer.parseInt(c31.getText());
            }else{
                c31.setForeground(Color.BLUE);
            }
            int t32 = 0;
            if(!c32.getText().isEmpty()){
               t32 = Integer.parseInt(c32.getText());
            }else{
                c32.setForeground(Color.BLUE);
            }
            int t33 = 0;
            if(!c33.getText().isEmpty()){
               t33 = Integer.parseInt(c33.getText());
            }else{
                c33.setForeground(Color.BLUE);
            }
            int t34 = 0;
            if(!c34.getText().isEmpty()){
               t34 = Integer.parseInt(c34.getText());
            }else{
                c34.setForeground(Color.BLUE);
            }
            int t35 = 0;
            if(!c35.getText().isEmpty()){
               t35 = Integer.parseInt(c35.getText());
            }else{
                c35.setForeground(Color.BLUE);
            }
            int t36 = 0;
            if(!c36.getText().isEmpty()){
               t36 = Integer.parseInt(c36.getText());
            }else{
                c36.setForeground(Color.BLUE);
            }
            
            int t37 = 0;
            if(!c37.getText().isEmpty()){
               t37 = Integer.parseInt(c37.getText());
            }else{
                c37.setForeground(Color.BLUE);
            }
            int t38 = 0;
            if(!c38.getText().isEmpty()){
               t38 = Integer.parseInt(c38.getText());
            }else{
                c38.setForeground(Color.BLUE);
            }
            int t39 = 0;
            if(!c39.getText().isEmpty()){
               t39 = Integer.parseInt(c39.getText());
            }else{
                c39.setForeground(Color.BLUE);
            }
            int t40 = 0;
            if(!c40.getText().isEmpty()){
               t40 = Integer.parseInt(c40.getText());
            }else{
                c40.setForeground(Color.BLUE);
            }
            int t41 = 0;
            if(!c41.getText().isEmpty()){
               t41 = Integer.parseInt(c41.getText());
            }else{
                c41.setForeground(Color.BLUE);
            }
            int t42 = 0;
            if(!c42.getText().isEmpty()){
               t42 = Integer.parseInt(c42.getText());
            }else{
                c42.setForeground(Color.BLUE);
            }
            int t43 = 0;
            if(!c43.getText().isEmpty()){
               t43 = Integer.parseInt(c43.getText());
            }else{
                c43.setForeground(Color.BLUE);
            }
            int t44 = 0;
            if(!c44.getText().isEmpty()){
               t44 = Integer.parseInt(c44.getText());
            }else{
                c44.setForeground(Color.BLUE);
            }
            int t45 = 0;
            if(!c45.getText().isEmpty()){
               t45 = Integer.parseInt(c45.getText());
            }else{
                c45.setForeground(Color.BLUE);
            }
            
            int t46 = 0;
            if(!c46.getText().isEmpty()){
               t46 = Integer.parseInt(c46.getText());
            }else{
                c46.setForeground(Color.BLUE);
            }
            int t47 = 0;
            if(!c47.getText().isEmpty()){
               t47 = Integer.parseInt(c47.getText());
            }else{
                c47.setForeground(Color.BLUE);
            }
            int t48 = 0;
            if(!c48.getText().isEmpty()){
               t48 = Integer.parseInt(c48.getText());
            }else{
                c48.setForeground(Color.BLUE);
            }
            int t49 = 0;
            if(!c49.getText().isEmpty()){
               t49 = Integer.parseInt(c49.getText());
            }else{
                c49.setForeground(Color.BLUE);
            }
            int t50 = 0;
            if(!c50.getText().isEmpty()){
               t50 = Integer.parseInt(c50.getText());
            }else{
                c50.setForeground(Color.BLUE);
            }
            int t51 = 0;
            if(!c51.getText().isEmpty()){
               t51 = Integer.parseInt(c51.getText());
            }else{
                c51.setForeground(Color.BLUE);
            }
            int t52 = 0;
            if(!c52.getText().isEmpty()){
               t52 = Integer.parseInt(c52.getText());
            }else{
                c52.setForeground(Color.BLUE);
            }
            int t53 = 0;
            if(!c53.getText().isEmpty()){
               t53 = Integer.parseInt(c53.getText());
            }else{
                c53.setForeground(Color.BLUE);
            }
            int t54 = 0;
            if(!c54.getText().isEmpty()){
               t54= Integer.parseInt(c54.getText());
            }else{
                c54.setForeground(Color.BLUE);
            }
            
             int t55 = 0;
            if(!c55.getText().isEmpty()){
               t55 = Integer.parseInt(c55.getText());
            }else{
                c55.setForeground(Color.BLUE);
            }
            int t56 = 0;
            if(!c56.getText().isEmpty()){
               t56= Integer.parseInt(c56.getText());
            }else{
                c56.setForeground(Color.BLUE);
            }
            int t57 = 0;
            if(!c57.getText().isEmpty()){
               t57= Integer.parseInt(c57.getText());
            }else{
                c57.setForeground(Color.BLUE);
            }
            int t58 = 0;
            if(!c58.getText().isEmpty()){
               t58= Integer.parseInt(c58.getText());
            }else{
                c58.setForeground(Color.BLUE);
            }
            int t59 = 0;
            if(!c59.getText().isEmpty()){
               t59= Integer.parseInt(c59.getText());
            }else{
                c59.setForeground(Color.BLUE);
            }
            int t60 = 0;
            if(!c60.getText().isEmpty()){
               t60= Integer.parseInt(c60.getText());
            }else{
                c60.setForeground(Color.BLUE);
            }
            int t61 = 0;
            if(!c61.getText().isEmpty()){
               t61= Integer.parseInt(c61.getText());
            }else{
                c61.setForeground(Color.BLUE);
            }
            int t62 = 0;
            if(!c62.getText().isEmpty()){
               t62= Integer.parseInt(c62.getText());
            }else{
                c62.setForeground(Color.BLUE);
            }
            int t63 = 0;
            if(!c63.getText().isEmpty()){
               t63= Integer.parseInt(c63.getText());
            }else{
                c63.setForeground(Color.BLUE);
            }
            
             int t64 = 0;
            if(!c64.getText().isEmpty()){
               t64= Integer.parseInt(c64.getText());
            }else{
                c64.setForeground(Color.BLUE);
            }
            int t65 = 0;
            if(!c65.getText().isEmpty()){
               t65= Integer.parseInt(c65.getText());
            }else{
                c65.setForeground(Color.BLUE);
            }
            int t66 = 0;
            if(!c66.getText().isEmpty()){
               t66= Integer.parseInt(c66.getText());
            }else{
                c66.setForeground(Color.BLUE);
            }
            int t67 = 0;
            if(!c67.getText().isEmpty()){
               t67= Integer.parseInt(c67.getText());
            }else{
                c67.setForeground(Color.BLUE);
            }
            int t68 = 0;
            if(!c68.getText().isEmpty()){
               t68= Integer.parseInt(c68.getText());
            }else{
                c68.setForeground(Color.BLUE);
            }
            int t69 = 0;
            if(!c69.getText().isEmpty()){
               t69= Integer.parseInt(c69.getText());
            }else{
                c69.setForeground(Color.BLUE);
            }
            int t70 = 0;
            if(!c70.getText().isEmpty()){
               t70= Integer.parseInt(c70.getText());
            }else{
                c70.setForeground(Color.BLUE);
            }
            int t71 = 0;
            if(!c71.getText().isEmpty()){
               t71= Integer.parseInt(c71.getText());
            }else{
                c71.setForeground(Color.BLUE);
            }
            int t72 = 0;
            if(!c72.getText().isEmpty()){
               t72= Integer.parseInt(c72.getText());
            }else{
                c72.setForeground(Color.BLUE);
            }
            
             int t73 = 0;
            if(!c73.getText().isEmpty()){
               t73= Integer.parseInt(c73.getText());
            }else{
                c73.setForeground(Color.BLUE);
            }
            int t74 = 0;
            if(!c74.getText().isEmpty()){
               t74= Integer.parseInt(c74.getText());
            }else{
                c74.setForeground(Color.BLUE);
            }
            int t75 = 0;
            if(!c75.getText().isEmpty()){
               t75= Integer.parseInt(c75.getText());
            }else{
                c75.setForeground(Color.BLUE);
            }
            int t76 = 0;
            if(!c76.getText().isEmpty()){
               t76= Integer.parseInt(c76.getText());
            }else{
                c76.setForeground(Color.BLUE);
            }
            int t77 = 0;
            if(!c77.getText().isEmpty()){
               t77= Integer.parseInt(c77.getText());
            }else{
                c77.setForeground(Color.BLUE);
            }
            int t78 = 0;
            if(!c78.getText().isEmpty()){
               t78= Integer.parseInt(c78.getText());
            }else{
                c78.setForeground(Color.BLUE);
            }
            int t79 = 0;
            if(!c79.getText().isEmpty()){
               t79 = Integer.parseInt(c79.getText());
            }else{
                c79.setForeground(Color.BLUE);
            }
            int t80 = 0;
            if(!c80.getText().isEmpty()){
               t80= Integer.parseInt(c80.getText());
            }else{
                c80.setForeground(Color.BLUE);
            }
            int t81 = 0;
            if(!c81.getText().isEmpty()){
               t81= Integer.parseInt(c81.getText());
            }else{
                c81.setForeground(Color.BLUE);
            }
            //almacenar en matrices 9x9
            int [][] tablero = {
                {t1,t2,t3,t4,t5,t6,t7,t8,t9},
                {t10,t11,t12,t13,t14,t15,t16,t17,t18},
                {t19,t20,t21,t22,t23,t24,t25,t26,t27},
                {t28,t29,t30,t31,t32,t33,t34,t35,t36},
                {t37,t38,t39,t40,t41,t42,t43,t44,t45},
                {t46,t47,t48,t49,t50,t51,t52,t53,t54},
                {t55,t56,t57,t58,t59,t60,t61,t62,t63},
                {t64,t65,t66,t67,t68,t69,t70,t71,t72},
                {t73,t74,t75,t76,t77,t78,t79,t80,t81},
            };



            Sudoku miSudoku = new Sudoku(tablero);

            if (!miSudoku.esResolvible()){
                JOptionPane.showMessageDialog(null,"El Sudoku no se puede resolver","Error",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            
            long tiempoInicio = System.currentTimeMillis();
            //proceso de resolución del sudoku
            miSudoku.resolverSudoku();
            long tiempoFin = System.currentTimeMillis();
            
            System.out.println();
            
            //imprime el sudoku resuelto en la GUI
            
            c1.setText(tablero[0][0]+"");
            c2.setText(tablero[0][1]+"");
            c3.setText(tablero[0][2]+"");
            c4.setText(tablero[0][3]+"");
            c5.setText(tablero[0][4]+"");
            c6.setText(tablero[0][5]+"");
            c7.setText(tablero[0][6]+"");
            c8.setText(tablero[0][7]+"");
            c9.setText(tablero[0][8]+"");

            c10.setText(tablero[1][0]+"");
            c11.setText(tablero[1][1]+"");
            c12.setText(tablero[1][2]+"");
            c13.setText(tablero[1][3]+"");
            c14.setText(tablero[1][4]+"");
            c15.setText(tablero[1][5]+"");
            c16.setText(tablero[1][6]+"");
            c17.setText(tablero[1][7]+"");
            c18.setText(tablero[1][8]+"");

            c19.setText(tablero[2][0]+"");
            c20.setText(tablero[2][1]+"");
            c21.setText(tablero[2][2]+"");
            c22.setText(tablero[2][3]+"");
            c23.setText(tablero[2][4]+"");
            c24.setText(tablero[2][5]+"");
            c25.setText(tablero[2][6]+"");
            c26.setText(tablero[2][7]+"");
            c27.setText(tablero[2][8]+"");

            c28.setText(tablero[3][0]+"");
            c29.setText(tablero[3][1]+"");
            c30.setText(tablero[3][2]+"");
            c31.setText(tablero[3][3]+"");
            c32.setText(tablero[3][4]+"");
            c33.setText(tablero[3][5]+"");
            c34.setText(tablero[3][6]+"");
            c35.setText(tablero[3][7]+"");
            c36.setText(tablero[3][8]+"");

            c37.setText(tablero[4][0]+"");
            c38.setText(tablero[4][1]+"");
            c39.setText(tablero[4][2]+"");
            c40.setText(tablero[4][3]+"");
            c41.setText(tablero[4][4]+"");
            c42.setText(tablero[4][5]+"");
            c43.setText(tablero[4][6]+"");
            c44.setText(tablero[4][7]+"");
            c45.setText(tablero[4][8]+"");

            c46.setText(tablero[5][0]+"");
            c47.setText(tablero[5][1]+"");
            c48.setText(tablero[5][2]+"");
            c49.setText(tablero[5][3]+"");
            c50.setText(tablero[5][4]+"");
            c51.setText(tablero[5][5]+"");
            c52.setText(tablero[5][6]+"");
            c53.setText(tablero[5][7]+"");
            c54.setText(tablero[5][8]+"");

            c55.setText(tablero[6][0]+"");
            c56.setText(tablero[6][1]+"");
            c57.setText(tablero[6][2]+"");
            c58.setText(tablero[6][3]+"");
            c59.setText(tablero[6][4]+"");
            c60.setText(tablero[6][5]+"");
            c61.setText(tablero[6][6]+"");
            c62.setText(tablero[6][7]+"");
            c63.setText(tablero[6][8]+"");

            c64.setText(tablero[7][0]+"");
            c65.setText(tablero[7][1]+"");
            c66.setText(tablero[7][2]+"");
            c67.setText(tablero[7][3]+"");
            c68.setText(tablero[7][4]+"");
            c69.setText(tablero[7][5]+"");
            c70.setText(tablero[7][6]+"");
            c71.setText(tablero[7][7]+"");
            c72.setText(tablero[7][8]+"");

            c73.setText(tablero[8][0]+"");
            c74.setText(tablero[8][1]+"");
            c75.setText(tablero[8][2]+"");
            c76.setText(tablero[8][3]+"");
            c77.setText(tablero[8][4]+"");
            c78.setText(tablero[8][5]+"");
            c79.setText(tablero[8][6]+"");
            c80.setText(tablero[8][7]+"");
            c81.setText(tablero[8][8]+"");
            
            //muestra tiempo de ejecución del programa
            JOptionPane.showMessageDialog(rootPane, "Tiempo de resolución: "+(tiempoFin-tiempoInicio)+" ms");
                    
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Ingrese solo números","Error",JOptionPane.WARNING_MESSAGE);
        }
        
        
        
    
    }//GEN-LAST:event_btnResolverActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
       
        
    }//GEN-LAST:event_c1ActionPerformed

    private void c1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyPressed
        teclear(evt, c1);
        
    }//GEN-LAST:event_c1KeyPressed

    private void c1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_c1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_c1InputMethodTextChanged

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
        
    }//GEN-LAST:event_c1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MousePressed
        c1.setBackground(Color.LIGHT_GRAY);
        if(c1.equals("")){
            c1.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_c1MousePressed

    private void c2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MousePressed
       c2.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_c2MousePressed

    private void c3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MousePressed
        c3.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_c3MousePressed

    private void c4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c4MousePressed
        c4.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_c4MousePressed

    private void c2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyPressed
        teclear(evt, c2);
    }//GEN-LAST:event_c2KeyPressed

    private void c3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c3KeyPressed
        teclear(evt, c3);
    }//GEN-LAST:event_c3KeyPressed

    private void c4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4KeyPressed
        teclear(evt, c4);
    }//GEN-LAST:event_c4KeyPressed

    private void c5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c5KeyPressed
        teclear(evt, c5);
    }//GEN-LAST:event_c5KeyPressed

    private void c6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c6KeyPressed
        teclear(evt, c6);
    }//GEN-LAST:event_c6KeyPressed

    private void c10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c10KeyPressed
        teclear(evt, c10);
    }//GEN-LAST:event_c10KeyPressed

    private void c7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c7KeyPressed
        teclear(evt, c7);
    }//GEN-LAST:event_c7KeyPressed

    private void c8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c8KeyPressed
        teclear(evt, c8 );
    }//GEN-LAST:event_c8KeyPressed

    private void c9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c9KeyPressed
        teclear(evt, c9 );
    }//GEN-LAST:event_c9KeyPressed

    private void c11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c11KeyPressed
        teclear(evt, c11 );
    }//GEN-LAST:event_c11KeyPressed

    private void c12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c12KeyPressed
        teclear(evt, c12 );
    }//GEN-LAST:event_c12KeyPressed

    private void c13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c13KeyPressed
        teclear(evt, c13 );
    }//GEN-LAST:event_c13KeyPressed

    private void c14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c14KeyPressed
        teclear(evt, c14 );
    }//GEN-LAST:event_c14KeyPressed

    private void c15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c15KeyPressed
        teclear(evt, c15 );
    }//GEN-LAST:event_c15KeyPressed

    private void c16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c16KeyPressed
       teclear(evt, c16 );
    }//GEN-LAST:event_c16KeyPressed

    private void c17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c17KeyPressed
        teclear(evt, c17 );
    }//GEN-LAST:event_c17KeyPressed

    private void c18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c18KeyPressed
        teclear(evt, c18 );
    }//GEN-LAST:event_c18KeyPressed

    private void c19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c19KeyPressed
        teclear(evt, c19 );
    }//GEN-LAST:event_c19KeyPressed

    private void c20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c20KeyPressed
        teclear(evt, c20 );
    }//GEN-LAST:event_c20KeyPressed

    private void c21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c21KeyPressed
        teclear(evt, c21 );
    }//GEN-LAST:event_c21KeyPressed

    private void c22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c22KeyPressed
       teclear(evt, c22 );
    }//GEN-LAST:event_c22KeyPressed

    private void c23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c23KeyPressed
        teclear(evt, c23 );
    }//GEN-LAST:event_c23KeyPressed

    private void c24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c24KeyPressed
        teclear(evt, c24 );
    }//GEN-LAST:event_c24KeyPressed

    private void c25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c25KeyPressed
        teclear(evt, c25 );
    }//GEN-LAST:event_c25KeyPressed

    private void c26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c26KeyPressed
        teclear(evt, c26 );
    }//GEN-LAST:event_c26KeyPressed

    private void c27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c27KeyPressed
        teclear(evt, c27 );
    }//GEN-LAST:event_c27KeyPressed

    private void c28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c28KeyPressed
        teclear(evt, c28 );
    }//GEN-LAST:event_c28KeyPressed

    private void c29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c29KeyPressed
        teclear(evt, c29 );
    }//GEN-LAST:event_c29KeyPressed

    private void c30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c30KeyPressed
        teclear(evt, c30 );
    }//GEN-LAST:event_c30KeyPressed

    private void c31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c31KeyPressed
        teclear(evt, c31);
    }//GEN-LAST:event_c31KeyPressed

    private void c32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c32KeyPressed
        teclear(evt, c32 );
    }//GEN-LAST:event_c32KeyPressed

    private void c33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c33KeyPressed
        teclear(evt, c33 );
    }//GEN-LAST:event_c33KeyPressed

    private void c34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c34KeyPressed
        teclear(evt, c34 );
    }//GEN-LAST:event_c34KeyPressed

    private void c35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c35KeyPressed
        teclear(evt, c35 );
    }//GEN-LAST:event_c35KeyPressed

    private void c36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c36KeyPressed
        teclear(evt, c36 );
    }//GEN-LAST:event_c36KeyPressed

    private void c37KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c37KeyPressed
        teclear(evt, c37 );
    }//GEN-LAST:event_c37KeyPressed

    private void c38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c38KeyPressed
        teclear(evt, c38 );
    }//GEN-LAST:event_c38KeyPressed

    private void c39KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c39KeyPressed
       teclear(evt, c39 );
    }//GEN-LAST:event_c39KeyPressed

    private void c40KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c40KeyPressed
        teclear(evt, c40 );
    }//GEN-LAST:event_c40KeyPressed

    private void c41KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c41KeyPressed
       teclear(evt, c41 );
    }//GEN-LAST:event_c41KeyPressed

    private void c42KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c42KeyPressed
        teclear(evt, c42 );
    }//GEN-LAST:event_c42KeyPressed

    private void c43KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c43KeyPressed
        teclear(evt, c43 );
    }//GEN-LAST:event_c43KeyPressed

    private void c44KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c44KeyPressed
       teclear(evt, c44 );
    }//GEN-LAST:event_c44KeyPressed

    private void c45KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c45KeyPressed
        teclear(evt, c45 );
    }//GEN-LAST:event_c45KeyPressed

    private void c46KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c46KeyPressed
        teclear(evt, c46 );
    }//GEN-LAST:event_c46KeyPressed

    private void c47KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c47KeyPressed
        teclear(evt, c47 );
    }//GEN-LAST:event_c47KeyPressed

    private void c48KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c48KeyPressed
        teclear(evt, c48 );
    }//GEN-LAST:event_c48KeyPressed

    private void c49KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c49KeyPressed
        teclear(evt, c49 );
    }//GEN-LAST:event_c49KeyPressed

    private void c50KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c50KeyPressed
        teclear(evt, c50);
    }//GEN-LAST:event_c50KeyPressed

    private void c51KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c51KeyPressed
        teclear(evt, c51 );
    }//GEN-LAST:event_c51KeyPressed

    private void c52KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c52KeyPressed
        teclear(evt, c52 );
    }//GEN-LAST:event_c52KeyPressed

    private void c53KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c53KeyPressed
        teclear(evt, c53 );
    }//GEN-LAST:event_c53KeyPressed

    private void c54KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c54KeyPressed
        teclear(evt, c54 );
    }//GEN-LAST:event_c54KeyPressed

    private void c55KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c55KeyPressed
       teclear(evt, c55 );
    }//GEN-LAST:event_c55KeyPressed

    private void c56KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c56KeyPressed
        teclear(evt, c56 );
    }//GEN-LAST:event_c56KeyPressed

    private void c57KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c57KeyPressed
        teclear(evt, c57 );
    }//GEN-LAST:event_c57KeyPressed

    private void c58KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c58KeyPressed
        teclear(evt, c58 );
    }//GEN-LAST:event_c58KeyPressed

    private void c59KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c59KeyPressed
        teclear(evt, c59 );
    }//GEN-LAST:event_c59KeyPressed

    private void c60KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c60KeyPressed
        teclear(evt, c60 );
    }//GEN-LAST:event_c60KeyPressed

    private void c61KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c61KeyPressed
        teclear(evt, c61 );
    }//GEN-LAST:event_c61KeyPressed

    private void c62KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c62KeyPressed
        teclear(evt, c62 );
    }//GEN-LAST:event_c62KeyPressed

    private void c63KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c63KeyPressed
        teclear(evt, c63 );
    }//GEN-LAST:event_c63KeyPressed

    private void c64KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c64KeyPressed
        teclear(evt, c64 );
    }//GEN-LAST:event_c64KeyPressed

    private void c65KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c65KeyPressed
       teclear(evt, c65 );
    }//GEN-LAST:event_c65KeyPressed

    private void c66KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c66KeyPressed
        teclear(evt, c66 );
    }//GEN-LAST:event_c66KeyPressed

    private void c67KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c67KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_c67KeyReleased

    private void c67KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c67KeyPressed
        teclear(evt, c67 );
    }//GEN-LAST:event_c67KeyPressed

    private void c68KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c68KeyPressed
        teclear(evt, c68 );
    }//GEN-LAST:event_c68KeyPressed

    private void c69KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c69KeyPressed
        teclear(evt, c69);
    }//GEN-LAST:event_c69KeyPressed

    private void c70KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c70KeyPressed
        teclear(evt, c70 );
    }//GEN-LAST:event_c70KeyPressed

    private void c71KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c71KeyPressed
        teclear(evt, c71 );
    }//GEN-LAST:event_c71KeyPressed

    private void c72KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c72KeyPressed
        teclear(evt, c72 );
    }//GEN-LAST:event_c72KeyPressed

    private void c73KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c73KeyPressed
       teclear(evt, c73);
    }//GEN-LAST:event_c73KeyPressed

    private void c74KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c74KeyPressed
        teclear(evt, c74 );
    }//GEN-LAST:event_c74KeyPressed

    private void c75KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c75KeyPressed
        teclear(evt, c74 );
    }//GEN-LAST:event_c75KeyPressed

    private void c76KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c76KeyPressed
        teclear(evt, c76 );
    }//GEN-LAST:event_c76KeyPressed

    private void c77KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c77KeyPressed
        teclear(evt, c77 );
    }//GEN-LAST:event_c77KeyPressed

    private void c78KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c78KeyPressed
        teclear(evt, c78 );
    }//GEN-LAST:event_c78KeyPressed

    private void c79KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c79KeyPressed
        teclear(evt, c79 );
    }//GEN-LAST:event_c79KeyPressed

    private void c80KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c80KeyPressed
        teclear(evt, c80 );
    }//GEN-LAST:event_c80KeyPressed

    private void c81KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c81KeyPressed
        teclear(evt, c81 );
    }//GEN-LAST:event_c81KeyPressed
   
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
            java.util.logging.Logger.getLogger(SudokuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResolver;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c13;
    private javax.swing.JTextField c14;
    private javax.swing.JTextField c15;
    private javax.swing.JTextField c16;
    private javax.swing.JTextField c17;
    private javax.swing.JTextField c18;
    private javax.swing.JTextField c19;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c20;
    private javax.swing.JTextField c21;
    private javax.swing.JTextField c22;
    private javax.swing.JTextField c23;
    private javax.swing.JTextField c24;
    private javax.swing.JTextField c25;
    private javax.swing.JTextField c26;
    private javax.swing.JTextField c27;
    private javax.swing.JTextField c28;
    private javax.swing.JTextField c29;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c30;
    private javax.swing.JTextField c31;
    private javax.swing.JTextField c32;
    private javax.swing.JTextField c33;
    private javax.swing.JTextField c34;
    private javax.swing.JTextField c35;
    private javax.swing.JTextField c36;
    private javax.swing.JTextField c37;
    private javax.swing.JTextField c38;
    private javax.swing.JTextField c39;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c40;
    private javax.swing.JTextField c41;
    private javax.swing.JTextField c42;
    private javax.swing.JTextField c43;
    private javax.swing.JTextField c44;
    private javax.swing.JTextField c45;
    private javax.swing.JTextField c46;
    private javax.swing.JTextField c47;
    private javax.swing.JTextField c48;
    private javax.swing.JTextField c49;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c50;
    private javax.swing.JTextField c51;
    private javax.swing.JTextField c52;
    private javax.swing.JTextField c53;
    private javax.swing.JTextField c54;
    private javax.swing.JTextField c55;
    private javax.swing.JTextField c56;
    private javax.swing.JTextField c57;
    private javax.swing.JTextField c58;
    private javax.swing.JTextField c59;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c60;
    private javax.swing.JTextField c61;
    private javax.swing.JTextField c62;
    private javax.swing.JTextField c63;
    private javax.swing.JTextField c64;
    private javax.swing.JTextField c65;
    private javax.swing.JTextField c66;
    private javax.swing.JTextField c67;
    private javax.swing.JTextField c68;
    private javax.swing.JTextField c69;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c70;
    private javax.swing.JTextField c71;
    private javax.swing.JTextField c72;
    private javax.swing.JTextField c73;
    private javax.swing.JTextField c74;
    private javax.swing.JTextField c75;
    private javax.swing.JTextField c76;
    private javax.swing.JTextField c77;
    private javax.swing.JTextField c78;
    private javax.swing.JTextField c79;
    private javax.swing.JTextField c8;
    private javax.swing.JTextField c80;
    private javax.swing.JTextField c81;
    private javax.swing.JTextField c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblSudoku;
    // End of variables declaration//GEN-END:variables

    private void teclear(java.awt.event.KeyEvent evt, javax.swing.JTextField cc) {
        char c=evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }else{
            cc.setText(""+c);
            cc.setEditable(false);
        }
        
    }
}
