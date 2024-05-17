package TUGAS2B;
public class Vehicle {
    private int roda;

    public Vehicle(int roda) {
        this.roda = roda;
    }

    public Vehicle() {

    }


    public int getRoda() {
        return roda;
    }

    public void moveForward() {
        System.out.println("Bergerak maju dengan " + roda + " ban");
    }

    public void turn() {
        System.out.println("Belok dengan " + roda + " ban");
    }

    public void stop() {
        System.out.println("Berhenti dengan " + roda + " ban");
    }










}
