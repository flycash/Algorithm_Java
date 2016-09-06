package com.agpalace.leetcode.string;

/**
 * Created by dengming on 16/9/6.
 *
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        int[] chars=new int[26];
        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            chars[c-'a']++;
        }
        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if (chars[c-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
