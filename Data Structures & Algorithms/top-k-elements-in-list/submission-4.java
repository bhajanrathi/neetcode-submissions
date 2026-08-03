class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length; 
        
        //map to store count
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < n; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        //freq array to store elements with that particular frequency
        List<Integer>[] freq = new ArrayList[n+1];

        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        //put count map into freq array such that key of count becomes value for freq array and value becomes key of count
        for(Map.Entry<Integer, Integer> entry: count.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            freq[val].add(key);
        }

        //res array to store the top k frequent elements
        int res[] = new int[k];
        int index = 0;

        for(int i = freq.length-1; i>0 && index < k; i--) {
            for(int j: freq[i]) {
                res[index++] = j;
                if(index==k) {
                    return res;
                }
            }
        }

        return res;
    }
}
