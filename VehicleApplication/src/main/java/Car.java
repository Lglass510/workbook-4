import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;



public class Car extends Vehicle  {
    boolean sunroof;


    public Car (int maxMPH, double fuelCapacity, int seats, String fuelType, String color, boolean sunroof){
        super(maxMPH, fuelCapacity, seats, fuelType, color);
        this.sunroof = sunroof;

    }

    public void carSound(){
        playCarSound();
        System.out.println("Look out!!!");

    }

    public static void main(String[] args) {
        Car car1 = new Car(140,20,5, "Regular Unleaded","black",true);
        System.out.println("Max MPH: " + car1.getMaxMPH());
        System.out.println("Fuel Capacity: " + car1.getFuelCapacity());
        System.out.println("Seat Count: " + car1.getSeats());
        System.out.println("Fuel Type: " + car1.getFuelType());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Kickstand Engaged: " + car1.sunroof);
        car1.playCarSound();

    }


    //sound logic
    //region
    public void playCarSound() {
        try {
            InputStream audioScr = getClass().getResourceAsStream("/carhorn.wav");
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
