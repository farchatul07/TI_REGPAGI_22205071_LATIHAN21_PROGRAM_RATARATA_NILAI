/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan21;
import java.util.Scanner;
/**
 *
 * @author user
 Nama              : Farchatul Hudayah
 Nim               : 22205071
 Prodi             : Teknik Informatika
 Kelas             : PBO1
 Deskripsi Program : Program ini berisi program yang menerima input jumlah, nilai, menghitung dan mencetak rata-rata nilai

public class Latihan21 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input jumlah mahasiswa
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int banyakMahasiswa = input.nextInt();

        // Menerima input nilai mahasiswa
        int[] nilaiMahasiswa = new int[banyakMahasiswa];
        for (int i = 0; i < banyakMahasiswa; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        // Menghitung rata-rata nilai
        int totalNilai = 0;
        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }
        float rataRataNilai = (float) totalNilai / banyakMahasiswa;

        // Mencetak rata-rata nilai
        System.out.println("Rata-rata nilainya adalah: " + rataRataNilai);
    }
}
