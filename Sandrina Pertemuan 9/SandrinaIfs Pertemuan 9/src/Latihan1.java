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
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input1, input2;
        input1 = JOptionPane.showInputDialog("Masukkan Angka Pertama : ");
        input2 = JOptionPane.showInputDialog("Masukkan Angka Kedua : ");
        int convertInput1 = Integer.valueOf(input1).intValue();
        int convertInput2 = Integer.valueOf(input2).intValue();
        String hasil;
        hasil = convertInput1 + " + " + convertInput2 + " = " + (convertInput1+convertInput2);
        
        JOptionPane.showMessageDialog(null, hasil);
    }
    }
    
