/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */

// Menentukan package tempat class berada.
package pbo_w3s3_41425019.Reflection;

/**
 *
 * @author eskie
 */

// Class Student digunakan sebagai class yang akan dibuat
// objeknya menggunakan Reflection.
class Student {

    // Constructor kosong atau default constructor.
    // Constructor ini diperlukan agar Reflection dapat membuat objek.
    public Student() {
    }
}

// Class Main merupakan class utama program.
public class Main {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // try digunakan untuk menangani kemungkinan error
        // saat proses Reflection dilakukan.
        try {

            // Class.forName() digunakan untuk mendapatkan informasi
            // class berdasarkan nama lengkap class.
            Class<?> c = Class.forName(
                    "pbo_w3s3_41425019.Reflection.Student"
            );

            // getDeclaredConstructor() digunakan untuk mengambil
            // constructor yang dimiliki oleh class Student.
            //
            // newInstance() digunakan untuk membuat objek baru
            // berdasarkan constructor tersebut.
            //
            // Hasil object kemudian di-casting menjadi Student.
            Student s2 = (Student)
                    c.getDeclaredConstructor().newInstance();

            // Menampilkan object yang berhasil dibuat.
            System.out.println("Object created: " + s2);

        // Exception terjadi jika class Student tidak ditemukan.
        } catch (ClassNotFoundException e) {

            // Menampilkan pesan bahwa class tidak ditemukan.
            System.err.println("Class not found!");

        // Exception terjadi jika constructor kosong tidak ditemukan.
        } catch (NoSuchMethodException e) {

            // Menampilkan pesan bahwa default constructor tidak ada.
            System.err.println("No default constructor!");

        // Menangani exception lainnya.
        } catch (Exception e) {

            // Menampilkan informasi error secara lengkap.
            e.printStackTrace();
        }
    }
}