/* 85. Maximal Rectangle */

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
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] ls = new int[n];
        int[] rs = new int[n];
        nearestLeftSmallest(heights,ls);
        nearestRightSmallest(heights,rs);
        int ans = 0;
        for(int i=0 ;i<n ;i++){
            int area = (rs[i] - ls[i] - 1) * heights[i];
            ans = Math.max(ans,area);
        }
        return ans;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] arr = new int[m];   //created an array of column length
        Arrays.fill(arr, 0);      //arr = [0,0,0,0,0]

        int maxArea = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0)   arr[j] = 0;
                else arr[j] += matrix[i][j];
            }
            // for(int j =0 ;j<m; j++)
            //     System.out.print(arr[j]+" ");
            // System.out.println();
            int area = largestRectangleArea(arr);
            maxArea = Math.max(maxArea,area);
        }
        // System.out.print(area+" ");
        return maxArea;
    }
}
