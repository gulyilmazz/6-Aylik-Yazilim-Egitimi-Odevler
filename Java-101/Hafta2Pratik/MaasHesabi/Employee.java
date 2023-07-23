import java.time.Year;
import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsWorked = Year.now().getValue() - hireYear;
        if (yearsWorked < 10) {
            return salary * 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double totalSalary = salary + bonus() - tax() + raiseSalary();
        return "Adı: " + name +
                "\nMaaşı: " + salary +
                "\nÇalışma Saati: " + workHours +
                "\nBaşlangıç Yılı: " + hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalary +
                "\nToplam Maaş: " + (totalSalary + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adı: ");
        String name = scanner.nextLine();

        System.out.print("Maaşı: ");
        double salary = scanner.nextDouble();

        System.out.print("Çalışma Saati: ");
        int workHours = scanner.nextInt();

        System.out.print("Başlangıç Yılı: ");
        int hireYear = scanner.nextInt();

        scanner.close();

        Employee employee = new Employee(name, salary, workHours, hireYear);
        System.out.println(employee.toString());
    }
}