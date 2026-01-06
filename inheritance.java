class Calculator{ //parent class
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
class AdvCalculator extends Calculator{//accessing the behavior and properties from parent class
    //child class
    public int mul(int a, int b){
        return a*b;

    }
    public int div(int a, int b){
        return a/b;
    }


}
public class inheritance {
    public static void main(String args[]){
        AdvCalculator obj=new AdvCalculator();
        int r1=obj.add(10,5);
        int r2=obj.sub(10,5);
        int r3=obj.mul(10,5);
        int r4=obj.div(10,5);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);



    }
    
}
