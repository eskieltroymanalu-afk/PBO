/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.MultilevelInheritance;

/**
 *
 * @author eskie
 */

// Class Vehicle merupakan parent class atau superclass.
// Class ini menjadi tingkat pertama dalam multilevel inheritance.
class Vehicle {

    // Constructor Vehicle akan dijalankan ketika
    // objek dari class turunan dibuat.
    Vehicle() {

        // Menampilkan pesan bahwa objek merupakan Vehicle.
        System.out.println(
                "This is a Vehicle"
        );
    }
}

// Class FourWheeler merupakan subclass dari Vehicle.
// Class ini menjadi tingkat kedua dalam pewarisan.
class FourWheeler extends Vehicle {

    // Constructor FourWheeler digunakan ketika objek
    // dari class FourWheeler atau turunannya dibuat.
    FourWheeler() {

        // Menampilkan pesan bahwa kendaraan memiliki empat roda.
        System.out.println(
                "4 Wheeler Vehicles"
        );
    }
}

// Class Car merupakan subclass dari FourWheeler.
// Car berada pada tingkat ketiga dalam multilevel inheritance.
class Car extends FourWheeler {

    // Constructor Car digunakan ketika objek Car dibuat.
    Car() {

        // Menampilkan pesan bahwa kendaraan roda empat tersebut
        // merupakan sebuah mobil.
        System.out.println(
                "This 4 Wheeler Vehicle is a Car"
        );
    }
}

// Class Geeks digunakan sebagai class utama untuk menjalankan program.
public class Geeks {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat objek obj dari class Car.
        // Karena Car mewarisi FourWheeler dan FourWheeler
        // mewarisi Vehicle, constructor akan dijalankan
        // mulai dari Vehicle, FourWheeler, kemudian Car.
        Car obj = new Car();
    }
}