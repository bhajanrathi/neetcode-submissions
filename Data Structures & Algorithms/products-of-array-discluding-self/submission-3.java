class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totProd = 1;
        int res[] = new int[nums.length];
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCount++;
                continue;
            }
            totProd *= nums[i];
        }

        if(zeroCount > 1) {
            return new int[nums.length]; 
        }

        for(int i = 0; i < res.length; i++) {
            if(zeroCount == 1) {
                if(nums[i] != 0) {
                    res[i] = 0; 
                    continue;
                } else {
                    res[i] = totProd;
                }
            } else {
                res[i] = totProd / nums[i];
            }
        }

        return res;
    }
}  
