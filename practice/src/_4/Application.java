package _4;

public class Application {

	public static void main(String[] args) {
		/*
		 * 10진수를 2진수로 변환하시오
		 * 19
		 * => 10011
		 */
		int inputNum = 19;
		int[] arr = new int[100];
		
		int i = 0;
		int fin = inputNum;
		
		while (fin > 0) {
			arr[i] = fin % 2;
			fin /= 2;
			i++;
		}
		
		i--;
		
		for (; i >= 0; i--) {
			System.out.println(arr[i]);
		}

	}

}
