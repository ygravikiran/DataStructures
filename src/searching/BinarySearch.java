package searching;

public class BinarySearch {

	private static int dataSet[] = {1,2,4,8,9,15,17};
	public static void main(String[] args) {
		int key = 9;
		boolean isKeyFound = binarySearch(dataSet, key);
		if(!isKeyFound) {
			System.out.println("Key Not Found in Data Set");
		}
	}
	
	public static boolean binarySearch(int dataSet[], int key) {
		boolean isKeyFound = false;
		
		int left = 0, right = dataSet.length-1, mid = (left+right)/2;
		
		while(left<=right) {
			//{1,2,4,8,9,15,17}; 9
			if(dataSet[mid]==key) {
				isKeyFound = true;
				System.out.println("Key Found @ Location "+ mid);
				return true;
			}else if(dataSet[mid]<key) {
				left = mid+1;		
				mid = (left+right)/2;
			}else {
				right = mid-1;
				mid = (left+right)/2;
			}		
		}
		return isKeyFound;
	}
	
}
