import java.util.Arrays;
import java.util.Map;
import java.util.Scanner; // Import the Scanner class
import java.util.function.Function;
import java.util.stream.Collectors;

class Test {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        y = myObj.nextInt(); // Read user input

        sum = x + y;  // Calculate the sum of x + y
        System.out.println("Sum is: " + sum);
        String str = "mom dad mom dad mom mom dad dd ff";
        String[] StringArr = str.split(" ");
        Map<String, Long> map =
                Arrays.stream(StringArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }
}