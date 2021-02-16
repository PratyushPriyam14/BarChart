import java.io.*;
import java.util.*;
public class BarChart {
    public static void main(String[] args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        int max=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int floor=max; floor>=1; floor--){
            for(int i=0;i< arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
