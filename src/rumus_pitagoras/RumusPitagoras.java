/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rumus_pitagoras;

import java.util.Scanner;

/**
 *
 * @author muhammad noval aula
 */
public class RumusPitagoras {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan nilai input pertama dan kedua
        double v1, v2;

        // Meminta pengguna untuk memasukkan nilai pertama
        System.out.print("Masukkan nilai pertama (a): ");
        v1 = scanner.nextDouble();

        // Meminta pengguna untuk memasukkan nilai kedua
        System.out.print("Masukkan nilai kedua (b): ");
        v2 = scanner.nextDouble();

        // Menghitung rumus pitagoras
        double hasil = hitungPitagoras(v1, v2);

        // Menampilkan hasil perhitungan
        System.out.println("Hasil perhitungan rumus pitagoras: " + hasil);

        // Menutup objek Scanner
        scanner.close();
    }

    // Metode untuk menghitung rumus pitagoras
    public static double hitungPitagoras(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
