import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RoomTest {


    @Test
    public void testCheckIn_RoomEmpty() {
        // create a fresh object to test
        Room room = new Room(100, "King", true, false);
        // attempt to check in
        room.checkIn();
        assertTrue(room.isOccupied(), "The room should be occupied after check in.");
        assertFalse(room.isClean(), "The room should be dirty after check in.");
    }

    @Test
    public void testCheckIn() {
        Room room = new Room(100, "King", false, true);
        // point to the  method without calling it yet
        Exception e = assertThrows(IllegalStateException.class, room::checkIn);
        assertEquals("Room is already occupied or not clean", e.getMessage());
    }

   @Test
    public void testCheckOut() {
        Room room = new Room(100, "King", true,true);
        room.checkIn();
        room.checkOut();
        assertFalse(room.isOccupied(), "The room should not be occupied after checkout.");
        assertFalse(room.isClean(), "The room should be dirty after checkout.");

   }

   @Test
    public void testCleanRoom() {
        Room room = new Room(100, "King", false, false);
        room.cleanRoom();
        assertTrue(room.isClean);
   }

}