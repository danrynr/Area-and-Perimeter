package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        Trapesium otrapesium;
        Layang olayang;
        BelahKetupat obelah;
        int s1, s2, t, s3, s4, s5, r, d1, d2;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();
        otrapesium = new Trapesium();
        olayang = new Layang();
        obelah = new BelahKetupat();

        mainMenu();

        switch(pilihan) {
            case '1': {
                System.out.println("Masukkan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.println("Masukkan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1,s2));
                break;
            }
            case '2': {
                System.out.println("Masukkan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.println("Masukkan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + osegitiga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + osegitiga.keliling(s1,s2));
                break;
            }
            case '3': {
                System.out.println("Masukkan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                break;
            }
            case '4': {
                System.out.println("Masukkan sisi atas trapesium: ");
                s1 = scanner.nextInt();
                System.out.println("Masukkan sisi bawah trapesium: ");
                s2 = scanner.nextInt();
                System.out.println("Masukkan tinggi trapesium: ");
                t = scanner.nextInt();
                System.out.println("Masukkan sisi kiri trapesium: ");
                s3 = scanner.nextInt();
                System.out.println("Masukkan sis kanan trapesium: ");
                s4 = scanner.nextInt();
                System.out.println("Luas trapesium: " + otrapesium.luas(s1,s2,t));
                System.out.println("Keliling trapesium: " + otrapesium.keliling(s1,s2,s3,s4));
                break;
            }
            case '5': {
                System.out.println("Masukkan diagonal 1 layang-layang: ");
                d1 = scanner.nextInt();
                System.out.println("Masukkan diagonal 2 layang-layang: ");
                d2 = scanner.nextInt();
                System.out.println("Masukkan sisi 1 layang-layang: ");
                s1 = scanner.nextInt();
                System.out.println("Masukkan sisi 2 layang-layang: ");
                s2 = scanner.nextInt();
                System.out.println("Luas layang-layang: " + olayang.luas1(d1,d2));
                System.out.println("Keliling layang-layang: " + olayang.keliling(s1,s2));
                break;
            }
            case '6': {
                System.out.println("Masukkan diagonal 1 belah ketupat: ");
                d1 = scanner.nextInt();
                System.out.println("Masukkan diagonal 2 belah ketupat: ");
                d2 = scanner.nextInt();
                System.out.println("Masukkan sisi belah ketupat: ");
                s5 = scanner.nextInt();
                System.out.println("Luas belah ketupat: " + obelah.luas1(d1,d2));
                System.out.println("Keliling belah ketupat: " + obelah.keliling1(s5));
                break;
            }
            default: {
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu() {
        System.out.println("===================");
        System.out.println("Hitung Luas dan Keliling: ");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.println("6. Belah Ketupat");
        System.out.print("Masukkan menu: ");
        pilihan = scanner.next().charAt(0);
    }
}
