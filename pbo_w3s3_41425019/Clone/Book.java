/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.Clone;

/**
 *
 * @author eskie
 */

// Class Book digunakan untuk membuat objek buku.
// Implements Cloneable digunakan agar objek Book dapat dibuat salinannya
// menggunakan method clone().
public class Book implements Cloneable {

    // Variabel t digunakan untuk menyimpan judul buku.
    // Keyword private membuat variabel hanya dapat diakses
    // langsung dari dalam class Book.
    private String t;

    // Constructor Book digunakan untuk memberikan nilai awal
    // pada variabel t ketika objek Book dibuat.
    public Book(String t) {

        // Memasukkan nilai parameter t ke atribut t.
        this.t = t;
    }

    // Method clone() digunakan untuk membuat salinan dari objek Book.
    // @Override menunjukkan bahwa method clone() berasal dari class Object
    // dan ditulis ulang pada class Book.
    @Override
    public Object clone()
            throws CloneNotSupportedException {

        // super.clone() digunakan untuk membuat salinan objek
        // berdasarkan objek saat ini.
        return super.clone();
    }

    // Method getTitle() digunakan untuk mengambil nilai judul buku.
    public String getTitle() {

        // Mengembalikan nilai dari atribut t.
        return t;
    }

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Blok try digunakan karena proses clone()
        // dapat menghasilkan CloneNotSupportedException.
        try {

            // Membuat objek b1 dari class Book
            // dengan judul "Java Basics".
            Book b1 = new Book("Java Basics");

            // Membuat salinan dari objek b1 menggunakan clone().
            // Hasil clone() bertipe Object sehingga perlu dilakukan
            // casting ke tipe Book.
            Book b2 = (Book) b1.clone();

            // Menampilkan judul buku yang terdapat pada objek b1.
            System.out.println(
                    "Judul buku b1: " + b1.getTitle()
            );

            // Menampilkan judul buku yang terdapat pada objek b2.
            System.out.println(
                    "Judul buku b2: " + b2.getTitle()
            );

            // Membandingkan apakah b1 dan b2 merupakan objek
            // yang sama di dalam memory.
            // Operator == membandingkan referensi objek.
            System.out.println(
                    "Apakah b1 dan b2 objek yang sama? "
                    + (b1 == b2)
            );

        // Menangani error jika proses cloning tidak didukung.
        } catch (CloneNotSupportedException e) {

            // Menampilkan informasi error ke console.
            e.printStackTrace();
        }
    }
}