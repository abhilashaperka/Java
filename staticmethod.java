class mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+" : "+price+" : "+name);
    }
    public static void showw(){
        System.out.println("static method");//statoc method
    }
    public static void showing(mobile obj){ // static method here we are using instance method's vars
        System.out.println(obj.brand+" : "+obj.price+" : "+name);
    }

}
public class staticmethod {
    public static void main(String args[]){
        mobile obj=new mobile();
        obj.brand="redmi";
        obj.price=1500;
        mobile.name="phone";
        
        mobile obj2=new mobile();
        obj2.brand="apple";
        obj2.price=1900;
        mobile.name="phone";
        obj.show();
        obj2.show();
        mobile.showw();// for static methods we don't need to create any objects we can refer through the class name
        mobile.showing(obj);//here we didnt initialized any objects we are refereing from the obj  
    }
    
}
