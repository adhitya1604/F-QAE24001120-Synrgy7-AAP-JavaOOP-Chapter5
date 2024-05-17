package org.example;

import java.util.Scanner;

public class hitungBiayaParkir {
    public static double hitungBiayaParkir(int jamParkir) {
        double biaya = 0.0;
        if (jamParkir <= 5) {
            biaya = 1.0;
        } else if (jamParkir <= 24) {
            biaya = 1.0 + (0.5 * (jamParkir - 5));
        } else {
            biaya = 15.0 + 0.5 * (jamParkir - 24);
        }
        return biaya;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam parkir: ");
        int jamParkir = scanner.nextInt();

        double biaya = hitungBiayaParkir(jamParkir);
        System.out.println("Biaya parkir untuk " + jamParkir + " jam adalah $" + biaya);

        scanner.close();
    }
}