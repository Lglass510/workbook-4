import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;


public class Moped extends Vehicle {

    //Fields
    boolean kickstand;
    boolean sideCar;


    public Moped(int maxMPH, double fuelCapacity, int seats, String fuelType, String color, boolean kickstand, boolean sideCar){
        super(maxMPH, fuelCapacity, seats, fuelType, color);
        this.kickstand = kickstand;
        this.sideCar = sideCar;

    }


    public static void main(String[] args) {
        Moped moped1 = new Moped(35,10.2,2,
                "Regular", "Blue", true , true);
        System.out.println("Max MPH: " + moped1.getMaxMPH());
        System.out.println("Fuel Capacity: " + moped1.getFuelCapacity());
        System.out.println("Seat Count: " + moped1.getSeats());
        System.out.println("Fuel Type: " + moped1.getFuelType());
        System.out.println("Color: " + moped1.getColor());
        System.out.println("Kickstand Engaged: " + moped1.kickstand);
        System.out.println("Sidecar Addition: " + moped1.sideCar);
        moped1.beepHorn();
    }

    public void beepHorn(){
        System.out.println("MEEP MEEP");
        playHornSound();
    }


//sound logic
    //region
    public void playHornSound() {
        try {
            InputStream audioScr = getClass().getResourceAsStream("/hornsound.wav");
            if (audioScr == null) {
                System.out.println("Sound file not found!");
                return;
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioScr);

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            Thread.sleep(2000);

        }catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    //endregion




}



