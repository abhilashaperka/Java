class Parent{//if we dont mention any class java will extends Object class
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
        super();//super(5);
        System.out.println("it's a default child class constructor");
    }
    public Child(int a){
        
        //super(a);//if we pass a parameter in super method then only it will call the parameterized constructor of the parent class otherwise it will call default constructor
        this();//This can be used to call the parameterized constructor of the same class
        System.out.println("it's a child class parameterized constructor");
    }

    
}
public class Super {
    public static void main(String args[]){
        Child obj=new Child(5);//Child obj=new Child();

    }
    
}
