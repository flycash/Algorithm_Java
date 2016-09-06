package com.agpalace.leetcode.num;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dengming on 16/9/6.
 */
public class LexicographicalNumbers {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result=new ArrayList<Integer>(n);
        for (int i=1; i<=9 && i<=n; i++){
            handle(i, result, n);
        }
        return result;
    }

    private void handle(int i, List<Integer> result, int n) {
        result.add(i);
        int j=i*10;
        while (j<=n && j<=i*10+9){
            handle(j, result, n);
            j++;
        }
    }
}
