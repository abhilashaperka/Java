public class switchupdated {
    public static void main(String[] args){
        String day="Monday";
        //updated version of this switch statement include arrow keys instead of colon and no need of break
        switch(day){
            case "Saturday","sunday"->System.out.println("sleeeep");
            default->System.out.println("wake uppppp!!");
        }
    }
}
