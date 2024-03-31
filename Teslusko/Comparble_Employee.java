import java.util.*;

import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee emp) {
        return this.id - emp.getId();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class Comparble_Employee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John"));
        employees.add(new Employee(103, "Alice"));
        employees.add(new Employee(102, "Bob"));

        Collections.sort(employees);

        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
