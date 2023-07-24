/* 496. Next Greater Element I */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] lg = new int[n];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i=n-1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek() <= nums2[i])
                stk.pop();
            if(stk.isEmpty())   lg[i] = -1;
            else    lg[i] = stk.peek();
            stk.push(nums2[i]);
        }

        for(int i=0 ;i<nums1.length ;i++){
            for(int j=0; j<n ; j++){
                if(nums1[i] == nums2[j]){
                    nums1[i] = lg[j];
                    break;
                }    
            }
        }
        return nums1;

    }
}
