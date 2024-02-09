package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[2];
        String inp = sc.nextLine();
        String[] nums = inp.split(",");
        int target = sc.nextInt();
        Map<Integer,Integer> res = new HashMap<>();
        for(String s:nums){
            if(res.containsKey( target-Integer.parseInt(s))){
                result[0] = Integer.parseInt(s);
                result[1] =target-Integer.parseInt(s);
                break;
            } else {
                res.put(Integer.parseInt(s),target-Integer.parseInt(s));
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
