package coding_test;

import java.lang.Math;

class Solution {
	int solution(int a, int b, int c) {
		double answer_tmp = 0;
		double tmp_a = Double.valueOf(a);
		double tmp_b = Double.valueOf(b);
		double tmp_c = Double.valueOf(c);
		
		Double[] tmp_list = {tmp_a, tmp_b, tmp_c};
		
		double tmp1 = 0;
		double tmp2 = 0;
		double tmp3 = 0;
		
		if ((a==b)&&(b==c)&&(a==c)) {
			for (double i:tmp_list) {
				tmp1 = tmp1 + i;
				tmp2 = tmp2 + Math.pow(i, 2);
				tmp3 = tmp3 + Math.pow(i, 3);
				answer_tmp = tmp1*tmp2*tmp3;
			} 
			
		} else if ((a!=b)&&(b!=c)&&(a!=c)) {
			for (double i:tmp_list) {
				tmp1 = tmp1 + i;
				answer_tmp = tmp1;
			} 
			
		} else {
			for (double i:tmp_list) {
				tmp1 = tmp1 + i;
				tmp2 = tmp2 + Math.pow(i, 2);
				answer_tmp = tmp1*tmp2;
			}
		}
		
		int answer = (int) answer_tmp;
		System.out.print(answer);
		return answer;
	}
}

public class TEST_240716 {

	public static void main(String[] args) {
		Solution test = new Solution();
		test.solution(3,3,3);
		
	}
}
