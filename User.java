public class User {
	public static void main(String[] args) {
		Car[] myCar = new Car[1000] ();
		// []:代表陣列
		for (int x=0; x<1000; x++) {
			myCar[x] = new Car();
			//new實體化、創造; myCar變成了"物件"
			int z = myCar[x].lanuch(7);
			System.out.println(z);
		}
	}
}