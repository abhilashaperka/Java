enum Status {
    Running, Pending, Failure, Success;
}

public class EnumExmple{
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Success;
        System.out.println(s);//to print the status
        System.out.println(s.ordinal()); // to print the index value of the particular state
        // to print  all the values
        Status[] ss=Status.values();
        for(Status a:ss){
            System.out.println(a+" : "+a.ordinal());
        }
    }
}

