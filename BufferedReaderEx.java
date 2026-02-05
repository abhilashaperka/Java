import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public static void main(String args[]) throws IOException{
        System.out.println("enter a num : ");
        // int num=System.in.read(); //it will only read single integer and returns the ASCII value of the number
        // System.out.println("ASCII value of num :"+ num);
        // System.out.println("Actual value is : " +(num-48));

        // using BufferedReader 
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(in);
        int n=Integer.parseInt(bf.readLine());
        System.out.println(n);

    }
}
