// class A implements Runnable{
//     public void run(){
//         for(int i=0;i<=5;i++){
//             System.out.println("Hi..");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B implements Runnable{
//     public void run(){
//         for(int i=0;i<=5;i++){
//             System.out.println("Helloo..");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
public class RunnableInterface {
    public static void main(String args[]){
        Runnable obj=()->{   //it can be implemented by assigning anonymous inner class using lambda expression to the runnable interface
            for(int i=0;i<=5;i++){
                System.out.println("Hi..");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2=()->{
            for(int i=0;i<=5;i++){
                System.out.println("Helloo..");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();

        // obj.start();
        // try {
        //         Thread.sleep(5);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // obj2.start();
        // try {
        //         Thread.sleep(5);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }

    }
}
