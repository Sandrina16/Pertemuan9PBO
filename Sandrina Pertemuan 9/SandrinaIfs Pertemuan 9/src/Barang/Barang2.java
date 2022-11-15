/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Barang2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        barang brg = new barang();
        
        brg.input( JOptionPane.showInputDialog("Masukkan Kode"),
                JOptionPane.showInputDialog("Masukkan Nama Barang"),
                parseInt(JOptionPane.showInputDialog("Masukkan HPP")),
                parseInt(JOptionPane.showInputDialog("Masukkan Harga Jual")),
                parseInt(JOptionPane.showInputDialog("Masukkan Stok")));
        
        brg.pembelian(parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Beli : ")));
        brg.profit();
    }
}
    
