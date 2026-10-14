// Menentukan package tempat class Main berada.
package pbo_w3s3_41425019.ObjekClass;

// Import FileInputStream untuk membaca file.
import java.io.FileInputStream;

// Import FileOutputStream untuk membuat dan menulis ke file.
import java.io.FileOutputStream;

// Import IOException untuk menangani error saat proses input/output.
import java.io.IOException;

// Import ObjectInputStream untuk membaca objek dari file
// pada proses deserialization.
import java.io.ObjectInputStream;

// Import ObjectOutputStream untuk menulis objek ke file
// pada proses serialization.
import java.io.ObjectOutputStream;

// Class Main digunakan sebagai class utama program.
public class Main {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args) {

        // =========================
        // SERIALIZATION
        // =========================

        // ObjectOutputStream digunakan untuk menyimpan objek
        // ke dalam file dalam bentuk byte.
        // FileOutputStream digunakan untuk membuat atau membuka
        // file student.ser.
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {

            // Membuat objek Student dengan nama "Alice".
            // Class Student harus mengimplementasikan Serializable
            // agar objek dapat disimpan ke dalam file.
            Student student = new Student("Alice");

            // Menulis atau menyimpan objek student
            // ke dalam file student.ser.
            out.writeObject(student);

            // Menampilkan pesan jika proses penyimpanan berhasil.
            System.out.println("Object berhasil disimpan.");

        // Menangani error yang terjadi saat proses serialization.
        } catch (IOException e) {

            // Menampilkan informasi error ke console.
            e.printStackTrace();
        }

        // =========================
        // DESERIALIZATION
        // =========================

        // ObjectInputStream digunakan untuk membaca kembali
        // objek yang sebelumnya telah disimpan ke dalam file.
        // FileInputStream digunakan untuk membuka file student.ser.
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("student.ser"))) {

            // Membaca objek dari file menggunakan readObject().
            // Hasil readObject() bertipe Object sehingga perlu
            // dilakukan casting menjadi tipe Student.
            Student s = (Student) in.readObject();

            // Menampilkan pesan jika proses pembacaan berhasil.
            System.out.println("Object berhasil dibaca.");

            // Menampilkan isi objek Student.
            // Java akan memanggil method toString()
            // jika method tersebut tersedia pada class Student.
            System.out.println(s);

        // Menangani error input/output dan error ketika
        // class Student tidak ditemukan.
        } catch (IOException | ClassNotFoundException e) {

            // Menampilkan informasi error ke console.
            e.printStackTrace();
        }
    }
}