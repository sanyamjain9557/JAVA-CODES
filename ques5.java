/*
Initialize a character variable with an alphabet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)
i/p:a
o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)
i/p:A
o/p:A->a
*/
 
import java.util.*;
public class ques5{
public static void main(String args [] ){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an alphabet");
	String g = sc.nextLine();
	
	if(g.equals(g.toUpperCase())){
		System.out.println(g.toLowerCase());
	}
	else{
		System.out.println(g.toUpperCase());
	}
}
}