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
        employees[9] = new Employee("Игрунова Ирина Владимировна", 55600, "5");

        printEmployees(employees);
        System.out.println();
        calculateSalary(employees);
        System.out.println();
        findMinSalary(employees);
        System.out.println();
        findMaxSalary(employees);
        System.out.println();
        printFullName(employees);
        System.out.println();
        indexingSalary(employees, 10);
        System.out.println();
        findEmployeeWithMinSalaryInDep(employees, "1");
        findEmployeeWithMinSalaryInDep(employees, "2");
        findEmployeeWithMinSalaryInDep(employees, "3");
        findEmployeeWithMinSalaryInDep(employees, "4");
        findEmployeeWithMinSalaryInDep(employees, "5");
        System.out.println();
        findEmployeeWithMaxSalaryInDep(employees, "1");
        findEmployeeWithMaxSalaryInDep(employees, "2");
        findEmployeeWithMaxSalaryInDep(employees, "3");
        findEmployeeWithMaxSalaryInDep(employees, "4");
        findEmployeeWithMaxSalaryInDep(employees, "5");
        System.out.println();
        calculateSumSalaryInDep(employees, "1");
        calculateSumSalaryInDep(employees, "2");
        calculateSumSalaryInDep(employees, "3");
        calculateSumSalaryInDep(employees, "4");
        calculateSumSalaryInDep(employees, "5");
        System.out.println();
        calculateAverageSalaryInDep(employees, "1");
        calculateAverageSalaryInDep(employees, "2");
        calculateAverageSalaryInDep(employees, "3");
        calculateAverageSalaryInDep(employees, "4");
        calculateAverageSalaryInDep(employees, "5");
        System.out.println();
        indexingSalaryInDep(employees, 5, "1");
        indexingSalaryInDep(employees, 3, "2");
        indexingSalaryInDep(employees, 4, "3");
        indexingSalaryInDep(employees, 6, "4");
        indexingSalaryInDep(employees, 2, "5");
        System.out.println();
        printEmployeesInDep(employees, "1");
        printEmployeesInDep(employees, "2");
        printEmployeesInDep(employees, "3");
        printEmployeesInDep(employees, "4");
        printEmployeesInDep(employees, "5");
        System.out.println();
        findEmployeesWithSalaryMore(employees, 60000);
        System.out.println();
        findEmployeesWithSalaryLess(employees, 50000);
        System.out.println();


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
        Employee tempEmployee = employees[0];
        for (Employee employee: employees) {
            if (employee.getSalary() < tempEmployee.getSalary()) {
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + tempEmployee);
    }

    public static void findMaxSalary(Employee[] employees) {
        Employee tempEmployee = employees[0];
        for (Employee employee: employees) {
            if (employee.getSalary() > tempEmployee.getSalary()) {
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + tempEmployee);
    }

    public static void printFullName(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public static void indexingSalary(Employee[] employees, int percent) {
        for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            System.out.println(employee.getFullName() + " " + employee.getSalary());
        }
    }

    public static void findEmployeeWithMinSalaryInDep(Employee[] employees, String idDep) {
        Employee tempEmployee = employees[0];
        for (Employee employee : employees) {
            if(employee.getDepartment() == idDep && employee.getSalary() < tempEmployee.getSalary()){
                    tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник отдела " + idDep + " " + tempEmployee + " с минимальной зарплатой");
    }

    public static void findEmployeeWithMaxSalaryInDep(Employee[] employees, String idDep) {
        Employee tempEmployee = employees[0];
        for (Employee employee : employees) {
            if(employee.getDepartment() == idDep && employee.getSalary() > tempEmployee.getSalary()){
                    tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник отдела " + idDep + " "
                + tempEmployee + " с максимальной зарплатой");
    }

    public static void calculateSumSalaryInDep(Employee[] employees, String idDep) {
        double totalSalaryInDep = 0;
        for (Employee employee : employees) {
            if(employee.getDepartment() == idDep) {
                totalSalaryInDep += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц в отделе "
                + idDep + " - "
                + totalSalaryInDep + " рублей");
    }

    public static void calculateAverageSalaryInDep(Employee[] employees, String idDep) {
        double averageSalaryInDep = 0;
        double sum = 0;
        int i = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == idDep) {
                sum = sum + employee.getSalary();
                i++;
            }
        }
        averageSalaryInDep = sum / i;
        System.out.println("Средняя зарплата в отделе " + idDep + " " + averageSalaryInDep);

    }

    public static void indexingSalaryInDep(Employee[] employees, int percent, String idDep) {
        for (Employee employee : employees) {
            if(employee.getDepartment() == idDep) {
                double currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
                System.out.println("Индексация зарплаты сотрудника "
                        + employee.getFullName() + " "
                        + employee.getDepartment() + " отдела на "
                        + percent + " - " + employee.getSalary());
            }
        }
    }

    public static void printEmployeesInDep (Employee[] employees, String idDep) {
        for (Employee employee : employees) {
            if(employee.getDepartment() == idDep) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + " " + employee.getSalary() + " рублей");
            }
        }
    }

    public static void findEmployeesWithSalaryLess(Employee[] employees, double value) {
        for (Employee employee : employees) {
            if (employee.getSalary() < value) {
                System.out.println("Сотрудник с зарплатой меньше " + value + " рублей: " + employee.getId() + ". " + employee.getFullName() + " " + employee.getSalary() + " рублей");
            }
        }
    }

    public static void findEmployeesWithSalaryMore(Employee[] employees, double value) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= value) {
                System.out.println("Сотрудник с зарплатой больше (или равно) " + value + " рублей: " + employee.getId() + ". " + employee.getFullName() + " " + employee.getSalary() + " рублей");
            }
        }
    }
}