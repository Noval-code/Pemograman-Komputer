/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataMahasiswa;

import java.util.Scanner;

/**
 *
 * @author muhammad noval aula
 */
public class dataMahasiswa {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;

        String[][] dataMahasiswa = new String[100][3]; // Maksimum 100 mahasiswa

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu : ");

            menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1 :
                    tambahDataMahasiswa(scanner, dataMahasiswa);
                    break;

                case 2 :
                    lihatDataMahasiswa(dataMahasiswa);
                    break;

                case 3 :
                    System.out.println("Terima kasih! Program keluar.");
                    break;

                default:
                    System.out.println("Pilihan Salah!");
                    break;
            }

        } while (menuChoice != 3);

        scanner.close();
    }

    private static void tambahDataMahasiswa(Scanner scanner, String[][] dataMahasiswa) {
        int index = 0;

        do {
            System.out.print("Ketik NIM: ");
            String nim = scanner.next();
            System.out.print("Ketik NAMA: ");
            String nama = scanner.next();
            System.out.print("Ketik ANGKATAN: ");
            String angkatan = scanner.next();

            // Menyimpan data mahasiswa
            dataMahasiswa[index][0] = nim;
            dataMahasiswa[index][1] = nama;
            dataMahasiswa[index][2] = angkatan;

            index++;
            System.out.println("Data berhasil di simpan");

            // Menanyakan apakah ingin menambah data lagi
            System.out.print("Tambah data mahasiswa lagi? (Y/N): ");
            char addMore = scanner.next().charAt(0);

            if (addMore != 'y' && addMore != 'Y') {
                break;
            }

        } while (index < dataMahasiswa.length);

       
    }

    private static void lihatDataMahasiswa(String[][] dataMahasiswa) {
        System.out.println("Data Mahasiswa:");

        for (int i = 0; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i][0] != null) {
                System.out.println("NIM: " + dataMahasiswa[i][0]);
                System.out.println("NAMA: " + dataMahasiswa[i][1]);
                System.out.println("ANGKATAN: " + dataMahasiswa[i][2]);
                System.out.println("--------------------------");
            }
        }
    }
}
