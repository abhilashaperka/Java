public class stringbuilder {//string builder is also mutable string type and it is same as string buffer but it is not thread safe
    public static void main(String args[]){
        //in string builder and string buffer methods and functions are almost same but the only difference is thread safety
        StringBuilder b=new StringBuilder();
        b.append("abhi");
        System.out.println(b);
        b.insert(4,"lasha");
        System.out.println(b);
    }
    
}
