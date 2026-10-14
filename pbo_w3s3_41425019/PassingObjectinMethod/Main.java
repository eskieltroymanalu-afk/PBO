/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.PassingObjectinMethod;

/**
 *
 * @author eskie
 */

// Class ObjectPassDemo digunakan untuk menunjukkan
// cara mengirim atau passing object sebagai parameter method.
class ObjectPassDemo {

    // Variabel a dan b digunakan untuk menyimpan dua nilai integer.
    int a, b;

    // Constructor digunakan untuk memberikan nilai awal
    // pada variabel a dan b ketika objek dibuat.
    ObjectPassDemo(int i, int j)
    {
        // Memasukkan nilai parameter i ke variabel a.
        a = i;

        // Memasukkan nilai parameter j ke variabel b.
        b = j;
    }

    // Method equalTo digunakan untuk membandingkan
    // nilai a dan b dari objek saat ini dengan objek lain.
    // Parameter o merupakan object dari class ObjectPassDemo.
    boolean equalTo(ObjectPassDemo o)
    {
        // Membandingkan nilai a dan b.
        // Method mengembalikan true jika kedua nilai sama.
        // Jika salah satu nilai berbeda, hasilnya false.
        return (o.a == a && o.b == b);
    }
}

// Class Main digunakan sebagai class utama program.
public class Main {

    // Method main merupakan titik awal program dijalankan.
    public static void main(String args[]) {

        // Membuat objek ob1 dengan nilai a = 100 dan b = 22.
        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);

        // Membuat objek ob2 dengan nilai a = 100 dan b = 22.
        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);

        // Membuat objek ob3 dengan nilai a = -1 dan b = -1.
        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);

        // Memanggil method equalTo() untuk membandingkan
        // nilai objek ob1 dengan objek ob2.
        System.out.println("ob1 == ob2: "
                + ob1.equalTo(ob2));

        // Memanggil method equalTo() untuk membandingkan
        // nilai objek ob1 dengan objek ob3.
        System.out.println("ob1 == ob3: "
                + ob1.equalTo(ob3));
    }
}