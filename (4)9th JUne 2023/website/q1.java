/* 344. Reverse String */

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        if(n == 1) return;
        for(int i=0; i<n/2; i++){
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
    }
}

/* 2091. Removing Minimum and Maximum From Array */

class Solution {
    public int max(int[] arr,int n){
        int maxIndex=0;
        int temp=arr[0];
        for(int i=0; i<n; i++)
            if(arr[i] > temp){
                temp=arr[i];
                maxIndex = i;
            } 
        return  maxIndex;  
    }
    public int min(int[] arr,int n){
        int minIndex=0;
        int temp=arr[0];
        for(int i=0; i<n; i++)
            if(arr[i] < temp){
                temp=arr[i];
                minIndex = i;
            } 
        return  minIndex;  
    }
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n == 1) return 1;
        int maxIndex=max(nums,n);
        int minIndex=min(nums,n);
        int stepsL1 = maxIndex + 1;
        int stepsL2 = minIndex + 1;
        int stepsR1 = n - minIndex; 
        int stepsR2 = n - maxIndex; 
        int l = stepsL1 > stepsL2 ? stepsL1 : stepsL2;
        int R = stepsR1 > stepsR2 ? stepsR1 : stepsR2;
        int LR = (stepsL1 < stepsL2 ? stepsL1 : stepsL2) + (stepsR1 < stepsR2 ? stepsR1 : stepsR2);
        // System.out.print(n+" "+maxIndex+" "+minIndex+" "+stepsL1+" "+stepsL2+" "+stepsR1+" "+stepsR2+" "+l+" "+R+" "+LR+" ");
        return (l<R ? (l<LR ? l : LR) : (R<LR ? R : LR));
    }
}


/* 189. Rotate Array */


class Solution {
       public int[] reverse(int s,int e,int[] arr){
           if(arr.length == 1) return arr;
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
    public void rotate(int[] nums, int k) {
        if(k > nums.length) k=k%nums.length;
        nums=reverse(0,nums.length-1,nums);
        nums=reverse(0,k-1,nums);
        nums=reverse(k,nums.length-1,nums);
    }
}


/* 1512. Number of Good Pairs */

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i < j) count++;
            }
        }
        return count;
    }
}

/* Multiple left rotations of the array */

public class Solution {
    public int[] reverse(int s,int e,int[] arr){
        if(arr.length == 1) return arr;
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
    public int[] rotate(int k,int[] nums){
        if(k > nums.length) k=k%nums.length;
        nums=reverse(0,nums.length-1,nums);
        nums=reverse(0,nums.length-1-k,nums);
        nums=reverse(nums.length-k,nums.length-1,nums);
        return nums;
    }
    
    public int[][] solve(int[] A, int[] B) {
        int m = B.length;
        int n = A.length;      
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            int[] a =new int[A.length];
            for(int j=0; j<n; j++){
                a[j] = A[j];
            }
            a = rotate(B[i], a);
            for(int j=0; j<n; j++){
                arr[i][j] = a[j]; 
            }
        }
        return arr;
    }
}
