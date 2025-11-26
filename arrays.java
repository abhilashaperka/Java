public class arrays {
    public static void main(String args[]){
        int nums[]={2,3,4,5};
        System.out.println(nums[1]);// to print a value
        nums[2]=7;//to change the current value
        System.out.println(nums[2]);
        int nums1[]=new int[5];//dynamic array
        nums1[0]=5;
        nums1[1]=6;
        nums1[2]=7;
        nums1[3]=8;
        nums1[4]=9;

        System.out.println(nums1[1]);
        //printing all the values using for loop
        for(int i=0;i<=4;i++){
            System.out.println(nums1[i]);
        }
    }
    
}
