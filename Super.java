class Parent{
    public Parent(){
        super();
        System.out.println("it's a default parent class constructor");
    }
    public Parent(int a){
        super();
        System.out.println("it's a parent class parameterized constructor");
    }

}
class Child extends Parent{
    public Child(){
        super();
        System.out.println("it's a default child class constructor");
    }
    public Child(int a){
        super(a);//if we pass a parameter in super methos thn only it will call the parameterized constructor of the parent class otherwise it will call default constructor
        System.out.println("it's a child class parameterized constructor");
    }

    
}
public class Super {
    public static void main(String args[]){
        Child obj=new Child(5);

    }
    
}
