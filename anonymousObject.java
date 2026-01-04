class Details{
    Details(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in show method");
    }
}
    public class anonymousObject {
        public static void main(String args[]){
            new Details();//anonumous object it should be used only once
            new Details().show();

        }
        
    
}
