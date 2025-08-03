//count frequencies using hashmap
//use min heap to save the k frequent elements
//if heap length < k put element in heap
//else if element frequecy > min element in heap - replace
//return solution

//time complexity : O(nlogk)
//space : O(n)

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue()); //increasing order
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size() > k){
                minHeap.poll();//remove least frequent
            }
        }
        int[]result = new int[k];
        int i = 0;
        while(!minHeap.isEmpty()){
            result[i++] = minHeap.poll().getKey();
        }
        return result;
    }
}