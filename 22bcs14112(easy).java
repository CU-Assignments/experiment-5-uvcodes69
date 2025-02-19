import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static Integer parseStringToInteger(String numberStr) {
        return Integer.parseInt(numberStr);
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] numberStrings = {"10", "20", "30", "40", "50"};
        
        List<Integer> numberList = new ArrayList<>();
        
        for (String numberStr : numberStrings) {
            numberList.add(parseStringToInteger(numberStr));
        }

        int sum = calculateSum(numberList);
        
        System.out.println("The sum of the numbers is: " + sum);
    }
}
