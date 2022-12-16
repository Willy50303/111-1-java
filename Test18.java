public class Test18 {
	public static void main(String[] args) {
		int [] myArr = {7, 5, 4, 8, 1, 2};
		int [] myArr1 = new int[myArr.length];
		
		for (int i=0; i<myArr.length; i++) {
			myArr1[i] = myArr[myArr.length-1-i];
			System.out.println(myArr1[i]);
		}
		//for (int i=0; i<myArr.length; i++) {
			//System.out.println(myArr[i]);
		//}
	}
}