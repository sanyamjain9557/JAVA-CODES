import java.util.Scanner;
public class BinarySearchExample 
{
    void func()
    {
       Scanner sc=new Scanner(System.in);
       int ar[]=new int[10];
        System.out.println("enter elements in array");
        for(int i=0;i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("enter searching element");
        int sea=sc.nextInt();
        
        int lb=0;
        int up=ar.length-1;
        int mid;
        int count=0;
        
        while(lb<=up)
        {
            mid=(lb+up)/2;
            if(sea==ar[mid])
                {
                    count++;
                    break;
                }
            else if(sea<ar[mid])
                {
                    up=mid-1;
                }
            else if(sea>ar[mid])
                {
                lb=mid+1;
                }
        }
        if(count>0)
            {
                System.out.println("found....");
            }
        else
            {
                System.out.println("not found...");
            }
              
    }
    public static void main(String args[])
    {
    BinarySearchExample obj=new BinarySearchExample();
    obj.func();
    
    }
}
