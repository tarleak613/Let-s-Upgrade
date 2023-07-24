/* 907. Sum of Subarray Minimums */

class Solution {
    public void nearestLeftSmallest(int[] arr,int[] ls){
        int n = arr.length;
        
        Stack<Integer> stk = new Stack<Integer>();

        for(int i=0 ; i<n; i++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i])
                stk.pop();
            if(stk.isEmpty())   ls[i] = -1;
            else    ls[i] = stk.peek();
            stk.push(i);
        }
    }
    public void nearestRightSmallest(int[] arr,int[] rs){
        int n = arr.length;

        Stack<Integer> stk = new Stack<Integer>();

        for(int i=n-1 ; i>=0; i--){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i])
                stk.pop();
            if(stk.isEmpty())   rs[i] = n;
            else    rs[i] = stk.peek();
            stk.push(i);
        }
    }
    public int sumSubarrayMins(int[] arr) {
        long mod = 1000000007;
        int n = arr.length;
        int[] ls = new int[n];
        int[] rs = new int[n];
        nearestLeftSmallest(arr,ls);
        nearestRightSmallest(arr,rs);
        long ans = 0;
        for(int i=0 ;i<n ;i++){
            int leftlen = i - ls[i];
            int rightlen = rs[i] - i;
            ans = (ans +((long)arr[i] * leftlen * rightlen)%mod)%mod;
            System.out.print(ans+" ");
        }
        return (int)ans;
    }
}
