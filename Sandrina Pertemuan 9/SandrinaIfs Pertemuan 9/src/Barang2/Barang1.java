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
public class Barang1 {
    private String kodeBarang,namaBarang;
    
    public Barang1(String kodeBarang, String namaBarang){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
    }
    
    

    
    public String tampilBarang1(){
        return ("INPUT : \n" + "Kode Barang :\t" + kodeBarang + "\nNama Barang :\t" + namaBarang + "\n");
    }
}
