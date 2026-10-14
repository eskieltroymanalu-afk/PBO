/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.ClassObject;

/**
 *
 * @author eskie
 */

// Class Student digunakan untuk membuat objek Student.
public class Student {

    // Method toString() digunakan untuk mengubah objek menjadi bentuk String.
    // @Override menunjukkan bahwa method ini menggantikan method toString()
    // yang sudah tersedia pada class Object.
    @Override
    public String toString() {

        // Mengembalikan teks "Student object" ketika objek
        // Student dikonversi menjadi String.
        return "Student object";
    }

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat objek s dari class Student.
        // Kata new digunakan untuk membuat objek baru.
        Student s = new Student();

        // Memanggil method toString() dari objek s
        // kemudian menampilkan hasilnya ke console.
        System.out.println(s.toString());
    }
}