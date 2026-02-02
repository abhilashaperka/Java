interface A{
    int age=21; //by default this variable is public,static,final
    public void show();
    public void config();

}
class B implements A{
    public void show(){
        System.out.println("showing...");
    }

    public void config(){
        System.out.println("config...");
    }
}
public class Interface {
    public static void main(String args[]){
        B obj=new B();
        obj.show();
        obj.config();
    }
    
}
