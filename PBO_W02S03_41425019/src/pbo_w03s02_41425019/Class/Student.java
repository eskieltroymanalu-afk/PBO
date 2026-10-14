/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s02_41425019.Class;

/**
 *
 * @author eskie
 */

import java.io.Serializable;

public class Student implements Serializable {

    int id;
    String n;

    // Constructor yang sudah ada
    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }

    // Constructor untuk Serialization
    public Student(String n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + n + "'}";
    }
}