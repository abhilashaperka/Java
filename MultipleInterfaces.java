interface A{
    public void show();
}
interface B{
    public void config();
}
interface C extends B{
    public void display();
}
class Z implements A,C{
    public void show(){
        System.out.println("showing...");
    }
    public void config(){
        System.out.println("config...");
    }
    public void display(){
        System.out.println("displaying...");
    }
}
public class MultipleInterfaces {
    public static void main(String args[]){
        Z obj=new Z();
        obj.show();
        obj.config();
        obj.display();

    }
    
}
