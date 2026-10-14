/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s02_41425019.SingelInheritance;

/**
 *
 * @author eskie
 */
class Vehicle {

    Vehicle() {

        System.out.println(
                "This is a Vehicle"
        );
    }
}

class Car extends Vehicle {

    Car() {

        System.out.println(
                "This Vehicle is Car"
        );
    }
}

public class Test {

    public static void main(String[] args) {

        Car obj = new Car();
    }
}
