public class stringbuffer {//string buffer is mutable string type and its thread safe
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer();//string buffer is like a string but this is mutable we can change the actual value of the variable
        StringBuffer a=new StringBuffer("abhilasha");
        sb.append("perka");
        System.out.println(sb);
        a.append(" perkaa");
        System.out.println(a);
        a.deleteCharAt(15);//deletes character at specific index
        System.out.println(a);
        System.out.println(sb.capacity());//it will print the capacity of the string buffer. by default value is 16. here it will add the characters in that string and 16 and it will print the value
        System.out.println(a.substring(0,4));//prints the substring from specified index
        a.insert(15,'a');//inserting a character at a particular index
        System.out.println(a);
        a.ensureCapacity(100);
        System.out.println(a.capacity());//setting the minimum capacity
       
    }
    
}
