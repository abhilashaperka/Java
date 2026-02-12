import java.util.*;

public class ComparatorEx {
    public static void main(String args[]) {

        Comparator<String> com = new Comparator<String>() {
            public int compare(String i, String j) {   // must return int
                if (i.length() > j.length())
                    return 1;
                else if (i.length() < j.length())
                    return -1;
                else
                    return 0;
            }
        };

        List<String> nums = new ArrayList<>();
        nums.add("abhilasha");
        nums.add("sai");
        nums.add("siddu");
        nums.add("abhi");

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}