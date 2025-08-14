class Solution {
    /*
     * Short plan (plain English):
     * 1) Track the smallest price seen so far (minPrice).
     * 2) Iterate once; for each price p:
     *    - minPrice = min(minPrice, p)
     *    - profit = p - minPrice
     *    - best = max(best, profit)
     * 3) Return best (0 if no profitable trade).
     *
     * Time complexity:  O(n)  — one linear scan
     * Space complexity: O(1)  — constant extra space
     * Edge cases: empty/length 1, strictly decreasing, all equal -> 0
     */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int best = 0;
        for (int p : prices) {
            if (p < minPrice) minPrice = p;
            int profit = p - minPrice;
            if (profit > best) best = profit;
        }
        return best;
    }
}
