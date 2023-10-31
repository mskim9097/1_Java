package edu.kh.algorithm.run;

import edu.kh.algorithm.model.service.AlgorithmService;

public class AlgorithmRun {

	public static void main(String[] args) {

		int[] nums = new int[3];
		nums[0] = 2;
		nums[1] = 4;
		nums[2] = 6;
		
		int n = nums.length;

        if (n >= 1 && n <= 1000) {

            int[] ans = new int[2 * n];

            for(int i = 0; i < ans.length; i++) {
               // if(nums[i] >= 1 && nums[i] <= 1000) {
                    if(i < n) {
                        ans[i] = nums[i];
                    } else {
                        ans[i] = nums[i - n];
                    }
                //}
                
            }
            System.out.println(ans[4]);
        }
        
		AlgorithmService service = new AlgorithmService();
		
		
		
	}

}
