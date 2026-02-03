public class ExceptionHandling {
    public static void main(String args[]){
        int a=10;
        int b=1;
        try{
            b=a/0;
        }
        catch(Exception e){
            System.out.println("something went wrong..");
        }
        System.out.println(b);
    }
    
}
