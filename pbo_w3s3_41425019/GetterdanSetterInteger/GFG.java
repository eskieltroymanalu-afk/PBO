/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.GetterdanSetterInteger;

/**
 *
 * @author eskie
 */

// Class GetSet digunakan untuk menerapkan konsep
// Getter dan Setter pada sebuah atribut.
class GetSet {

    // Variabel num digunakan untuk menyimpan nilai angka.
    // private membuat variabel hanya dapat diakses langsung
    // dari dalam class GetSet.
    private int num;

    // Method setter digunakan untuk memberikan nilai
    // ke variabel num.
    public void setNumber(int number)
    {
        // Mengecek apakah nilai number berada di luar
        // rentang 1 sampai 10.
        if (number < 1 || number > 10)
        {
            // Jika nilai tidak berada pada rentang 1-10,
            // program akan menghasilkan IllegalArgumentException.
            throw new IllegalArgumentException();
        }

        // Jika nilai valid, nilai number disimpan
        // ke dalam variabel num.
        num = number;
    }

    // Method getter digunakan untuk mengambil nilai
    // yang tersimpan pada variabel num.
    public int getNumber()
    {
        // Mengembalikan nilai num kepada pemanggil method.
        return num;
    }
}

// Class GFG digunakan sebagai class utama untuk menjalankan program.
class GFG {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String[] args)
    {
        // Membuat objek obj dari class GetSet.
        GetSet obj = new GetSet();

        // Memanggil setter untuk memberikan nilai 5
        // ke dalam variabel num.
        obj.setNumber(5);

        // Memanggil getter untuk mengambil nilai num
        // kemudian menampilkannya ke console.
        System.out.println(obj.getNumber());
    }
}