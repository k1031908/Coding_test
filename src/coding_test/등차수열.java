package coding_test;

import java.util.ArrayList;

public class 등차수열 {

	public static void main(String[] args) {	
		boolean[] tmp = {true, true, false, true, false};
		int tmp2 = Solution(1, 3, tmp);
	}
	

	static int Solution(int a, int d, boolean[] included){
		
		int tmp = included.length;
		ArrayList<Integer> tmp_list = new ArrayList();
		
		for (int j=0; j<tmp ;j=j+1) {
			int tmp_num = a + j*d;
			tmp_list.add(tmp_num);
		}
		System.out.print(tmp_list);
		
		System.out.print('\n');
		int j=0;
		for (boolean i:included) {
			System.out.print(i);
			if (i==false) {
				tmp_list.set(j, 0);
			}
			j = j+1;
		}
		
		System.out.print('\n');
		System.out.print(tmp_list);
		
		int answer = 0;
		for (int n:tmp_list) {
			answer = answer + n;
		}
		System.out.print('\n');
		System.out.print(answer);
		return answer;
	}
}

