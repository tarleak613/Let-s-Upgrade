class q6 {
    public static int[] reverse(int s,int e, int[] arr){
        int end = e;
        int i = s;
        int j = e;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        // for(int i =s; i<end; i++){
        //     if(e == i || i > e) break;
        //     int temp = arr[i];
        //     arr[i] = arr[e];
        //     arr[e] = temp;
        //     e--;
        // }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        int k = 3;
        int n = nums.length;
        if(n > k)  
        nums=reverse(0,n-1,nums);
        nums=reverse(0,k-1,nums);
        nums=reverse(k,n-1,nums);
               // if(nums.length != k){ 
        // if(nums.length > k){
            // if(nums.length != 1){ 
            // nums=reverse(0,nums.length-1,nums);
            // nums=reverse(0,k-1,nums);
            // nums=reverse(k,nums.length-1,nums);
            // }
        // }
        // else {
        //     k = k - nums.length;
        //     nums=reverse(0,nums.length-1,nums);
        //     nums=reverse(0,k-1,nums);
        //     nums=reverse(k,nums.length-1,nums);
        //     }
        // }
    }
}