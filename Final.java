class Calc{
    public void show(){
        System.out.println("in show method");
    }
}
final class AdvCalc{//it can not be inherited
    final int add(int a,int b){ // final method can not be overriden
        return a+b;

    }
}
public class Final {
    public static void main(String args[]){
        final int z=5;// final variable value can not be changed
        System.out.println(z);
        Calc obj=new Calc();
        obj.show();
        AdvCalc obj2=new AdvCalc();
        int res=obj2.add(5,7);
        System.out.println(res);

    }
    
}
