import java.util.Collection;
import java.util.ArrayList;
public class ArrayListEx {
    public static void main(String args[]){
        Collection<Integer> nums=new ArrayList<Integer>();
        nums.add(5);
        nums.add(8);
        nums.add(9);
        nums.add(2);

        for(int n:nums){
            System.out.println(n);
        }
        
    }
    
}
