public class jaggedarr {
    public static void main(String args[]){
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[1];
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }
        for( int n[]:arr){
            for(int m:n){
                System.out.print(m +" ");
            }
            System.out.println();
        }
        /* for(int twoD[][] : arr){        // each block
            System.out.println("Block:");
            for(int oneD[] : twoD){     // each row
                for(int value : oneD){  // each value
                    System.out.print(value + " ");
                }
                System.out.println();   // new row
            }
            System.out.println();       // space between blocks
        } */
            
    }
}
