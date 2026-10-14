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

// Class Dog digunakan sebagai blueprint untuk membuat objek anjing.
public class Dog {

    // Variabel name digunakan untuk menyimpan nama anjing.
    String name;

    // Variabel breed digunakan untuk menyimpan jenis atau ras anjing.
    String breed;

    // Variabel age digunakan untuk menyimpan umur anjing.
    int age;

    // Variabel color digunakan untuk menyimpan warna anjing.
    String color;

    // Constructor Dog digunakan untuk memberikan nilai awal
    // pada atribut name, breed, age, dan color.
    public Dog(String name, String breed, int age, String color) {

        // Menyimpan nilai parameter name ke atribut name.
        this.name = name;

        // Menyimpan nilai parameter breed ke atribut breed.
        this.breed = breed;

        // Menyimpan nilai parameter age ke atribut age.
        this.age = age;

        // Menyimpan nilai parameter color ke atribut color.
        this.color = color;
    }

    // Getter getName() digunakan untuk mengambil nilai nama anjing.
    public String getName() {

        // Mengembalikan nilai dari atribut name.
        return name;
    }

    // Getter getBreed() digunakan untuk mengambil jenis atau ras anjing.
    public String getBreed() {

        // Mengembalikan nilai dari atribut breed.
        return breed;
    }

    // Getter getAge() digunakan untuk mengambil umur anjing.
    public int getAge() {

        // Mengembalikan nilai dari atribut age.
        return age;
    }

    // Getter getColor() digunakan untuk mengambil warna anjing.
    public String getColor() {

        // Mengembalikan nilai dari atribut color.
        return color;
    }

    // Method toString() digunakan untuk mengubah data objek Dog
    // menjadi bentuk String agar dapat ditampilkan dengan mudah.
    // @Override menunjukkan bahwa method ini menggantikan
    // method toString() dari class Object.
    @Override
    public String toString() {

        // Menggabungkan nama, ras, umur, dan warna anjing
        // menjadi satu teks yang akan dikembalikan.
        return ("Name is: " + this.getName()
                + "\nBreed, age, and color are: "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat objek tuffy dari class Dog.
        // Nilai yang diberikan adalah:
        // Nama  = tuffy
        // Breed = papillon
        // Umur  = 5
        // Warna = white
        Dog tuffy = new Dog(
                "tuffy",
                "papillon",
                5,
                "white"
        );

        // Memanggil method toString() dari objek tuffy
        // kemudian menampilkan hasilnya ke console.
        System.out.println(tuffy.toString());
    }
}