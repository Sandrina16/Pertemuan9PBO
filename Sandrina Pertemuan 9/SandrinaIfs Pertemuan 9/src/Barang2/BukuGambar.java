/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barang2;

/**
 *
 * @author ASUS
 */
public class BukuGambar  extends Barang1{
    private int HPP, hargaJual, stok, jumlahJual;
    
    public BukuGambar(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok, int jumlahJual){
        super(kodeBarang, namaBarang);
        
        this.HPP = HPP;
        this.hargaJual = hargaJual;
        this.stok = stok;
        this.jumlahJual = jumlahJual;
    }
    
    public String tampilHasilPenjualanBarang(){
        return(super.tampilBarang1() + "HPP : \t" + this.HPP + "\n" + "Harga Jual : \t"
                + this.hargaJual + "\n" + "Stok : \t" + this.stok +
                "\nJumlah Jual :\t" + this.jumlahJual + 
                "\nOUTPUT :\n" + "Stok Sekarang :\t" 
                + (this.stok -= this.jumlahJual) +
                "\nTotal Bayar :\t" + (this.jumlahJual * this.hargaJual) + 
                "\nLaba :\t" + ((this.jumlahJual * this.hargaJual) - (this.jumlahJual * this.HPP)) + 
                "\n");
    }
    
}
