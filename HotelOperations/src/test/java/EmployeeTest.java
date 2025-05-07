import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    public void testPunchInSetsStartTime(){
        Employee employee = new Employee(1, "Finnan", "Front Desk", 5.0, 5.0, 5.0, 5.00);
        employee.punchIn(00.0); //midnight
        assertEquals(00.0, employee.getStartTime());
    }

    @Test
    public void testPunchOutCalcHoursWorked(){
        Employee employee = new Employee(5,"Billy Bob", "Security", 2,2,2,2);
        employee.punchIn(5);
        employee.punchOut(10);
        assertEquals(5, employee.getHoursWorked);

    }

    




}