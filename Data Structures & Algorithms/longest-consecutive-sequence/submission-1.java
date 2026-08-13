    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int maxCount = 0;

            for(int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }

            for(int i = 0; i < nums.length; i++) {
                if(!set.contains(nums[i]-1)) {
                    int count = 1;
                    int el = nums[i]+1;

                    while(set.contains(el)) {
                        count++;
                        el++;
                    }
                    
                    maxCount = Math.max(count, maxCount);
                }
            }

            return maxCount;
        }
    }
