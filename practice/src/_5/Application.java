package _5;

public class Application {

	public static void main(String[] args) {
		/*
		 * 문제
		 * 대문자는 소문자로, 소문자는 대문자로 변환하라
		 * helloWorlD
		 * 정답 : HELLOwORLd
		 * 
		 * Tag
		 * >> 배열 for if
		 * 
		 * 유니코드, 아스키코드 보는 사이트 : https://devlog-wjdrbs96.tistory.com/76 , https://memostack.tistory.com/205
		 */
		
		String word = "helloWorlD";
		
		char[] arr;
		
		arr = word.toCharArray(); // 답안 참조했음.... toCharArray() 참조 
		
		// toCharArray()란
		// String(문자열)을 char형 배열로 바꾼다.
		// String s1 = "Hello World";
		// char[] charArr = s1.toCharArray();
		
		System.out.println(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + ('A' - 'a')); // 알파벳 소문자일 경우 대문자 A와 소문자 a의 차이만큼 arr[i]에 있는 소문자값에 더해줌으로 대문자로 변환 가능
			} else if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] - ('A' - 'a')); // 위와 동일한 원리 
			}
		}
		
		System.out.println(arr);
		
		
		

	}

}
