public class MultipleCatchBlocks {
    public static void main(String args[]){
        int i=0;
        int j=15;
        int nums[]=new int[5];
        try{
            j=j/i;     //it will stops at first Exception and it will check for appropriate catch block
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("can't divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("stay in your limit.");
        }
        catch(Exception e){
            System.out.println("something went wrong.");
        }
    }
    
}
