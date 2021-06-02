package insertionsortexample;
import java.util.Scanner;
public class InsertionSortExample 
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        int ar[]= new int [5];
        
        //step 1 input 
        System.out.println("enter the element" );
        for(int i = 0; i<ar.length;i++)
        {
            ar[i]=sc.nextInt();
        }
        //step 2 process 
        for(int r=1; r<5; r++) //pass
        {
            for(int c=0; c<r; c++) //comp 
            {
                if(ar[c]>ar[r]) //swapping 
                {
                    int temp = ar[c];
                    ar[c]=ar[r];
                    ar[r]=temp;
                }
            }
        }
        
        //step 3 output
        System.out.println("--------Insertion sort -------");
        for(int i =0; i<ar.length;i++)
        {
            System.out.println(ar[i]);
        }
    }
    
    public static void main(String[] args) 
    {
        InsertionSortExample obj = new InsertionSortExample();
        obj.func();
       
    }
    
}
