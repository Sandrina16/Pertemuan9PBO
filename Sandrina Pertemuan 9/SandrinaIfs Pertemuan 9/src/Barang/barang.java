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
public class barang{
    private String kodeBarang,namaBarang;
    private int hargaJual, stok, HPP, jumlahJual;
    
    void input(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.HPP = HPP;
        this.hargaJual = hargaJual;
        this.stok = stok;
        
        System.out.println("Kode Barang : " + this.kodeBarang);
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.println("HPP : " + this.HPP);
        System.out.println("Harga Jual : " + this.hargaJual);
        System.out.println("Stok : " + this.stok);
    }
    
    void pembelian(int jumlah){
        if(this.stok - jumlah > 0){
            this.jumlahJual += jumlah;
            this.stok -= this.jumlahJual;
            System.out.println("Jumlah jual : " + this.jumlahJual);
        } else{
            System.out.println("Jumlah Jual: "+ this.jumlahJual);
        }
    }
    
    void profit(){
        int laba = (this.jumlahJual * this.hargaJual) - (this.HPP * this.jumlahJual);

        System.out.println("Stok Sekarang : " + this.stok);
        System.out.println("Total Bayar : " + this.jumlahJual * this.hargaJual);
        System.out.println("Laba : " + laba);
    }   
}


