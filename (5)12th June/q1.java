/* 238. Product of Array Except Self */

class Solution {
    public void prefixProduct(int[] arr,int[] pP){
         pP[0] = arr[0];
        for (int i = 1; i < arr.length; ++i)
            pP[i] = pP[i - 1] * arr[i];
    }
    public void suffixProduct(int[] arr,int[] sP){
         sP[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--)
            sP[i] = sP[i + 1] * arr[i];
    }
    public int[] productExceptSelf(int[] nums) {
        int[] pP = new int[nums.length];
        int[] sP = new int[nums.length];
        prefixProduct(nums,pP);
        suffixProduct(nums,sP);
        for(int i =0; i<nums.length; i++){
            int lp=1,rp=1;
            if(i == 0){  
                lp = 1;
                rp = sP[i+1];
            }
            else if(i == nums.length-1){ 
                rp = 1;
                lp = pP[i-1];
            }
            else{
            lp = pP[i-1];
            rp = sP[i+1]; }
            nums[i] = lp * rp;
        }
        return nums;
    }
}

/* Equilibrium Point */

class Solution {
    public static long[] prefixSum(long[] arr){
        long sum=arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i] += sum;
            sum = arr[i];
        }
        return arr;
    }
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n == 1)  return 1;
        arr= prefixSum(arr);
        for(int i=0; i<n; i++){
            long ls = 0,rs = 0;
            if(i == 0) { 
                ls = 0;
                rs = arr[n-1];
            }
            else{ ls += arr[i-1];
            rs = arr[n-1] - arr[i];
            }
            //compare condition
            if(ls == rs)    return i+1;
        }
        return -1;
        
    }
}
  

/* 303. Range Sum Query - Immutable */

class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i] += sum;
            sum = nums[i];
        }
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        if(left==0) { return nums[right];}
        else { return nums[right]-nums[left-1];}
        
    }
}



 /* 1551. Minimum Operations to Make Array Equal */

 class Solution {
    public int minOperations(int n) {
        // 0 1 2      3 4 5
        // 1 3 5      7 9 11

        // x>=0    arr[x] -= 1
        // y < n   arr[y] += 1

        return (n*n)/4;
    }
}


/* Pick from both sides! */

public class Solution {
    public int solve(int[] A, int B) {
        int i,k=A.length-1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(i = 0;i<B ; i++){
            // l +=A[i];
            sum += A[i];
        }
        if(max < sum) max = sum;
        i = B - 1;
        while(i>=0){
            sum = sum - A[i] + A[k];
            i--;
            k--;
            if(max < sum)   max = sum;
        }
        return max;
        
    }
}


/* Balance Array */

public class Solution {
    public int solve(int[] A) {
        if(A.length == 2) return 0;
        int sumOdd = 0, sumEven = 0;
        for(int i=0; i<A.length; i++){
            if(i % 2 == 0 && i != 1) sumEven+=A[i];
            else sumOdd +=A[i]; 
        }
        int count = 0;
        int eqEven = 0;
        int eqOdd = 0;
        for(int i=0; i<A.length; i++){
            if(i%2 == 0){
                sumEven -=A[i];
                if((eqOdd+sumEven)==(eqEven+sumOdd)) count++;
                eqEven += A[i];
            }
            else{
                sumOdd -=A[i];
                if((eqEven+sumOdd)==(eqOdd+sumEven)) count++;
                eqOdd += A[i];
            }
        }
        return count;
    }
}