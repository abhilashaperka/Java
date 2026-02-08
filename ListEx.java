import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
public class ListEx {
    public static void main(String args[]){
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(5);
        nums.add(8);
        nums.add(9);
        nums.add(2);

        for(int n:nums){
            System.out.println(n);
        }
        System.out.println(nums.size());
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(2));
        System.out.println(nums.contains(5));
        
    }
    
}