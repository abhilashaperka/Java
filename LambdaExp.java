import javax.sound.sampled.SourceDataLine;

@FunctionalInterface
interface A{
    void show();
}
@FunctionalInterface
interface B{
    int sum(int a,int b);
}
public class LambdaExp {
    public static void main(String args[]){
        A obj=()->System.out.println("in A show");
        obj.show();
        B obj1=(a,b)->a+b;
        //Lambda Expression only works with functional interface
        System.out.println(obj1.sum(5,6));


    }
    
}
