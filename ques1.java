/*
Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
*/

public class ques1{
	public static void main(String args []){
	String gender = args[0];
	int age = Integer.parseInt(args[1]);
		if (!gender.equals("Male") && !gender.equals("Female"))
			System.out.println("Invalid gender");

		if (age < 1 || age >= 120)
			System.out.println("Invalid age");

s
		if(gender.equals("Female") && (age>=1 && age<=58)){
			System.out.println("INTREST = 8.2");
		}
		else if(gender.equals("Female") && (age>=59 && age<=100)){
			System.out.println("INTREST = 9.2");
		}
		else if(gender.equals("Male") && (age>=1 && age<=58)){
			System.out.println("INTREST = 8.4");
		}
		else{
			System.out.println("INTREST = 10.5");
		}
}
}
