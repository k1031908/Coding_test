package coding_test;

import java.util.ArrayList;

class Solution3 {
	int solution(int[] num_list) {
		int answer = 0;
		ArrayList tmp_even_list = new ArrayList();
		ArrayList tmp_odd_list = new ArrayList();
		
		int tmp = 0;
		for (int i : num_list) {
			tmp = i%2;
			if (tmp==0) {
				tmp_even_list.add(Integer.toString(i));
			} else {
				tmp_odd_list.add(Integer.toString(i));
			}
		}
		
		String tmp_even = String.join("",tmp_even_list); 
		String tmp_odd = String.join("", tmp_odd_list);
		
		int tmp_even_num = Integer.parseInt(tmp_even);
		int tmp_odd_num = Integer.parseInt(tmp_odd);
		
		answer = tmp_even_num + tmp_odd_num;
		System.out.print(answer);
		return answer;
	}
}

public class TEST_240716_3 {

	public static void main(String[] args) {
		int[] List_tmp = {3,4,5,2,1};
		Solution3 test = new Solution3();
		test.solution(List_tmp);
	}

}
