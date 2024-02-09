package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp = s.nextLine();
        System.out.println(inp.replaceAll("[^a-zA-z|\\s]",""));
        System.out.println(wordFrequency(inp.replaceAll("[^a-zA-z|\\s]","")).toString());
    }

    public static Map<String,Integer> wordFrequency(String args) {
        Map<String,Integer> words = new LinkedHashMap<>();

        String[] wordsOfSentance = args.split(" ");
        Arrays.stream(wordsOfSentance).forEach( s->{
                    int i = (words.containsKey(s.toUpperCase())==true?
                            words.put(s.toUpperCase(),words.get(s.toUpperCase())+1):
                            words.put(s.toUpperCase(),1));
                }
        );
//        for(String s:wordsOfSentance){
//            if (words.containsKey(s.toUpperCase())){
////               Integer l =  words.get(s.toUpperCase());
////               words.put(s.toUpperCase(),l+1);
//                words.put(s.toUpperCase(),words.get(s.toUpperCase())+1);
//            } else {
//                words.put(s.toUpperCase(),1);
//            }
//        }
        return words;
    }
}