public class Test11 {
	public static void main(String[] args) {
		int length = 5;
		int head = 0;
		for (int i=0; i<9; i++) {
			for(int j=0; j<length; j++) {
				if (j<length-2*head-1)
					System.out.printf(" ");
				else
					System.out.printf("*");
		    }
			System.out.printf("\n");
			
			if(i < 4) {
				length += 1;
				head += 1;
			}
			else {
				length -= 1;
				head -= 1;
			}
		}
	}
}