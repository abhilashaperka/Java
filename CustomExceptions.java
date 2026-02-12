class AbhiException extends Exception{
    public AbhiException(String str){
        super(str);

    }
}
public class CustomExceptions {
    public static void main(String args[]){
        int age = 16;

        try {
            if (age < 18) {
                throw new AbhiException("Not eligible to vote");
            }
            System.out.println("Eligible to vote");
        }
        catch (AbhiException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
