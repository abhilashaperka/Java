    class Mobile{
        String brand;
        int price;
        static String name; //static variable
        public void show(){
            System.out.println(brand+" : "+price+" : "+name);
        }
    }
    public class staticvar {
        public static void main(String args[]){
            Mobile obj=new Mobile();
            obj.brand="Apple";
            obj.price=1900;
            Mobile.name="smartphone";//here we are using static variable the value of the name is same and belongs to the class so we are writing Mobile.name

            Mobile obj2=new Mobile();
            obj2.brand="redmi";
            obj2.price=1800;
            Mobile.name="smartphone";

            obj2.name="phone";// if we change the value of the static var it will reflect to the var where it is used 

            obj.show();
            obj2.show();

    }
    
}
