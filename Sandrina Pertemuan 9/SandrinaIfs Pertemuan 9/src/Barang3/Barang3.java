/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang3;

/**
 *
 * @author ASUS
 */
public class Barang3 {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        barangBarang[] brng = new barangBarang[2];
        
        brng[0] = new barang("B001", "BUKU GAMBAR", 2500, 3000, 5, 2);
        brng[1] = new barang("p002", "PENSIL 2B", 1500, 1750, 10, 1);
        
        for(int i = 0; i < brng.length; i++){
            System.out.println(brng[i].tampilinHasilPenjualanBarang());
            System.out.println("---------------------------------------------------");
        }
        
    }

}
