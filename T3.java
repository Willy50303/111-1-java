import java.security.SecureRandom;

public class T3 {
	public static void main (String[] args) {
		SecureRandom randomNumber = new SecureRandom();
		
		for (int i = 0; i < 1; i++) {
			int face = 1 + randomNumber.nextInt(bound:100);
			System.out.println(face);
		}
	}
}