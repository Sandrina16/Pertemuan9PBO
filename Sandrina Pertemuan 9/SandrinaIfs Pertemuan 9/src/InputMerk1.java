/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author ASUS
 */
public class InputMerk1 {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader(
        new InputStreamReader(System.in));
        
        String merk;
        System.out.print("Masukkan Merk : ");
        merk = input.readLine();
        System.out.println("Merk motor ini adalah " + merk);
    }
    
}
