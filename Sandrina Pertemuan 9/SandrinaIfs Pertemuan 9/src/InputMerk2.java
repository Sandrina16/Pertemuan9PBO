/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import javax.swing.*;
/**
 *
 * @author ASUS
 */
public class InputMerk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input;
        
        input = JOptionPane.showInputDialog("Masukkan Harga : ");
        long harga = Integer.valueOf(input).intValue();
        JOptionPane.showMessageDialog(null, harga);
        
    }
}
