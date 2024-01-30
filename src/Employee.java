public class Employee {
    private String fullName;
    private double salary;
    private String department;
    private static int counter;
    private int id;

    public Employee() {
        id = ++counter;
    }

    public Employee (String fullName, double salary, String department) {
        this.id = ++counter;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {return this.id + ". " + this.fullName + " / "
            + this.salary + " рублей" + " / " + this.department + " отдел";}
}
