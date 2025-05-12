import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;




public class SemiTruck extends Vehicle{

    int trailerLength;
    String name;

    public SemiTruck(int maxMPH, double fuelCapacity, int seats, String fuelType, String color, int trailerLength, String name){
        super(maxMPH, fuelCapacity, seats, fuelType, color);
        this.trailerLength = trailerLength;
        this.name = name;

    }



    public static void main(String[] args) {
        SemiTruck semiTruck1 = new SemiTruck(80, 150.00, 2, "Diesel","Orange",53,"Optimus Prime");
        System.out.println("Max MPH: " + semiTruck1.getMaxMPH());
        System.out.println("Fuel Capacity: " + semiTruck1.getFuelCapacity());
        System.out.println("Seat Count: " + semiTruck1.getSeats());
        System.out.println("Fuel Type: " + semiTruck1.getFuelType());
        System.out.println("Color: " + semiTruck1.getColor());
        System.out.println("Trailer Length: " + semiTruck1.trailerLength);
        System.out.println("Name: " + semiTruck1.name);
        semiTruck1.introduceYourself();

    }

    public void beepHorn(){
        System.out.println("Loading sound: /optimusprime.wav");
        introduceYourself();
    }


    //sound logic
    //region
    public void introduceYourself() {
        try {
            InputStream audioScr = getClass().getResourceAsStream("/optimusprime.wav");
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
