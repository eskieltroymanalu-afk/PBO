/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.HierarchicalInheritance;

/**
 *
 * @author eskie
 */

// Class Vehicle merupakan parent class atau superclass.
// Class ini menjadi induk bagi class Car dan Bus.
class Vehicle {

    // Constructor Vehicle akan otomatis dipanggil
    // ketika objek dari class turunan dibuat.
    Vehicle() {

        // Menampilkan pesan bahwa objek merupakan Vehicle.
        System.out.println(
                "This is a Vehicle"
        );
    }
}

// Class Car merupakan subclass atau child class
// yang mewarisi sifat dan constructor dari class Vehicle.
class Car extends Vehicle {

    // Constructor Car digunakan ketika objek Car dibuat.
    Car() {

        // Menampilkan pesan bahwa Vehicle yang dibuat adalah Car.
        System.out.println(
                "This Vehicle is Car"
        );
    }
}

// Class Bus juga merupakan subclass atau child class
// dari class Vehicle.
class Bus extends Vehicle {

    // Constructor Bus digunakan ketika objek Bus dibuat.
    Bus() {

        // Menampilkan pesan bahwa Vehicle yang dibuat adalah Bus.
        System.out.println(
                "This Vehicle is Bus"
        );
    }
}

// Class Test digunakan sebagai class utama untuk menjalankan program.
public class Test {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat objek obj1 dari class Car.
        // Sebelum constructor Car dijalankan,
        // constructor Vehicle sebagai parent class akan dijalankan terlebih dahulu.
        Car obj1 = new Car();

        // Membuat objek obj2 dari class Bus.
        // Sama seperti Car, constructor Vehicle akan dijalankan terlebih dahulu,
        // kemudian constructor Bus.
        Bus obj2 = new Bus();
    }
}