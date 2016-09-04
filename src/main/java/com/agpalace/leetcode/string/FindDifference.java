package com.agpalace.leetcode.string;

/**
 * Created by dengming on 16/9/4.
 * question: https://leetcode.com/problems/find-the-difference/
 */
public class FindDifference {
    public char findTheDifference(String s, String t) {
        int[] count =new int[26];
        for (int i=0; i<s.length(); i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            count[sc-'a']+=1;
            count[tc-'a']-=1;
        }
        count[t.charAt(t.length()-1)-'a']-=1;
        for (int i=0; i<count.length; i++){
            int c=count[i];
            if (c!=0){
                return (char)(i+'a');
            }
        }
        return 0;
    }
}
