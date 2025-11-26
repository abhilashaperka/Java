class demo {
    public int add(int a, int b) {   // parameters
        return a + b;
    }
}

public class classexmpl {
    public static void main(String[] args) {
        

        demo cl = new demo();
        int res = cl.add(10,5);  // passing values to method
        System.out.println(res);
     
    }
}
