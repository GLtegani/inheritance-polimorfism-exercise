package ex3;

import ex3.entities.LegalPerson;
import ex3.entities.Person;
import ex3.entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int taxPayers = sc.nextInt();
        sc.nextLine();

        List<Person> peopleList = new ArrayList<>();

        for(int i = 0; i < taxPayers; i++) {
            System.out.println("Tax payer #" + (1 + i) + " data:");

            System.out.print("Individual or company (i/c)? ");
            char individualType = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double annualIncome = sc.nextDouble();

            if(individualType == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Person physicalPerson = new PhysicalPerson(name, annualIncome, healthExpenditures);
                peopleList.add(physicalPerson);
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                sc.nextLine();
                Person legalPerson = new LegalPerson(name, annualIncome, numberEmployees);
                peopleList.add(legalPerson);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");

        double sumTaxes = 0;
        for(Person person : peopleList) {
            System.out.println(person);
            sumTaxes += person.taxToPay();
        }

        System.out.println();
        System.out.print("TOTAL TAXES: $" + String.format("%.2f", sumTaxes));



        sc.close();
    }
}
