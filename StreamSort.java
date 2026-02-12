import java.util.*;

public class StreamSort {
    public static void main(String args[]) {

        List<Integer> nums = Arrays.asList(45, 12, 78, 10, 5, 33);

        nums.stream()
            .sorted()                 // sort in ascending order
            .forEach(System.out::println);
    }
}