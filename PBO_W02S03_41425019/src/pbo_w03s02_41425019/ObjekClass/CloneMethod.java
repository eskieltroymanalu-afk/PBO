/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w03s02_41425019.ObjekClass;

/**
 *
 * @author eskie
 */
class Geeks implements Cloneable {

    @Override
    protected Object clone()
            throws CloneNotSupportedException {

        return super.clone(); // super() mengacu ke parent class
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args) { // Method 2

        Geeks o1 = new Geeks();

        try {
            Geeks o2 = (Geeks) o1.clone();

            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
