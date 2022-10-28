public class Test13 {
	public static void main(String[] args) {
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if(5-j>i)
					System.out.printf("*");
				else
					System.out.printf("%d",-(5-j+1-i-2));
			}
			System.out.printf("\n");
		}
	}
	
}