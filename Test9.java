public class Test9 {
	public static void main(String[] args) {
		int row = 0;
		int black = 4;
		int star = 0;
		int col;
		while (row < 9){
			col = 0;
			while (col < black) {
				System.out.print(" ");
				col += 1;
			}
			
			col = 0;
			while (col <= star) {
				System.out.print("*");
				col += 1;
			}
			System.out.print("\n");
			
			if (row < 4) {
			    black -= 1;
			    star += 2;
			}
			else {
				black += 1;
			    star -= 2;
			}
			row +=1;
		}
	}
}