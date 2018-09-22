/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan3.memasukkannilaidarikeyboard;

import java.util.Scanner;

/**
 *
 * @author DEADPOOL
 *NAMA : Cessario
 *NIM : 10117063
 *KELAS : IF-2
 *Deskripsi Program : memasukkan nilai dari keyboard */
public class PBO210117063Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Masukkan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah : " + nama);
    }
    
}
