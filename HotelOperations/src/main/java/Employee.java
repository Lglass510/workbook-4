public class Employee {

    public int getHoursWorked;
    int employeeId;
    String name;
    String department;
    double payRate;
    double hoursWorked;
    double overtimePayRate;
    double startTime;


    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked , double overtimePayRate, double startTime){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.overtimePayRate = overtimePayRate;
        this.startTime = startTime;


    }

    public void punchIn(double time){
        this.startTime = startTime;
        System.out.println(name + " punched in at " + time);
    }

    public void punchOut(double time){
        double hours = time - startTime;
        this.hoursWorked += hours;
        System.out.println(name + " punched in at  " + time);

    }




//region gets and sets


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getOvertimeHours() {
       return hoursWorked * overtimePayRate
        ;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double regularHours() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getStartTime() {
        return startTime;
    }
//endregion







}
