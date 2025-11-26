public class literals {
    public static void main(String[] args){
        int a=0b101; // 0b for binary numbers
        System.out.println(a);
        int b=0x7a; //0x for hexa decimal numbers
        System.out.println(b);
        int c=100_050_00; // java will ignore the underscrores between the numbers
        System.out.println(c);
        double d=12e10;// e -> epsilon
        System.out.println(d);
        char e='e';
        System.out.println(e);
        e++; // it will go to next alphabet
        System.out.println(e);


    }
}
