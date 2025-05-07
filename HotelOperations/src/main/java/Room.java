public class Room {

    String roomTier;
    double price;
    boolean isClean;
    boolean isOccupied;


    public Room(double price, String roomTier, boolean isClean, boolean isOccupied){
        this.price = price;
        this.roomTier = roomTier;
        this.isClean = isClean;
        this.isOccupied = isOccupied;

    }

    public void checkIn(){
        isOccupied = true;
        isClean = false;
    }

    public void checkOut(){
        isOccupied = false;
        isClean = false;
    }

    public void cleanRoom(){
        isOccupied = false;
        isClean = true;
    }









//region gets and sets
    public String getRoomTier() {
        return roomTier;
    }

    public void setRoomTier(String roomTier) {
        this.roomTier = roomTier;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
//endregion
}
