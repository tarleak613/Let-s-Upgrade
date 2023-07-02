class q5 {
       public static int[] reverse(int s,int e,int[] arr){
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
    public static int[] rotate(int k,int[] nums){
        if(k > nums.length) k=k%nums.length;
        nums=reverse(0,nums.length-1,nums);
        nums=reverse(0,k-1,nums);
        nums=reverse(k,nums.length-1,nums);
        return nums;
    }
    
    public static void solve(int[] A, int[] B) {
        int m = B.length;
        int n = A.length;
        int[][] ar = new int[m][n];
        for(int i=0; i<m; i++){
            int[] a =new int[A.length];
            //  for(int j=0; j<n; j++){
            //      System.out.print(a[j]+" ");
            // }
            a = rotate(3 ,A);
            // for(int j=0; j<n; j++){
            //      System.out.print(a[j]+" ");
            // }
            // System.out.println();
            for(int j=0; j<n; j++){
                ar[i][j] = a[j]; 
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                 System.out.print(ar[i][j]+" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,5};
        int[] B = new int[]{2,3,5};
        solve(A,B);
    }
}