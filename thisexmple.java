class human{
    private int age=11;
    private String name="abhi";
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
        this.name = name;//this used to refer the current obj that is calling the method
    }
    //this keyword is used to eliminate the confusion between local variables and instance variables
}
public class thisexmple{
    public static void main(String args[]){
        human obj=new human();
        obj.setAge(20);
        obj.setName("abhilasha");
        System.out.println(obj.getAge()+" "+obj.getName());

    }
}


