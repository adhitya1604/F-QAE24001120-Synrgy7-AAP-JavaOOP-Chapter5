package TUGAS2B;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        HondaJazz jazz = new HondaJazz(4, 50, "Otomatis", "1.5L"); // Buat objek HondaJazz
        jazz.moveForward();
        jazz.turn();
        jazz.stop();
        jazz.isiBensin();
        jazz.gantiGigi();
        jazz.hidupkanMesin();

        System.out.println();


       ToyotaFortuner fortuner = new ToyotaFortuner(4, 80, "Otomatis", true); // Buat objek ToyotaFortuner
        fortuner.moveForward();
        fortuner.turn();
        fortuner.stop();
        fortuner.isiBensin();
        fortuner.gantiGigi();
        fortuner.aktifkanEmpatRoda();

        System.out.println();


        SuzukiKatana katana = new SuzukiKatana(2, 40, "Manual", true); // Buat objek SuzukiKatana
        katana.moveForward();
        katana.turn();
        katana.stop();
        katana.isiBensin();
        katana.gantiGigi();
        katana.aktifkanModeSport();
    }
}
