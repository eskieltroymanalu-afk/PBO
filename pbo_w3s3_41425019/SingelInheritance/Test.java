/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */

// Menentukan package tempat class berada.
package pbo_w3s3_41425019.SingelInheritance;

/**
 *
 * @author eskie
 */

// Class Vehicle merupakan parent class atau superclass.
// Class ini menjadi class induk dari class Car.
class Vehicle {

    // Constructor dari class Vehicle.
    // Constructor akan otomatis dijalankan ketika
    // objek dari class Car dibuat.
    Vehicle() {

        // Menampilkan pesan bahwa objek berasal dari Vehicle.
        System.out.println(
                "This is a Vehicle"
        );
    }
}

// Class Car merupakan child class atau subclass
// yang mewarisi class Vehicle.
class Car extends Vehicle {

    // Constructor dari class Car.
    Car() {

        // Menampilkan pesan bahwa Vehicle tersebut adalah Car.
        System.out.println(
                "This Vehicle is Car"
        );
    }
}

// Class Test digunakan sebagai class utama program.
public class Test {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat objek obj dari class Car.
        //
        // Ketika objek Car dibuat, constructor parent class
        // Vehicle akan dijalankan terlebih dahulu.
        // Setelah itu constructor Car dijalankan.
        Car obj = new Car();
    }
}