package com.sniper.leetcodereview.solution.leetcode100.topic_15;

import java.util.*;

/**
 * @Description 三数之和
 * @Author sniper
 * @Date 2024/7/2 11:12 PM
 **/
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < len-2; i++) {
            int left =i+1;
            int right = len-1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while ((left + 1) < right && nums[left] == nums[left+1])
                        left++;
                    while (left < right && nums[right] == nums[right-1])
                        right--;
                    left++;
                    right--;
                }else if (sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return new ArrayList<>(res);
    }
}
