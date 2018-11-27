package opp;
import java.time.LocalDate;

public class Employee {
    // instant field
    public String name;
    public LocalDate birthday;
    public double salary;
    private int age;
    private String h;
    private double so;

    // constant
    public Employee(String n, int year,
            int month, int day, double s) {
        name = n;
        birthday = LocalDate.of(year, month, day);
        salary = s;
    }

    // methods
    public String getName() {
        int salary;
        salary = 2000000;
        System.out.println(salary);
        return name;
    }
}
