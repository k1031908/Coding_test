package coding_test;

import java.lang.Math;

class Solution2 {
	int solution (int[] num_list) {
		int answer = 0;
		int tmp = 1;
		int tmp2 = 0;
		
		for (int i:num_list) {
			tmp = tmp * i;
			tmp2 = tmp2 + i;	
		}
		
		double tmp3 = (int) tmp2;
		tmp3 = Math.pow(tmp3, 2);
		
		answer = (tmp<tmp3?0:1);
		System.out.print(answer);
		return answer;
	}
}

public class TEST_240716_2 {
	public static void main(String[] args) {
		Solution2 test = new Solution2();
		int[] tmp_list = {1,2,3,4};
		test.solution(tmp_list);
	}

}
