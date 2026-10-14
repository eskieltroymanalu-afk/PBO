/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.Constructs;

/**
 *
 * @author eskie
 */

// Class Geeks digunakan untuk menunjukkan penggunaan constructor
// pada sebuah class.
class Geeks {

    // Constructor Geeks merupakan default constructor
    // karena tidak memiliki parameter.
    Geeks() {

        // Menampilkan pesan ketika constructor dipanggil.
        System.out.println("Default constructor");
    }

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat objek hello dari class Geeks.
        // Ketika objek dibuat, constructor Geeks() akan otomatis dipanggil.
        Geeks hello = new Geeks();
    }
}