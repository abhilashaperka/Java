class A{
    public void show(){
        System.out.println("in show method...");

    }
    class B{
        public void config(){
            System.out.println("in cofig method...");
        }
    }
    static class C{
        public void display(){
            System.out.println("displaying...");
        }
    }
}
public class InnerClass {
    public static void main(String args[]){
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
        obj1.config();

        A.C obj2=new A.C();//for static classes
        obj2.display();

    }
    
}
