class mobile{
    String brand;
    int price;
    static String name;
    static{ //whenever the object is instantiated at that time class loader will load the class at that time static block will also load so static block will execute first
        name="phone";
        System.out.println("in static block");
    }
    public mobile(){
        brand ="";
        price=200;
        System.out.println("in constructor");
        System.out.println(brand+ " : "+price+" : "+mobile.name);
    }
}
public class staticblock {
    public static void main(String args[]) throws Exception{
        Class.forName("mobile");
        mobile obj=new mobile();
        obj.brand="apple";
        obj.price=1500;
        mobile.name="smartphone";
        mobile obj2=new mobile();//every time we calling the constructor it will starts from scratch it does remember previous obj's values
    }
    
}
