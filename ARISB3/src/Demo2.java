import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the age: ");
		/* String age = myObj.nextLine();
		int n = Integer.parseInt(age);
				if( n>=18 )
		{
			System.out.println("The age is greater than 18");
		}else
		{
			System.out.println("The age is Lesser than 18");
		}
		System.out.println("The age: "+n);
*/
		
		int age = myObj.nextInt();
		if( age>=18 )
		{
			System.out.println("The age is greater than 18");
		}else
		{
			System.out.println("The age is Lesser than 18");
		}
		System.out.println("The age: "+age);
				
	}

}
