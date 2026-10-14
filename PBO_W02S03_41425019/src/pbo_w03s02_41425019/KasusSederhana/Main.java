/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s02_41425019.KasusSederhana;

/**
 *
 * @author eskie
 */
class Mahasiswa {
    String nama;
    String nim;
}

class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Membuat objek MahasiswaAktif
        MahasiswaAktif m1 = new MahasiswaAktif();

        // Mengisi data mahasiswa
        m1.nama = "Budi";
        m1.nim = "12345";
        m1.semester = 3;

        // Menampilkan data mahasiswa
        System.out.println("Nama: " + m1.nama);
        System.out.println("NIM: " + m1.nim);
        System.out.println("Semester: " + m1.semester);

        // Memanggil method belajar
        m1.belajar();
    }
}
