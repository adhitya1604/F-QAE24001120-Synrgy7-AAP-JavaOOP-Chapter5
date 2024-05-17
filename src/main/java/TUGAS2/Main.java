package TUGAS2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor rekening: ");
        String nomorRekening = scanner.nextLine();

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan email pelanggan: ");
        String emailPelanggan = scanner.nextLine();

        System.out.print("Masukkan telepon pelanggan: ");
        String teleponPelanggan = scanner.nextLine();

        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = scanner.nextDouble();

        BankAccount rekening = new BankAccount(nomorRekening, namaPelanggan, emailPelanggan, teleponPelanggan, saldoAwal);

        System.out.print("Masukkan jumlah yang ingin disetor: ");
        double jumlahSetoran = scanner.nextDouble();
        rekening.deposito(jumlahSetoran);

        System.out.print("Masukkan jumlah yang ingin ditarik: ");
        double jumlahPenarikan = scanner.nextDouble();
        rekening.penarikan(jumlahPenarikan);

        scanner.close();
    }
}
