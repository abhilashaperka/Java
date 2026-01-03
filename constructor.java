class human{
    private int age;
    private String name;

    public human(){ //  default constructor
        age=20;
        name="abhilasha";
       
    }
    public human(int age,String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     
    

}
public class constructor {
    public static void main(String args[]){
        human obj=new human();//every time the object is created then the constructor should be called automatically we dont need to call the constructor
        System.out.println(obj.getAge()+" : "+obj.getName());//it will fetch the default values from constructor
        human obj2=new human();
        obj2.setAge(21);
        obj2.setName("abhilasha perka");//here we are setting the values manually
        System.out.println(obj2.getAge()+" : "+obj2.getName()); 
        //for parameterized constructor
        human obj3=new human(22,"Abhi");//passing the values to th parameterized constructor
        System.out.println(obj3.getAge()+" : "+obj3.getName());

    }
    
}
