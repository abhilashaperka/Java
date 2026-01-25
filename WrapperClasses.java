public class WrapperClasses {
    public static void main(String args[]){
        int num=5;
        System.out.println(num);
        Integer num1=num;//autoboxing - automatic conversion of primitive types into corresponding wrapper class objects
        System.out.println(num1);
        int num2=num1.intValue();//unboxing - converting the wrapperclass object into primitive data type              
        System.out.println(num2);
    }
    
}
