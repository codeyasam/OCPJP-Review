/* Q1: What is the result of the following code?
*/

class Employee {
    public int employeeId;
    public String firstName, lastName;
    public int yearStarted;
    
    @Override
    public int hashCode() {
        return employeeId;
    }
    
    public boolean equals(Employee e) { // this overloads the equals method instead of overriding
        return this.employeeId == e.employeeId;
    }
    
    public static void main(String[] args) {
        Employee one = new Employee();
        one.employeeId = 101;
        Employee two = new Employee();
        two.employeeId = 101;
        if (one.equals(two)) { // this actually calls the overloaded method of equals
            System.out.println("Success"); // success is printed since employee id is both 101
        } else System.out.println("Failure"); 
    }
}