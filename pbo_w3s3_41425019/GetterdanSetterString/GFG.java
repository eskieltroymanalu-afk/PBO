/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.GetterdanSetterString;

/**
 *
 * @author eskie
 */

// Class GetSet digunakan untuk menerapkan konsep
// Getter dan Setter pada data String.
class GetSet {

    // Variabel name digunakan untuk menyimpan nama.
    // private membuat variabel hanya dapat diakses
    // langsung dari dalam class GetSet.
    private String name;

    // Method setter digunakan untuk memberikan nilai
    // ke variabel name.
    public void setName(String N)
    {
        // this.name mengacu pada atribut name milik class.
        // Nilai parameter N dimasukkan ke dalam atribut name.
        this.name = N;
    }

    // Method getter digunakan untuk mengambil nilai
    // yang tersimpan pada variabel name.
    public String getName()
    {
        // Mengembalikan nilai name kepada pemanggil method.
        return name;
    }
}

// Class GFG digunakan sebagai class utama untuk menjalankan program.
class GFG {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args)
    {
        // Membuat objek obj dari class GetSet.
        GetSet obj = new GetSet();

        // Memanggil method setter untuk memberikan nilai
        // "Geeks for Geeks" ke dalam variabel name.
        obj.setName("Geeks for Geeks");

        // Memanggil method getter untuk mengambil nilai name
        // kemudian menampilkannya ke console.
        System.out.println(obj.getName());
    }
}