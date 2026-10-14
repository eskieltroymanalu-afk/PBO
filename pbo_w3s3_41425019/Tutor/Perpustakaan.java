/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w3s3_41425019.Tutor;

/**
 *
 * @author eskie
 */
public class Perpustakaan {
     String namaBuku;
    String pegawai;

    
    
    // Constructor
    public Perpustakaan(String namaBuku, String pegawai) {
        this.namaBuku = namaBuku;
        this.pegawai = pegawai;
    }

    // Method meminjam
    public void meminjam() {
        System.out.println(pegawai + " meminjam buku " + namaBuku);
    }

    // Method mengembalikan
    public void mengembalikan() {
        System.out.println(pegawai + " mengembalikan buku " + namaBuku);
    }
}
    
}
