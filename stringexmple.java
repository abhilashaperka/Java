public class stringexmple {
    public static void main(String args[]){
    //string is immutable- we cant change or modify the actual value of the string variable
    String name="abhilasha";
    name="Perka "+name; //here the name variable is not changing its value directly but it will create another object in heap memory and redirect its memory address to the variable 'name'
    String s1="abhi";
    String s2="abhi";//here for s1 and s2 it wont create another object it will point to the same memory address for that value where it is stored in heap memory
    System.out.println(name);
    System.out.println(s1==s2);
    }
}
