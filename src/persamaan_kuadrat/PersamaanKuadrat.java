/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persamaan_kuadrat;

import java.util.Scanner;

/**
 *
 * @author muhammad noval aula
 */
public class PersamaanKuadrat {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nilai a, b, dan c
        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();

        // Menghitung diskriminan
        double diskriminan = b * b - 4 * a * c;

        // Menentukan akar-akar persamaan kuadrat
        if (diskriminan > 0) {
            double akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Akar-akar persamaan kuadrat: " + akar1 + " dan " + akar2);
        } else if (diskriminan == 0) {
            double akar = -b / (2 * a);
            System.out.println("Persamaan memiliki satu akar: " + akar);
        } else {
            System.out.println("Persamaan tidak memiliki akar real.");
        }

        // Menutup objek Scanner
        scanner.close();
    }
}
