class A{
    public void show(){
        System.out.println("in class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("in class B");
    }
}
class C extends A{
    public void show(){
        System.out.println("in class C");
    }
}
public class DynamicMethodDispatch { //A parent class reference can call a child class overridden method, and which method runs is decided at runtime, not compile time
    public static void main(String args[]){
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();

    }
    
}
