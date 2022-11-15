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
public class barangBarang {
    public String kodeBarangBarang, namabarangBarang;
    public int HPP, hargaJualBarang, stokBarang, jumlahJualBarang;
    
    public barangBarang(String kodeBarang, String namaBarang, int HPP, int hargaJual, int stok, int jumlahJual){
        this.kodeBarangBarang = kodeBarang;
        this.namabarangBarang = namaBarang;
        this.HPP = HPP;
        this.hargaJualBarang = hargaJual;
        this.stokBarang = stok;
        this.jumlahJualBarang = jumlahJual;
    }
    
    public String tampilinHasilPenjualanBarang(){
        return("INPUT :\n" +
                "Kode\t\t\t:" + this.kodeBarangBarang + 
                "\nNama\t\t\t:" + this.namabarangBarang + 
                "\nHPP\t\t\t:" + this.HPP + "\nHarga Jual\t\t:"
                + this.hargaJualBarang + "\n" + "Stok\t\t\t:" + this.stokBarang +
                "\nJumlah Jual\t\t:" + this.jumlahJualBarang + 
                "\nOUTPUT :\n" + "Stok Sekarang\t\t:" + (this.stokBarang -= this.jumlahJualBarang) +
                "\nTotal Bayar\t\t:" + (this.jumlahJualBarang * this.hargaJualBarang) + 
                "\nLaba\t\t\t:" + ((this.jumlahJualBarang * this.hargaJualBarang) - (this.jumlahJualBarang * this.HPP)) 
                + "\n");
    }
}
