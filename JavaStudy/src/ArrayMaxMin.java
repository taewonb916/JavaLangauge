public class ArrayMaxMin {	
	public static int minValue(int[] arr) {
		int min = arr[0];		
		for(int e = 0; e < arr.length; e++) {
			if(arr[e] < min) 
				min = arr[e];
		}
		return min;
	}		
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int e: arr) {
			if(e > max) 
				max = e;
		}	
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[] {3, 4, 7, 14, 57, 2, 60};
				
		System.out.println("ÃÖ¼Ú°ª: " + maxValue(ar));
		System.out.println("ÃÖ´ñ°ª: " + minValue(ar));
		}
	}