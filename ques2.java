/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers
*/

public class ques2{
	public static void main(String args []){
	int sum;
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	sum= a+b;
	System.out.println(sum);
}
}