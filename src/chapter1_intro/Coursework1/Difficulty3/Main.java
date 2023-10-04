package chapter1_intro.Coursework1.Difficulty3;

import chapter1_intro.Coursework1.Difficulty2.EmployeeService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook staffbook = new EmployeeBook(10);
        staffbook.addNewEmployee("FIO", 1, 10_000_00);
        staffbook.addNewEmployee("FIO", 2, 10_000_00);
        staffbook.addNewEmployee("FIO", 5, 10_000_00);
        staffbook.addNewEmployee("FIO", 5, 10_000_00);
        staffbook.addNewEmployee("FIO", 3, 10_000_00);
        staffbook.addNewEmployee("FIO", 4, 10_000_00);
        staffbook.addNewEmployee("FIO", 5, 10_000_00);
        staffbook.addNewEmployee("FIO", 1, 10_000_00);
        staffbook.addNewEmployee("FIO", 2, 10_000_00);

        staffbook.deletingEmployee(1);
        System.out.println("_________________________________________");
        System.out.println(staffbook);
        System.out.println("_________________________________________");
        System.out.println(Arrays.toString(staffbook.minimumWageDepartament(2)));
        System.out.println("_________________________________________");
        System.out.println(Arrays.toString(staffbook.maxWageDepartament(3)));
        System.out.println("_________________________________________");
        System.out.println(staffbook.payrollСostsDepartament(5));
        System.out.println("_________________________________________");
        System.out.println("staffbook.averageSalaryDepartament(2) = " + staffbook.averageSalaryDepartament(2) / 100);
        System.out.println("_________________________________________");
        staffbook.salaryIndexationDepartament(10, 5);
        System.out.println(staffbook);
        System.out.println("_________________________________________");
        staffbook.printDepartmentEmployees(1);
        System.out.println("_________________________________________");
        staffbook.deletingEmployeeFIO("FIO", 5);
        System.out.println(staffbook);
        System.out.println("_________________________________________");
        staffbook.employeeСhange(2, 20_000_00, 1);
        System.out.println(staffbook);
        System.out.println("_________________________________________");
        staffbook.printListEmployeesDepartment();
    }
}
