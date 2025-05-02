package com.ragnar.DynamicProgramming;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        
        int[] DP = new int[nums.length];
        int max = 1;

        for(int i = 0; i < nums.length; i++){
            DP[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j] && DP[i] < DP[j] + 1){
                    DP[i] = DP[j] + 1;
                }
            }
            if(DP[i] > max){
                max = DP[i];
            }
        }

        return max;
    }
}