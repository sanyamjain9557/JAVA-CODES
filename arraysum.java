import java.util.*;
public class arraysum{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		int ar[]= new int[10];
		int sum=0;
		System.out.println("Enter your array content");
		for(int i=0;i<10;i++){
			 ar[i]= sc.nextInt();
			 sum=sum+ar[i];
		}
	System.out.println(sum);
			
}}

