from typing import List

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # Single-pass: track the minimum price so far and the best profit so far.
        min_price = float('inf')
        best = 0

        for p in prices:
            if p < min_price:
                min_price = p            # new cheapest day to buy
            else:
                best = max(best, p - min_price)  # profit if selling today

        return best  # 0 if prices never rise

# Time: O(n)
# Space: O(1)
