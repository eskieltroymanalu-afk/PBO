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

// Class Geeks digunakan sebagai blueprint untuk membuat objek Geeks.
class Geeks {

    // Variabel name digunakan untuk menyimpan nama Geek.
    String name;

    // Variabel id digunakan untuk menyimpan ID Geek.
    int id;

    // Constructor Geeks digunakan untuk memberikan nilai awal
    // pada atribut name dan id ketika objek dibuat.
    Geeks(String name, int id) {

        // this.name mengacu pada atribut name yang terdapat
        // di dalam class Geeks.
        // Nilai parameter name dimasukkan ke atribut name.
        this.name = name;

        // this.id mengacu pada atribut id yang terdapat
        // di dalam class Geeks.
        // Nilai parameter id dimasukkan ke atribut id.
        this.id = id;
    }
}

// Class Main digunakan sebagai class utama untuk menjalankan program.
public class Main {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat objek geek1 dari class Geeks.
        // Constructor dipanggil dengan memberikan nama "Swata"
        // dan ID 68 sebagai nilai parameter.
        Geeks geek1 = new Geeks("Swata", 68);

        // Menampilkan nama dan ID yang tersimpan di dalam objek geek1.
        System.out.println("GeekName: " + geek1.name
                            + " and GeekId: " + geek1.id);
    }
}