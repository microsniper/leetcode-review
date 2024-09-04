package com.sniper.leetcodereview.solution.leetcode.topic_17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 电话号码字母组合
 * @Author sniper
 * @Date 2024/7/3 11:31 AM
 **/
public class Solution {

    public static List<String> letterCombinations(String digits) {
        int len = digits.length();
        if (len == 0){
            return new ArrayList<>();
        }

        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> res = new ArrayList<>();

        backLetterCombinations(digits,0,res,"",map);

        return res;
    }

    private static void backLetterCombinations(String digits, int index, List<String> res,String current,Map<Character,String> map) {
        if (index == digits.length()){
            res.add(current);
            return;
        }
        char ch = digits.charAt(index);
        String s = map.get(ch);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            backLetterCombinations(digits,index+1,res,current+c,map);
        }
    }
}
