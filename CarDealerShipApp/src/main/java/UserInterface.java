import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner sc;
    private DealershipFileManager fileManager;


    public UserInterface(Dealership dealership) {
        this.fileManager = new DealershipFileManager();
        this.sc = new Scanner(System.in);
        this.dealership = fileManager.getDealership();
    }


    public void displayUserChoice() {
        boolean running = true;

        while (running) {
            System.out.println("""
                    🚗 Welcome to Hooptie Central 🚗
                    1) Search by price
                    2) Search by make/model
                    3) Search by year
                    4) Search by color
                    5) Search by mileage
                    6) Search by type (Sedan,Truck,SUV,Van)
                    7) List all vehicles""");
            String input = sc.nextLine();

            switch (input) {
                case "1":
                    System.out.println("You got money right?! 👀");
                    System.out.println("Enter minimum price: ");
                    double minPrice = sc.nextDouble();
                    System.out.println("Enter max price: ");
                    double maxPrice = sc.nextDouble();
                    sc.nextLine();
                    ArrayList<Vehicle> vehiclesByPrice = displayVehicleByPrice(minPrice, maxPrice);
                    displayVehicleByPrice(minPrice, maxPrice);
                    break;
                case "2":
                    System.out.println("UHHH your choices are Hooptie or Beater ️🤷🏽‍♂️");
                    displayByMakeAndModel();
                    break;
                case "3":
                    System.out.println("Nothing newer than '88 ..... that was a good year. 🕹️");
                    displayByYear();
                    break;
                case "4":
                    System.out.println("We got em all ..... paint isn't covered by the 24 hour warranty by the way!");
                    displayByColor();
                    break;
                case "5":
                    System.out.println("Are you accusing me of tampering with the speedometers 😲");
                    displayByMileage();
                    break;
                case "6":
                    System.out.println("Don't forget about our nice selection of vintage hearses!🧟☠️");
                    displayByType();
                    break;
                case "7":
                    System.out.println("You want the vehicles with hot titles too? .... no? Okay your loss! 👮🏽‍♂️🚓");
                    displayAllVehicles();
                    break;
                case "8":
                    System.out.println("What do you mean you changed your mind!?! Fine get out of here 🤬");
                    running = false;
                    break;
                default:
                    System.out.println("That wasn't an option ... are you dense?😒 ... EXITING");


            }

        }
    }


        public ArrayList<Vehicle> displayVehicleByPrice(double min, double max) {
            ArrayList<Vehicle> results = new ArrayList<>();
            for (Vehicle v : dealership.getAllVehicles() {
                if (v.getPrice() >= min && v.getPrice() <= max) {
                    results.add(v);
                }
            }
            return results;
        }


    private ArrayList<Vehicle> displayByMakeAndModel(String make, String model ) {
        ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle v : inventory) {
            if (v.getMake().equalsIgnoreCase(make)&& v.getModel().equalsIgnoreCase(model)) {
                results.add(v);
            }
        }
        return make, model;
    }

    private void displayByYear() {
        System.out.println("Enter year;");
        int year = sc.nextInt();
        sc.nextLine();
    }

    private void displayByColor() {
        System.out.println("Enter color");
        String color = sc.nextLine();

        ArrayList<Vehicle> results = new ArrayList<>();
        for(Vehicle v : dealership.getInventory()) {
            if (v.getColor().equalsIgnoreCase(color)) {
                results.add(v);
            }
        }
    }

    private void displayByMileage() {
        System.out.println("Enter max mileage");
        int maxMileage = sc.nextInt();
        sc.nextLine();

        ArrayList<Vehicle> results = new ArrayList<>();
        for (Vehicle v : dealership.getInventory())n{

        }
    }

    private void displayByType() {
    }

    private void displayAllVehicles(ArrayList<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("Yikes we ran out.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicles);
            }
        }
    }

}


