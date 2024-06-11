package com.sniper.leetcodereview.solution.algorithm.twopointers.topic_881;

import java.util.Arrays;

/**
 * @Description
 * @Author sniper
 * @Date 2024/6/3 6:31 PM
 **/
public class Solution {

    // 对撞指针
    public static int numRescueBoats(int[] people, int limit) {
        int len = people.length;
        if (len == 0){
            return 0;
        }


        Arrays.sort(people);

        int temp = limit;
        int left = 0;
        int right = len-1;
        int count = 0;
        while (left <= right){
            if (people[left] + people[right] == limit){
                count++;
                left++;
                right--;
            }else if (people[left] + people[right] > limit){
                count++;
                right--;
            }else{
                count++;
                left++;
                right--;
            }

        }
        return count;
    }
}
