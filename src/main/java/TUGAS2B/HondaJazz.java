package TUGAS2B;

public class HondaJazz extends Car {
    private String jenisMesin;

    public HondaJazz(int roda, int kapasitasTangki, String jenisTransmisi, String jenisMesin) {
        super(roda, kapasitasTangki, jenisTransmisi);
        this.jenisMesin = jenisMesin;
    }

    public void hidupkanMesin() {
        System.out.println("Menyalakan mesin Honda Jazz");
    }

    @Override
    public void moveForward() {
        System.out.println("Bergerak maju dengan akselerasi halus Honda Jazz");
    }
}
