public class MySearch
    public static void main(String[] args) {
		int[] arr = {10,9,8,7,6,5,4,3,2,1,0};
		int left = 0;
		int right = arr.length - 1;
		int target = 2;
		int searchCount = 0;
		int medianIndex = 0;
		
		
		// Search
		for (int i=0; i<3; i++){
			medianIndex = (right -left / 2 + left;
			if (arr[medianIndex] == target){
				targetIndex = medianIndex;
				break;
			}
			searchCount++;
			
			if (target > arr[medianIndex]) //左手邊
			    right = medianIndex;
			else //右手邊
			    left = medianIndex;
				
				System.out.printlf("%d %d %d\n", right, left, medianIndex);
		}
		
		System.out.println("The position is "+ targetIndex);
		System.out.println("searchCount "+ searchCount);
	}
}
