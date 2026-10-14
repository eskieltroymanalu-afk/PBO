/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.Objek;

/**
 *
 * @author eskie
 */

// Class Geeks digunakan untuk menyimpan informasi software.
public class Geeks {

    // Variabel static name digunakan untuk menyimpan nama software.
    // Karena static, variabel ini dimiliki oleh class, bukan objek tertentu.
    static String name;

    // Variabel static price digunakan untuk menyimpan harga software.
    static float price;

    // Method set() digunakan untuk memberikan nilai
    // pada variabel name dan price.
    static void set(String n, float p) {

        // Menyimpan nilai parameter n ke variabel name.
        name = n;

        // Menyimpan nilai parameter p ke variabel price.
        price = p;
    }

    // Method get() digunakan untuk menampilkan
    // informasi nama dan harga software.
    static void get() {

        // Menampilkan nama software ke console.
        System.out.println("Software name is: " + name);

        // Menampilkan harga software ke console.
        System.out.println("Software price is: " + price);
    }

    // Method main merupakan titik awal program dijalankan.
    public static void main(String args[]) {

        // Memanggil method set() menggunakan nama class Geeks.
        // Nama software diisi "Visual studio" dan harga diisi 0.0.
        Geeks.set("Visual studio", 0.0f);

        // Memanggil method get() untuk menampilkan
        // nama dan harga software.
        Geeks.get();
    }
}