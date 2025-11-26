public class typecasting {
    public static void main(String[] args){
        // byte to integer (narrowing)->converting higher to lower datatypes(explicit)
        byte b=127;
        int a=329;
        byte c=(byte)a;
        float f=5.6f;
        int e=(int)f;

        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(f);
        System.out.println(e);

        //widening -> converting lower to higher datatypes (implicit)
        //converting byte to int
        int d=b;
        System.out.println(d);

        //type promotion
        byte x=10;
        byte y=30;
        int res=x*y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(res);

    }
}
