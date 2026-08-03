class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create count map
        Map<Integer, Integer> count = new HashMap<>();

        // make freq array with list as element
        List<Integer>[] freq = new List[nums.length+1];

        //assign list to each freq array index
        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        //count freq of each num and map it with the number in the count map
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        //store the map in freq array such that key becomes value and value becomes key
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        //we create a res array with k size -> k is the input
        int[] res = new int[k];
        int index = 0; //this will help in index movement of res

        //travel from last freq length to the first freq index
        for(int i = freq.length-1; i > 0 && index < k; i--) {
            //if there are multiple elements for each frequency, we store those as well in the result array
            for(int n : freq[i]) {
                res[index++] = n; 
                if(index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
