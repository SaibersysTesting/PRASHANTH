import java.util.Scanner;


public class Voting {
	
	public static void main(String args[]){
	int age;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter Age: ");
	  age=sc.nextInt();
	  if (age>18)
	     {
		  System.out.println("Eligible for vote \n");
	     }
	  else
		  System.out.println("Not Eligible for vote \n");
	 
	}
}


