package com.agpalace.leetcode.array;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
 */
public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }

        int i = 0, j = 1;
        int delta = prices[j] - prices[i];
        // 标记是否处于单调增
        boolean increase = delta > 0;

        int profit = 0;

        while (j < prices.length) {
            int newDelta = prices[j] - prices[i];

            // 继续单调递增，寻找最高点卖出
            if (increase && newDelta >= delta) {
                j ++ ;
                delta = newDelta;
                continue;
            }

            // 继续单调递减，寻找最低点买入
            if (!increase && newDelta <= delta) {
                j ++;
                delta = newDelta;
                continue;
            }


            if (increase) {
                // 找到了最高点
                // 卖出
                profit += delta;
            }
            increase = !increase;
            i = j - 1;
            j ++ ;
            delta = newDelta - delta;
        }

        if (increase) {
            profit += delta;
        }

        return profit;
    }
}
