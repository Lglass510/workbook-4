import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;


public class Hovercraft extends Vehicle {
    public double hoverHeight;
    public String aiAutoPilotName;


    public Hovercraft(int maxMPH, double fuelCapacity, int seats, String fuelType, String color, double hoverHeight, String aiAutoPilotName) {
        super(maxMPH, fuelCapacity, seats, fuelType, color);
        this.hoverHeight = hoverHeight;
        this.aiAutoPilotName = aiAutoPilotName;

    }

    public void driveCraft(){
        playDriveCraft();driveCraft();
    }

    public static void main(String[] args) {
       Hovercraft hv1 = new Hovercraft(300,40,8,"JP8,", "Purple", 15,"Sonny");
        System.out.println("MAX MPH: " + hv1.getMaxMPH());
        System.out.println("Fuel Capacity: " + hv1.getFuelCapacity());
        System.out.println("Seats: " + hv1.getSeats());
        System.out.println("Fuel Type: " + hv1.getFuelType());
        System.out.println("Color: " + hv1.getColor());
        System.out.println("Hover Height: " + hv1.hoverHeight);
        System.out.println("AI Auto Pilot Name: " + hv1.aiAutoPilotName);
        hv1.playDriveCraft();



    }
    //sound logic
    //region
    public void playDriveCraft() {
        try {
            InputStream audioScr = getClass().getResourceAsStream("/hovercraft.wav");
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
