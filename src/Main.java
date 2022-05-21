import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.next();

        System.out.println("Enter worker data: ");

        System.out.print("Name:");
        String name = sc.next();

        System.out.println("Level: ");
        String workerLevel = sc.next();

        System.out.println("Base salary: ");
        int baseSalary = sc.nextInt();

        Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Enter contract #" + i + "data: ");

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours):");
            int hours= sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);

        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        


    }
}