enum Status {
    Running, Pending, Failure, Success;
}
public class SwitchUsingEnum {
    public static void main(String[] args) {
        
        Status s = Status.Success;

        switch(s){
            case Running:
                System.out.println("All good");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Failure:
                System.out.println("Try again");
                break;
            default:
                System.out.println("Done");
                break;

        }
    }
}
