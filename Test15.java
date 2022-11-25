public class Test15{
	public static void main (String[] args) {
		for (int i = -4; i <= 4; i++) {
			for (int k = -5; k <= 5; k++) {
				if (Math.abs(k)-(4-Math.abs(i))>0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");	
		}
	}
}