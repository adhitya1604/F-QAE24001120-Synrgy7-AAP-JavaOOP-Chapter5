package TUGAS2B;

public class Car extends Vehicle {
    private int kapasitasTangki;
    private String jenisTransmisi;

    public Car(int roda, int kapasitasTangki, String jenisTransmisi) {
        super(roda);
        this.kapasitasTangki = kapasitasTangki;
        this.jenisTransmisi = jenisTransmisi;
    }

    public int getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void isiBensin() {
        System.out.println("Mengisi bensin");
    }

    public void gantiGigi() {
        System.out.println("Mengganti gigi");
    }
}