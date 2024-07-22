package ex1;

import ex1.entities.Employee;
import ex1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        Integer employersQuantity = sc.nextInt();
        sc.nextLine();
        List<Employee> list = new ArrayList<>();

        for(int i = 0; i < employersQuantity; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if(outsourced == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(outsourcedEmployee);
            } else {
                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);
            }

        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for(Employee employee : list) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f",  employee.payment()));
        }

        sc.close();
    }
}