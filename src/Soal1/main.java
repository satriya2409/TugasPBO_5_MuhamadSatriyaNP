package Soal1;

import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JUMLAH_BILANGAN = 10; // bisa diubah, bukan konstanta
        int angka, min, max;

        System.out.println("=== Program Menentukan Bilangan Terbesar dan Terkecil ===");
        System.out.println("Masukkan " + JUMLAH_BILANGAN + " bilangan:");

        // input pertama untuk inisialisasi min dan max
        System.out.print("Bilangan ke-1: ");
        angka = input.nextInt();
        max = angka;
        min = angka;

        // mulai dari bilangan ke-2 sampai ke-10
        for (int i = 2; i <= JUMLAH_BILANGAN; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            angka = input.nextInt();

            if (angka > max) {
                max = angka;
            } else if (angka < min) {
                min = angka;
            }
        }

        System.out.println("\n=== Hasil ===");
        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);

        input.close();
    }

}
