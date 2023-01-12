public class T2 { //平均 最大 最小
	public static void main(String[] args) {
		int[] arr = { 7, 6, 4, 9, 1, 2 };
		
		int max = 0;
		int min = 10;
		float sum = 0;
		
		for (int i = 0; i< arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
			sum += arr[i];
		}
		sum = sum / arr.length;
		System.out.println("平均值為:" + sum);
		System.out.println("最大值為:" + max);
		System.out.println("最小值為:" + min);
	}
}