public class switchnewver {
    public static void main(String[] args){
        String day="Monday";
        //updated version of this switch statement include arrow keys instead of colon and no need of break
        String res="";
            // example 1
            // if we dont want to use arrow key we can use colon and yield keyword
            //exmaple
            //case "saturday","sunday" : Yield "6AM";
        switch(day){
            case "Saturday","sunday"->res="8AM";
            case "Monday"->res="6AM";
            default->res="7AM";
        }
        System.out.println(res);
        String dayy="sunday";
        String r="";
        // example 2
        r= switch(dayy){
            case "Saturday","sunday": yield "8AM";
            case "Monday": yield "6AM";
            default: yield "7AM";
        };
        System.out.println(r);
    }
    
}
