package coding_test;

import java.util.Arrays;

class Solution4 {
	int[] solution(int[] num_list) {
		
		int n = num_list.length;
		int max_num = num_list[n-1];
		int max_num_1 = num_list[n-2];
		
		int tmp = 0;
		tmp = (max_num_1<max_num?max_num-max_num_1:max_num*2);
		
		int answer = tmp;
		
		int[] new_num_list = Arrays.copyOf(num_list, n+1);
		new_num_list[n]=tmp;
		
		for (int i : new_num_list) {
			System.out.print(i);
		}

		return new_num_list;
	}
}

public class TEST_20240717_1 {

	public static void main(String[] args) {
		Solution4 TEST = new Solution4();
		int tmp_list[] = {1,2,3,300,100};
		int[] answer = TEST.solution(tmp_list);
		}
		// TODO Auto-generated method stub

	}

