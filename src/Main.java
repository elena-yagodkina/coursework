import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Епифанцев Анатолий Андреевич", 50000, "1");
        employees[1] = new Employee("Савельева Анна Ивановна", 57000, "2");
        employees[2] = new Employee("Соколова Мария Александровна", 54200, "3");
        employees[3] = new Employee("Игнатьев Артем Игоревич", 42000, "4");
        employees[4] = new Employee("Васильев Роман Сергеевич", 61500, "5");
        employees[5] = new Employee("Бородулина Инна Алексеевна", 41400, "1");
        employees[6] = new Employee("Шишкин Евгений Сергеевич", 72300, "2");
        employees[7] = new Employee("Баринов Олег Иванович", 40000, "3");
        employees[8] = new Employee("Громова Ольга Демьяновна", 62400, "4");
        employees[9] = new Employee("Савельева Ирина Владимировна", 55600, "5");

        printEmployees(employees);
        calculateSalary(employees);
        findMinSalary(employees);
        findMaxSalary(employees);
        printFullName(employees);
    }

    public static void printEmployees (Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static void calculateSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary + " рублей");
        System.out.println("Среднее значение зарплат " + totalSalary/ employees.length + " рублей");
    }

    public static void findMinSalary(Employee[] employees) {
        double minSalary = employees[0].getSalary();
        for (Employee employee: employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная зарплата = " + minSalary + " рублей");
    }

    public static void findMaxSalary(Employee[] employees) {
        double maxSalary = employees[0].getSalary();
        for (Employee employee: employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная зарплата = " + maxSalary + " рублей");
    }

    public static void printFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}