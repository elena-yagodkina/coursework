import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employees = new EmployeeBook(10);
        employees.addEmployee(new Employee("Епифанцев Анатолий Андреевич", 50000, "1"));
        employees.addEmployee (new Employee("Савельева Анна Ивановна", 57000, "2"));
        employees.addEmployee (new Employee("Соколова Мария Александровна", 54200, "3"));
        employees.addEmployee (new Employee("Игнатьев Артем Игоревич", 42000, "4"));
        employees.addEmployee (new Employee("Васильев Роман Сергеевич", 61500, "5"));
        employees.addEmployee (new Employee("Бородулина Инна Алексеевна", 41400, "1"));
        employees.addEmployee (new Employee("Шишкин Евгений Сергеевич", 72300, "2"));
        employees.addEmployee (new Employee("Баринов Олег Иванович", 40000, "3"));
        employees.addEmployee (new Employee("Громова Ольга Демьяновна", 62400, "4"));
        employees.addEmployee (new Employee("Игрунова Ирина Владимировна", 55600, "5"));
        System.out.println();

        employees.printEmployees();
        System.out.println();
        employees.calculateSalary();
        System.out.println();
        employees.findMinSalary();
        System.out.println();
        employees.findMaxSalary();
        System.out.println();
        employees.printFullName();
        System.out.println();
        employees.indexingSalary(10);
        System.out.println();
        employees.findEmployeeWithMinSalaryInDep( "1");
        employees.findEmployeeWithMinSalaryInDep("2");
        employees.findEmployeeWithMinSalaryInDep("3");
        employees.findEmployeeWithMinSalaryInDep("4");
        employees.findEmployeeWithMinSalaryInDep( "5");
        System.out.println();
        employees.findEmployeeWithMaxSalaryInDep("1");
        employees.findEmployeeWithMaxSalaryInDep("2");
        employees.findEmployeeWithMaxSalaryInDep( "3");
        employees.findEmployeeWithMaxSalaryInDep( "4");
        employees.findEmployeeWithMaxSalaryInDep("5");
        System.out.println();
        employees.calculateSumSalaryInDep("1");
        employees.calculateSumSalaryInDep( "2");
        employees.calculateSumSalaryInDep("3");
        employees.calculateSumSalaryInDep("4");
        employees.calculateSumSalaryInDep("5");
        System.out.println();
        employees.calculateAverageSalaryInDep("1");
        employees.calculateAverageSalaryInDep("2");
        employees.calculateAverageSalaryInDep("3");
        employees.calculateAverageSalaryInDep("4");
        employees.calculateAverageSalaryInDep("5");
        System.out.println();
        employees.indexingSalaryInDep(5, "1");
        employees.indexingSalaryInDep( 3, "2");
        employees.indexingSalaryInDep(4, "3");
        employees.indexingSalaryInDep( 6, "4");
        employees.indexingSalaryInDep( 2, "5");
        System.out.println();
        employees.printEmployeesInDep("1");
        employees.printEmployeesInDep("2");
        employees.printEmployeesInDep("3");
        employees.printEmployeesInDep("4");
        employees.printEmployeesInDep( "5");
        System.out.println();
        employees.findEmployeesWithSalaryMore(60000);
        System.out.println();
        employees.findEmployeesWithSalaryLess(50000);
        System.out.println();
        employees.changeSalaryEmployee("Епифанцев Анатолий Андреевич", 53000);
        System.out.println();
        employees.changeDepartmentEmployee("Епифанцев Анатолий Андреевич", "4");
        System.out.println();
        employees.deleteEmployee(2);
        System.out.println();
        employees.listEmployeeWithDepartment("1");
        employees.listEmployeeWithDepartment("2");
        employees.listEmployeeWithDepartment("3");
        employees.listEmployeeWithDepartment("4");
        employees.listEmployeeWithDepartment("5");


    }
}