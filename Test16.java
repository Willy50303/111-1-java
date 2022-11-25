import java.util.Scanner;

public class Test16{
	public static void main (String[] args) {
		int km;
		
		    Scanner input = new Scanner (System.in);
		        System.out.println("Enter your km:");
				
				km = input.nextInt();
				if(km<7)
					System.out.println("$85");
				else
					System.out.printf("$%d",(km-7)*5+85);
				
	}
}
				