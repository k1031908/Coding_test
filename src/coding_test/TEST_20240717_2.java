package coding_test;

import java.util.Arrays;

class Solution5{
	int solution(int n, String control) {
		
		char[] array_str = control.toCharArray();
		

		for (char i:array_str) {
			int tmp = 0;

			switch (i) {
				case 'w': tmp = +1;
					break;
				case 's': tmp = -1;
					break;
				case 'd': tmp = +10;
					break;
				case 'a': tmp = -10;
					break;
			}
			
		n = n+tmp;
		}
		
		int answer = n;
		System.out.print(answer);
		return answer;
		
	}
}

public class TEST_20240717_2 {

	public static void main(String[] args) {

		Solution5 TEST = new Solution5();
		TEST.solution(0,"wsdawsdassw");
		
	}

}
