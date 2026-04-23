/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author efrai
 */
public class Biblioteca {

    
    public static void main(String[] args) {
        // Configura o visual da janela (opcional, mas deixa mais bonito)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(biblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Roda o programa chamando a sua tela (biblio)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new biblio().setVisible(true);
            }
        });
    }
}

