/*
Write a program to check if a given integer number is Positive, Negative, or Zero.
*/
import java.util.*;
public class ques4{
public static void main(String args []){
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a integer");
	n = sc.nextInt();
	if( n<0 ){
		System.out.println("NEGATIVE");
	}
	else if( n>0 ){
		System.out.println("POSITIVE");
	}
	else{
		System.out.println("ZERO");
	}
}
}	