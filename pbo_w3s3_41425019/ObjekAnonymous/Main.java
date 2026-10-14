/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 * to edit this template
 */
package pbo_w3s3_41425019.ObjekAnonymous;

/**
 *
 * @author eskie
 */

// Mengimpor class Application yang digunakan untuk membuat
// aplikasi berbasis JavaFX.
import javafx.application.Application;

// Mengimpor class Scene yang digunakan untuk membuat tampilan
// atau area utama aplikasi.
import javafx.scene.Scene;

// Mengimpor class Button untuk membuat tombol.
import javafx.scene.control.Button;

// Mengimpor StackPane sebagai layout untuk menempatkan komponen.
import javafx.scene.layout.StackPane;

// Mengimpor Stage yang merupakan jendela utama aplikasi.
import javafx.stage.Stage;

// Class Main mewarisi class Application dari JavaFX.
// Application digunakan sebagai dasar untuk membuat aplikasi JavaFX.
public class Main extends Application {

    // Method main merupakan titik awal program Java dijalankan.
    public static void main(String[] args) {

        // launch(args) digunakan untuk menjalankan aplikasi JavaFX.
        launch(args);
    }

    // Method start() merupakan method utama JavaFX
    // yang akan dijalankan setelah aplikasi dimulai.
    @Override
    public void start(Stage stage) {

        // Membuat sebuah tombol dengan tulisan "Click Me".
        Button button = new Button("Click Me");

        // Menambahkan event handler pada tombol.
        // Ketika tombol diklik, program akan menjalankan
        // kode yang ada di dalam lambda expression.
        button.setOnAction(
            event -> System.out.println(
                "Button clicked!"
            )
        );

        // Membuat layout StackPane dan memasukkan tombol
        // sebagai komponen di dalamnya.
        StackPane root = new StackPane(button);

        // Membuat Scene dengan ukuran lebar 300 dan tinggi 200.
        // Scene menggunakan root sebagai layout utamanya.
        stage.setScene(new Scene(root, 300, 200));

        // Menampilkan jendela aplikasi kepada pengguna.
        stage.show();
    }
}