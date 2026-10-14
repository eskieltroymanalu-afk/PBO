/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */
package pbo_w03s02_41425019.Anonymous;

/**
 *
 * @author eskie
 */

public class Main {

    public static void main(String[] args) {

        // Membuat object dengan anonymous class
        Runnable button = new Runnable() {

            @Override
            public void run() {
                System.out.println("Button clicked!");
            }
        };

        // Menjalankan object
        button.run();
    }
}