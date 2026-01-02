class human{
    private int age=11;
    private String name="abhi";
    public int getAge() { //getters
        return age;
    }
    // public void setAge(int age) { //setters
    //     this.age = age;
    // }
    public String getName() {
        return name;
    }
    // public void setName(String name) {
    //     this.name = name;
    // }

    
      //private members are accessible only inside the class so here we are fetching the value of age and name
    
}
public class encapsulation{
    public static void main(String args[]){
        human obj=new human();
        //obj.setAge(20);
        //obj.setName("abhilasha");
        System.out.println(obj.getAge()+" "+obj.getName());

    }
}