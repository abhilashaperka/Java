class A{
    public void show(){
        System.out.println("in A show emthod..");
    }
}
public class AnonymousInnerClass {
    public static void main(String args[]){
        A obj =new A(){    // its a class inside the AnonymousInnerClass  which doesn't have name
            public void show(){
                System.out.println("in new show method..");
            }
        };
        obj.show();
    }
    
}
