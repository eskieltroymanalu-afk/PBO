/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.CopyConstructor;

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

    // Parameterized Constructor digunakan untuk memberikan
    // nilai awal pada atribut name dan id.
    Geeks(String name, int id)
    {
        // Memasukkan nilai parameter name ke atribut name.
        this.name = name;

        // Memasukkan nilai parameter id ke atribut id.
        this.id = id;
    }

    // Copy Constructor digunakan untuk membuat objek baru
    // berdasarkan nilai dari objek Geeks yang sudah ada.
    Geeks(Geeks obj2)
    {
        // Menyalin nilai name dari objek obj2
        // ke atribut name pada objek baru.
        this.name = obj2.name;

        // Menyalin nilai id dari objek obj2
        // ke atribut id pada objek baru.
        this.id = obj2.id;
    }
}

// Class Main digunakan sebagai class utama program.
public class Main {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args)
    {
        // Menampilkan keterangan untuk objek pertama.
        System.out.println("First Object");

        // Membuat objek pertama bernama geek1.
        // Constructor menerima nama "Sweta" dan ID 68.
        Geeks geek1 = new Geeks("Sweta", 68);

        // Menampilkan nama dan ID dari objek pertama.
        System.out.println("GeekName: " + geek1.name
                + " and GeekId: " + geek1.id);

        // Memberikan satu baris kosong agar output lebih rapi.
        System.out.println();

        // Membuat objek kedua bernama geek2 menggunakan
        // Copy Constructor.
        // Nilai dari objek geek1 akan disalin ke geek2.
        Geeks geek2 = new Geeks(geek1);

        // Menampilkan keterangan bahwa objek kedua
        // dibuat menggunakan Copy Constructor.
        System.out.println("Copy Constructor used Second Object");

        // Menampilkan nama dan ID dari objek kedua.
        System.out.println("GeekName: " + geek2.name
                + " and GeekId: " + geek2.id);
    }
}