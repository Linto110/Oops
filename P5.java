import java.util.Scanner;
import java.util.Arrays;
class Linear
{
    void define(int arr[],int n,int item)
    {
        int i,j,pos=0;
        boolean found=false;
        for(i=0;i<n;i++)
        {
          if(arr[i]==item)
          {
           found=true;
           pos=i+1;
          }
        }
        if(found)
        System.out.println("Found at pos :"+ pos);
        else
        System.out.println("Not found!!!");
    }

    public static void main(String args[])
    {
        int n,item,i;
        Scanner sc=new Scanner(System.in);
        Linear lin= new Linear();
        System.out.print("Enter the number of elements : ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" numbers : ");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched : ");
        item=sc.nextInt();
        lin.define(arr,n,item);
    }
}
