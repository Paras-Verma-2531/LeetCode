package HASHMAP;
public class MaxProductSubArray {
    /*
    https://leetcode.com/problems/maximum-product-subarray/
     */
    //brute force :: O(n^2)
    public int maxProduct(int[] nums,int x) {
        int n = nums.length;
        int maxPro = -11;
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                maxPro = Math.max(maxPro, product);
            }
        }
        return maxPro;
    }
        //optimal Approach:
        public int maxProduct(int[] nums) {
            int n=nums.length;
            int maxPro=-11;
            int suffix=1,prefix=1;
            //Arrays.sort(nums);
            for(int i=0;i<n;i++)
            {
                if(prefix==0)prefix=1;
                if(suffix==0)suffix=1;
                prefix*=nums[i];
                suffix*=nums[n-1-i];
                maxPro=Math.max(maxPro,Math.max(prefix,suffix));
            }return maxPro;
        }
    }
}
