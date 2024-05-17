package TUGAS2B;

public class SuzukiKatana extends Car {
    private boolean modeSport;

    public SuzukiKatana(int roda, int kapasitasTangki, String jenisTransmisi, boolean modeSport) {
        super(roda, kapasitasTangki, jenisTransmisi);
        this.modeSport = modeSport;
    }

    public void aktifkanModeSport() {
        System.out.println("Mengaktifkan mode sport");
    }

    @Override
    public void stop() {
        System.out.println("Berhenti dengan sistem pengereman canggih Suzuki Katana");
    }
}
