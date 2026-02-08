import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.sampled.SourceDataLine;
public class SetEx {
    public static void main(String args[]){
        Set<Integer> nums=new TreeSet<Integer>();// we can use Hashset also but hashset doesnt sort the values by default
        nums.add(53);
        nums.add(95);
        nums.add(32);
        nums.add(54);
        // for(int n:nums){
        //     System.out.println(n);
        // }
        Iterator<Integer> values=nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

    }
}
