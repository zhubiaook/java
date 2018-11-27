import opp.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("zhubiao", 1990,
                6, 20, 1000000);
        emp.name = "zhangya";
        System.out.println(emp.getName());
    }
}
