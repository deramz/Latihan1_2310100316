/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

public class Matematika {
    // Deklarasi variabel bil1 dan bil2 bertipe data double
    private double bil1;
    private double bil2;

    // Constructor untuk mengisi nilai variabel bil1 dan bil2
    public Matematika(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    // Method setPenjumlahan yang mengembalikan hasil bil1 + bil2
    public double setPenjumlahan() {
        return bil1 + bil2;
    }

    // Method setPengurangan yang mengembalikan hasil bil1 - bil2
    public double setPengurangan() {
        return bil1 - bil2;
    }

    // Method setPerkalian yang mengembalikan hasil bil1 * bil2
    public double setPerkalian() {
        return bil1 * bil2;
    }

    // Method setPembagian yang mengembalikan hasil bil1 / bil2
    public double setPembagian() {
        if (bil2 != 0) {
            return bil1 / bil2;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        // Membuat objek Matematika
        Matematika matematika = new Matematika(10.0, 5.0);

        // Menampilkan hasil operasi
        System.out.println("Penjumlahan: " + matematika.setPenjumlahan());
        System.out.println("Pengurangan: " + matematika.setPengurangan());
        System.out.println("Perkalian: " + matematika.setPerkalian());
        System.out.println("Pembagian: " + matematika.setPembagian());
    }
}