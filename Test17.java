public class Test17 {
	public static void main (String[] args) {
		int[] arr = {7, 3, 4, 9, 6};
		int count = 0;
		int temp;
		for (int x=0; x < arr.length-1; x++) { // x=0~3
			for (int y=0; y < arr.length-1; y++) { // y=0~3
				if (arr[y] > arr[y+1]) {
				temp = arr[y];
				arr[y] = arr[y+1];
				arr[y+1] = temp;
				}
				count++;
			}
		}
		
		
	for (int x=0; x<arr.length; x++){
	     System.out.println(">>" + arr[x]);
	} 
	public static void add(int x){
		System.out.println("===>" + x);
	}
}