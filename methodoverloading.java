class calcltr{
    public int add(int a, int b){  // method overloading-> same method name , same class name but different in parameter type or no of parameters
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
     public double add(double x, double y){
        return x+y;
    }

}
public class methodoverloading {
    public static void main(String[] args){
        calcltr obj=new calcltr();
        int r1=obj.add(3,5);
        System.out.println(r1);
        int r2=obj.add(5,6,7);
        System.out.println(r2);
        double r3=obj.add(4.5,3.2);
        System.out.println(r3);

        
    }
    
}
