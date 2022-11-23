package _3;

import java.util.Iterator;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		/*
		 * 가장 많이 출현한 수를 구하시오
		 * 1 2 2 3 1 4 2 2 4 3 5 3 2
		 * 정답 : 2
		 * 배열, for
		 */
		
		int[] arr = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			arr[i] =  scanner.nextInt();
		}
		int[] arrchk = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arrchk[arr[i]]++;
		}
		
		int arrNum = 0;
		int arrCnt = 0;
		for (int i = 0; i < 10; i++) {
			if (arrCnt < arrchk[i]) {
				arrCnt = arrchk[i]++;
				arrNum = i;
			}
		}
		
		System.out.println(arrCnt +", " + arrNum);
		
		scanner.close();
	}

}
