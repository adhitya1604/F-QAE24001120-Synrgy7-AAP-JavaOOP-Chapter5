package TUGAS2;

import java.util.Scanner;
public class BankAccount {
    private String nomorRekening;
    private double saldo;
    private String namaPelanggan;
    private String emailPelanggan;
    private String teleponPelanggan;


    public BankAccount(String nomorRekening, String namaPelanggan, String emailPelanggan, String teleponPelanggan, double saldoAwal) {
        this.nomorRekening = nomorRekening;
        this.namaPelanggan = namaPelanggan;
        this.emailPelanggan = emailPelanggan;
        this.teleponPelanggan = teleponPelanggan;
        this.saldo = saldoAwal;
    }


    public String getNomorRekening() {
        return nomorRekening;
    }


    public void setNomorRekening(String nomorRekening) {

        this.nomorRekening = nomorRekening;
    }


    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getNamaPelanggan() {

        return namaPelanggan;
    }


    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }


    public String getEmailPelanggan() {
        return emailPelanggan;
    }


    public void setEmailPelanggan(String emailPelanggan) {

        this.emailPelanggan = emailPelanggan;
    }


    public String getTeleponPelanggan() {

        return teleponPelanggan;
    }


    public void setTeleponPelanggan(String teleponPelanggan) {
        this.teleponPelanggan = teleponPelanggan;
    }


    public void deposito(double jumlah) {
        saldo += jumlah;
        System.out.println("Disetor: " + jumlah);
        System.out.println("Saldo baru: " + saldo);
    }


    public void penarikan(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Error: Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Ditarik: " + jumlah);
            System.out.println("Saldo baru: " + saldo);
        }
    }


}