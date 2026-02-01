abstract class Car{ //abstract class
    public abstract void Driving(); //abstract method
    public void PlayMusic(){
        System.out.println("Playing Music....");
        // for the abstract classes we can,t create the objects and call directly and abstract methods have no body, so we need to extend abstract class and in that child class abstract methods should be implemented and complete the method
        
    }
}
class WagonR extends Car{ // concrete class
    public void Driving(){  //abstract methods can be implemented by sub class 
        System.out.println("Driving....");
    } 
}
public class Abstraction {
    public static void main(String args[]){
        Car obj=new WagonR();
        obj.Driving();
        obj.PlayMusic();

    }
    
}
