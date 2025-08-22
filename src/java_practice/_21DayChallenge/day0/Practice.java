package java_practice._21DayChallenge.day0;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        String str = "aabbbcdddd";
        Map<Character, Long> frqChar = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frqChar);

        Map<Character, Long> dupChar = str.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(f->f.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(dupChar);

        List<String> list = Arrays.asList("Gana", "Mouni","Bujji","Bujji");

        //frq of strings
        Map<String, Long> freStr = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freStr);

        //dup of strings
        Map<String, Long> dupStr = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(f->f.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(dupStr);

        //convert to uppercase of list
        List<String> upp = list.stream().map(String::toUpperCase).toList();
        System.out.println(upp);

        //group items by department
        List<Employee> emp = Arrays.asList(new Employee("gana", "dept", 10000), new Employee("mouni", "dept", 20000), new Employee("bujji", "dept-1", 10000), new Employee("bujjilu", "dept", 40000));
        Map<String, List<Employee>> groupByDepartment = emp.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(groupByDepartment);

        //second-highest salary
        Optional<Employee> secondHighest = emp.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).findFirst();
        System.out.println(secondHighest.isPresent() ? secondHighest.get():"no such element");


    }
}

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

