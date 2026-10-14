/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */

// Menentukan package tempat class Student berada.
package pbo_w3s3_41425019.equals;

/**
 *
 * @author eskie
 */

// Class Student digunakan untuk membuat objek mahasiswa.
public class Student {

    // Variabel roll digunakan untuk menyimpan nomor roll mahasiswa.
    int roll;

    // Method equals() digunakan untuk membandingkan
    // dua objek Student berdasarkan nilai roll.
    //
    // @Override menunjukkan bahwa method equals()
    // merupakan method yang berasal dari class Object.
    @Override
    public boolean equals(Object o) {

        // Mengecek apakah object o merupakan instance
        // dari class Student.
        if (o instanceof Student) {

            // Mengubah object o menjadi Student menggunakan casting.
            // Kemudian membandingkan nilai roll dari kedua object.
            //
            // this.roll = roll dari object yang memanggil equals().
            // ((Student) o).roll = roll dari object yang dibandingkan.
            return this.roll == ((Student) o).roll;
        }

        // Jika object o bukan merupakan object Student,
        // maka hasil perbandingan adalah false.
        return false;
    }

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat object Student pertama.
        Student s1 = new Student();

        // Memberikan nilai roll 101 kepada s1.
        s1.roll = 101;

        // Membuat object Student kedua.
        Student s2 = new Student();

        // Memberikan nilai roll 101 kepada s2.
        s2.roll = 101;

        // Membuat object Student ketiga.
        Student s3 = new Student();

        // Memberikan nilai roll 102 kepada s3.
        s3.roll = 102;

        // Membandingkan object s1 dengan s2 menggunakan equals().
        // Karena keduanya memiliki roll yang sama, hasilnya true.
        System.out.println(
                "s1.equals(s2): " + s1.equals(s2)
        );

        // Membandingkan object s1 dengan s3 menggunakan equals().
        // Karena nilai roll berbeda, hasilnya false.
        System.out.println(
                "s1.equals(s3): " + s1.equals(s3)
        );
    }
}