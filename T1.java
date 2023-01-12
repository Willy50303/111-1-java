public class T1 { //排序
	public static void main(String[] args) {
		int[] arr = { 12, 2, 6, 7, 9, 1 };
		int a = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int g = 0; g < arr.length - 1 - i; g++) {
				if (arr[g] > arr[g + 1]) {
					a = arr[g];
					arr[g] = arr[g + 1];
					arr[g + 1] = a;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
