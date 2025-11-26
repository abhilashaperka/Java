public class multidimarray{
    public static void main(String args[]){
        int num[][]=new int[3][4];
        // to assign a value 
        //num[0][0]=5;
        for(int i=0;i<=2;i++){
            for(int j=0;j<=3;j++){
                num[i][j]=(int)(Math.random()*10);//by default math.random will generate double value (to convert it into int we need to do type casting) 
            }// if we want single digit we need to put 10 otherwise put 100
            
        }

       /* for(int i=0;i<=2;i++){
            for(int j=0;j<=3;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        } */
       // printing the values using enhanced for loop 
        for (int n[]:num){
            for(int m:n ){
                System.out.print(m +" ");
            }
            System.out.println();
        }

    }
}