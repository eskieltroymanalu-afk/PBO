/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.ObjekClass;

/**
 *
 * @author eskie
 */

// Class Geeks mengimplementasikan interface Cloneable.
// Cloneable digunakan agar objek dari class ini dapat dibuat salinannya
// menggunakan method clone().
class Geeks implements Cloneable {

    // Method clone() digunakan untuk membuat salinan
    // dari objek Geeks yang sedang digunakan.
    @Override
    protected Object clone()
            throws CloneNotSupportedException {

        // Memanggil method clone() dari parent class yaitu Object.
        // super.clone() akan membuat salinan objek.
        return super.clone();
    }

    // Atribut name digunakan untuk menyimpan nama.
    // Nilai awalnya adalah "GeeksForGeeks".
    String name = "GeeksForGeeks";

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // Membuat objek o1 dari class Geeks.
        Geeks o1 = new Geeks();

        // Blok try digunakan karena proses cloning
        // dapat menghasilkan CloneNotSupportedException.
        try {

            // Membuat salinan objek o1 menggunakan method clone().
            // Hasil dari clone() bertipe Object sehingga perlu
            // dilakukan casting menjadi tipe Geeks.
            Geeks o2 = (Geeks) o1.clone();

            // Menampilkan nilai atribut name dari objek hasil clone.
            System.out.println(o2.name);

        // Menangani error jika objek tidak dapat di-clone.
        } catch (CloneNotSupportedException e) {

            // Menampilkan informasi error apabila terjadi exception.
            e.printStackTrace();
        }
    }
}