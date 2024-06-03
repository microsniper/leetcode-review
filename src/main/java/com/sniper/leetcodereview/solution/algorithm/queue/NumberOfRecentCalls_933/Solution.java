package com.sniper.leetcodereview.solution.algorithm.queue.NumberOfRecentCalls_933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description
 * @Author sniper
 * @Date 2024/5/30 11:33 PM
 **/
public class Solution {
    public static class RecentCounter {

        Queue<Integer> queue ;
        public RecentCounter() {
            queue = new LinkedList<Integer>();
        }

        public int ping(int t) {
            queue.add(t);
            while(queue.peek() < t - 3000){
                queue.poll();
            }
            return queue.size();
        }
    }
}
