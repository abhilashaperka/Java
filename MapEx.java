import java.util.Map;
import java.util.HashMap;
public class MapEx {
    public static void main(String args[]){
        Map<String,Integer> students=new HashMap<>();
        students.put("abhilasha",95);
        students.put("abhi",94);
        students.put("sai",98);
        students.put("sudha",92);

        System.out.println(students);
        System.out.println(students.get(98));
        System.out.println(students.replace("sudha",92,93));
        System.out.println(students);
        //in Map the keys can be unique but not values
        System.out.println(students.keySet());
        for(String key:students.keySet()){
            System.out.println(key+" : "+ students.get(key));
        }
    }
    
}
