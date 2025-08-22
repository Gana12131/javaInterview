import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "mom dad mom dad mom dd";
        System.out.println(str.chars());

        String[] ch=str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<ch.length; i++){
            int count =0;
            for(int j=0; j<ch.length; j++){
                if(ch[i].equals(ch[j])){
                    count++;
                }
                map.put(ch[i], count);
            }


        }

        Arrays.stream(ch);
        System.out.println(map);
        String s="null";
        ArrayList<String> list = new ArrayList<>();
        list.stream().sorted().collect(Collectors.toList());
        Map<Character, Long> mp = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mp);

        Function<String, Integer> func = f->f.length();
        System.out.println(func.apply("Bujji"));
    }
}


class Ex extends Throwable {

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

