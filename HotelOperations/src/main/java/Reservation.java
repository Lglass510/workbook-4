public class Reservation {
    String roomTier;
    int numberOfNights;
    boolean isWeekend;
    double basePrice;



    public Reservation(String roomTier, int numberOfNights,
                       double basePrice, boolean isWeekend){
        this.roomTier = roomTier;
        this.basePrice = basePrice;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

    }

//region gets and sets

    public double getPrice(){
        double basePrice = roomTier.equals("King") ? 139.0 : 124.0;
        if (isWeekend) {
            basePrice *= 1.10; //100% of the base price plus 10%
        }
        return basePrice;
    }



    public String getRoomTier() {
        return roomTier;
    }

    public void setRoomTier(String roomTier) {
        this.roomTier = roomTier;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }


    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
//endregion




}
