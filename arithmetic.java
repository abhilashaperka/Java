public class arithmetic {
    public static void main(String[] args){
        int a=30;
        int b=10;
        System.out.println("a and b values are:"+a+" "+b);
        System.out.println("addition: "+ (a+b));
        System.out.println("subtraction: "+ (a-b));
        System.out.println("multiplication: "+ (a*b));
        System.out.println("divition: "+ (a/b));
        System.out.println("modulus: "+ (a%b));

        //incrementing
        a=a+2;//no need to write a again
        System.out.println(a);
        a-=2;
        System.out.println(a);
        a*=5;
        System.out.println(a);
        a/=7;
        System.out.println(a);
        a++;
        System.out.println(a);



    }
    
}
