/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w3s3_41425019.Tutor;

/**
 *
 * @author eskie
 */

public class Main {

    public static void main(String[] args) {

        Perpustakaan p1 = new Perpustakaan(
            "Pemrograman Java",
            "Eskiel"
        );

        p1.meminjam();
        p1.mengembalikan();
    }
}
