package exception;

public class ArrayExceptionHandLing {

	public static void main(String[] args) {
		int[] arr = new int [5];
		
		try {
			for(int i = 0;i <= 5; i++)
				arr[i] = i;
			System.out.println(arr[i]);
		} catch (Exception e) {
			
		}

	}

}
