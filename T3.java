import java.security.SecureRandom;

public class T3 {
	public static void main (String[] args) {
		System.out.println(a(x:100));
	}

	public static int a (int x) {
		SecureRandom number = new SecureRandom();
		int b = number.nextInt(x + 1);
		return b;
	}
}