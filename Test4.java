import java.util.Scanner;

public class Test4{
    public static void main(String[] args) {
		int num1;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer:");
		num1 = input.nextInt();
		
		if (num1 >= 90) {
			System.out.println("very good");
		}
		else if (num1 >= 60){
			System.out.println("good");
		}
		else {
			System.out.println("bad");
		}
    
    }
}