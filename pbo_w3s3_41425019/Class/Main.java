/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.Class;

/**
 *
 * @author eskie
 */

// Class Student digunakan sebagai blueprint atau cetakan
// untuk membuat objek mahasiswa.
class Student {

    // Variabel id digunakan untuk menyimpan ID mahasiswa.
    int id;

    // Variabel n digunakan untuk menyimpan nama mahasiswa.
    String n;

    // Constructor Student digunakan untuk memberikan nilai awal
    // pada atribut id dan n ketika objek Student dibuat.
    public Student(int id, String n) {

        // this.id mengacu pada atribut id yang ada di dalam class.
        // Nilai id dari parameter dimasukkan ke atribut id.
        this.id = id;

        // this.n mengacu pada atribut n yang ada di dalam class.
        // Nilai n dari parameter dimasukkan ke atribut n.
        this.n = n;
    }
}

// Class Main merupakan class utama yang digunakan
// untuk menjalankan program.
public class Main {

    // Method main adalah titik awal program Java dijalankan.
    public static void main(String[] args) {

        // Membuat objek s1 dari class Student.
        // Objek tersebut memiliki id 10 dan nama "Alice".
        Student s1 = new Student(10, "Alice");

        // Menampilkan nilai atribut id dari objek s1.
        // Output yang dihasilkan adalah 10.
        System.out.println(s1.id);

        // Menampilkan nilai atribut n dari objek s1.
        // Output yang dihasilkan adalah Alice.
        System.out.println(s1.n);
    }
}