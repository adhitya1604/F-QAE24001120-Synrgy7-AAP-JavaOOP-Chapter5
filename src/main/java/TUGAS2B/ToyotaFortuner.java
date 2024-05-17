package TUGAS2B;

public class ToyotaFortuner extends Car {
    private boolean empatRodanyaHidup;

    public ToyotaFortuner(int roda, int kapasitasTangki, String jenisTransmisi, boolean empatRodanyaHidup) {
        super(roda, kapasitasTangki, jenisTransmisi);
        this.empatRodanyaHidup = empatRodanyaHidup;
    }

    public void aktifkanEmpatRoda() {
        System.out.println("Mengaktifkan empat roda");
    }

    @Override
    public void turn() {
        System.out.println("Belok dengan kontrol stabilitas canggih Toyota Fortuner");
    }
}
