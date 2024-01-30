public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(int amount) {
        this.employees = new Employee[amount];
    }

    public void printEmployees () {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void calculateSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary + " рублей");
        System.out.println("Среднее значение зарплат " + totalSalary/ employees.length + " рублей");
    }

    public void findMinSalary() {
        Employee tempEmployee = employees[0];
        for (Employee employee: employees) {
            if (employee.getSalary() < tempEmployee.getSalary()) {
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + tempEmployee);
    }

    public void findMaxSalary() {
        Employee tempEmployee = employees[0];
        for (Employee employee: employees) {
            if (employee.getSalary() > tempEmployee.getSalary()) {
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + tempEmployee);
    }

    public void printFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void indexingSalary(int percent) {
        for (Employee employee : employees) {
            double currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            System.out.println(employee.getFullName() + " " + employee.getSalary());
        }
    }

    public void findEmployeeWithMinSalaryInDep(String idDep) {
        Employee tempEmployee = employees[0];
        for (Employee employee : employees) {
            if(employee.getDepartment() == idDep && employee.getSalary() < tempEmployee.getSalary()){
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник отдела " + idDep + " " + tempEmployee + " с минимальной зарплатой");
    }

    public void findEmployeeWithMaxSalaryInDep(String idDep) {
        Employee tempEmployee = employees[0];
        for (Employee employee : employees) {
            if(employee.getDepartment() == idDep && employee.getSalary() > tempEmployee.getSalary()){
                tempEmployee = employee;
            }
        }
        System.out.println("Сотрудник отдела " + idDep + " "
                + tempEmployee + " с максимальной зарплатой");
    }

    public void calculateSumSalaryInDep(String idDep) {
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

    public void calculateAverageSalaryInDep(String idDep) {
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

    public void indexingSalaryInDep(int percent, String idDep) {
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

    public void printEmployeesInDep (String idDep) {
        for (Employee employee : employees) {
            if(employee.getDepartment() == idDep) {
                System.out.println(employee.getId() + ". " + employee.getFullName() + " " + employee.getSalary() + " рублей");
            }
        }
    }

    public void findEmployeesWithSalaryLess(double value) {
        for (Employee employee : employees) {
            if (employee.getSalary() < value) {
                System.out.println("Сотрудник с зарплатой меньше " + value + " рублей: " + employee.getId() + ". " + employee.getFullName() + " " + employee.getSalary() + " рублей");
            }
        }
    }

    public void findEmployeesWithSalaryMore(double value) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= value) {
                System.out.println("Сотрудник с зарплатой больше (или равно) " + value + " рублей: " + employee.getId() + ". " + employee.getFullName() + " " + employee.getSalary() + " рублей");
            }
        }
    }

    public void eddEmployee(Employee e) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null) {
                employees[i] = e;
                System.out.println("Добавлен новый сотрудник " +  employees[i].getFullName());
                return;
            }
        }
    }

    public void deleteEmployee (int id) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getId() == id) {
                System.out.println("Сотрудник " + employees[i].getFullName() + " удален");
                employees[i] = null;
            }
        }
    }

    public void changeSalaryEmployee(String nameEmployee, double newSalary) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getFullName() == nameEmployee) {
                employees[i].setSalary(newSalary);
            }
        }
        System.out.println("Зарплата сотрудника " + nameEmployee + " изменена на " + newSalary + " рублей");
    }

    public void changeDepartmentEmployee(String nameEmployee, String newDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getFullName() == nameEmployee) {
                employees[i].setDepartment(newDepartment);
            }
        }
        System.out.println("Отдел сотрудника " + nameEmployee + " изменена на " + newDepartment);
    }

    public void listEmployeeWithDepartment(String idDep) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null && employees[i].getDepartment() == idDep) {
                System.out.println(employees[i].getFullName() + ": отдел " + employees[i].getDepartment());
            }
        }
    }
}
