@FunctionalInterface
interface A{
    void show();
}
// class B implements A{
//     public void show(){
//         System.out.println("in B show ");
//     }
// }
class FunctionalInterfaceEx{
    public static void main(String args[]){
        A obj=new A(){ 
            //without creating another class to implement interface we can create anonymous class to implement the interface
            public void show(){
                System.out.println("in A show");
            }
        };
        obj.show();
    }
}