 /*
  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
  * to change this license
  * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
  * to edit this template
  */
 package pbo_w3s3_41425019.Concurrencymethods;

 /**
  *
  * @author eskie
  */

 // Class MainConcurrency digunakan sebagai class utama
 // untuk menjalankan proses concurrency menggunakan beberapa thread.
 public class MainConcurrency {

     // Method main merupakan titik awal program dijalankan.
     public static void main(String[] args) {

         // Membuat objek antrean yang digunakan secara bersama
         // oleh thread produsen dan thread konsumen.
         AntreanShared antrean = new AntreanShared();

         // Membuat thread Produsen.
         // Thread ini bertugas mengirimkan beberapa pesan
         // ke dalam antrean.
         Thread produsen = new Thread(() -> {

             // Membuat array yang berisi daftar pesan
             // yang akan dikirimkan oleh produsen.
             String[] listPesan = {
                 "Halo",
                 "Belajar Java",
                 "Selesai"
             };

             // Perulangan digunakan untuk mengambil setiap pesan
             // yang terdapat di dalam array listPesan.
             for (String p : listPesan) {

                 // Memanggil method kirimPesan()
                 // untuk memasukkan pesan ke dalam antrean.
                 antrean.kirimPesan(p);
             }
         });

         // Membuat thread Konsumen.
         // Thread ini bertugas mengambil pesan dari antrean.
         Thread konsumen = new Thread(() -> {

             // Perulangan dilakukan sebanyak 3 kali
             // karena terdapat 3 pesan yang dikirim oleh produsen.
             for (int i = 0; i < 3; i++) {

                 // Memanggil method ambilPesan()
                 // untuk mengambil pesan dari antrean.
                 antrean.ambilPesan();
             }
         });

         // Memulai thread produsen.
         // Setelah start() dipanggil, kode di dalam thread
         // produsen mulai dijalankan.
         produsen.start();

         // Memulai thread konsumen.
         // Thread konsumen mulai berjalan secara bersamaan
         // dengan thread produsen.
         konsumen.start();
     }
 }