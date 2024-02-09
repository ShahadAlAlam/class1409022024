package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntersectionOfArrays {

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String[] strArra1 = str1.split(" ");
        String[] strArra2 = str2.split(" ");
        Map<String,Integer> fa = new HashMap<>();

        for(String l:strArra1){
            if(Arrays.asList(strArra2).contains(l)){
                if(fa.containsKey(l)){
                    fa.put(l,fa.get(l)+1);
                } else {
                    fa.put(l,1);
                }
            }
        }
        System.out.println(fa);

    }

}
