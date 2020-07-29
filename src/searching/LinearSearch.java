package searching;

public class LinearSearch {

	static int dataSet[] = {1,3,9,2,4};
	public static void main(String[] args) {
		
		boolean isElementFound = linearSearch(dataSet, 9);
		if(!isElementFound) {
			System.out.println("Element Not Found");
		}	
		
	}
	
	public static boolean linearSearch(int[] data, int key) {
		boolean isElementFound = false;
		for(int i=0; i<data.length; i++) {
			if(data[i]==key) {
				System.out.println("Element Found @ location : "+ i);
				isElementFound = true;
			}				
		}
		return isElementFound;
	}

}
