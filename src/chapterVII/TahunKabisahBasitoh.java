/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapterVII;

import java.util.Scanner;

/**
 *
 * @author muhammad noval aula
 */
public class TahunKabisahBasitoh {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tahun Kabisah-Basitoh");
            System.out.println("2. Keluar");
            System.out.print("Pilih Anda : ");

            // Memeriksa apakah input adalah angka
            while (!scanner.hasNextInt()) {
                System.out.println("Masukkan angka yang valid!");
                System.out.print("Pilih Anda : ");
                scanner.next();
            }

            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                    System.out.print("Masukkan tahun: ");
                    
                    
                    while (!scanner.hasNextInt()) {
                        System.out.println("Masukkan tahun yang valid!");
                        System.out.print("Masukkan tahun: ");
                        scanner.next();
                    }

                    int tahun = scanner.nextInt();
                    String jenisTahun = determineJenisTahun(tahun);
                    System.out.println("tahun " + tahun + " adalah " + jenisTahun);
                      System.out.print("Apakah Anda ingin melanjutkan? (Y/N): ");
                    char continueChoice = scanner.next().charAt(0);

                    if (continueChoice != 'Y' && continueChoice != 'y') {
                        menuChoice = 2; // Keluar dari program jika tidak ingin melanjutkan
                    }
                    
                    break;

                case 2:
                    System.out.println("Terima kasih! Program keluar.");
                    break;

                default:
                    System.out.println("pilihan salah!");
            }
        } while (menuChoice != 2);

     
        scanner.close();
    }

    private static String determineJenisTahun(int tahun) {
        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {
            return "Tahun Kabisah";
        } else {
            return "Tahun Basitoh";
        }
    }
}
