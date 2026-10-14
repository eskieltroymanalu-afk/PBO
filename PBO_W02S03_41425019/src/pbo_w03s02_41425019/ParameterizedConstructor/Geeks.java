/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s02_41425019.ParameterizedConstructor;

/**
 *
 * @author eskie
 */
class Geeks {

    String name;
    int id;

    Geeks(String name, int id) {

        this.name = name;
        this.id = id;
    }
}

class Main {

    public static void main(String[] args) {

        Geeks geek1 =
                new Geeks("Sweta", 68);

        System.out.println(
                "GeekName: " + geek1.name
                + " and GeekId: " + geek1.id
        );
    }
}
