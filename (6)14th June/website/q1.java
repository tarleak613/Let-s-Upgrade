/* Anti Diagonals */

public class Solution {
    public void findDiagonal(int[][] arr,int si,int ei,ArrayList<Integer> a1,int n){
        while(si < n && ei >= 0){
            a1.add(arr[ei][si]);
            si++;
            ei--;
        }
    }
    public int[][] diagonal(int[][] A) {
        ArrayList < ArrayList<Integer> > list = new ArrayList < ArrayList<Integer> > ();
        for(int i=0; i<A.length; i++){
            ArrayList<Integer> a1 = new ArrayList<Integer> ();
            findDiagonal(A,0,i,a1,A.length);
            list.add(a1);
        }
        for(int i=1; i<A.length; i++){
            ArrayList<Integer> a1 = new ArrayList<Integer> ();
            findDiagonal(A,i,A.length-1,a1,A.length);
            list.add(a1);
        }
        return list;
    }
}


/* 1424. Diagonal Traverse II */
class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int n = 0, i = 0, maxKey = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int r = nums.size() - 1; r >= 0; --r) { // The values from the bottom rows are the starting values of the diagonals.
            for (int c = 0; c < nums.get(r).size(); ++c) {
                map.putIfAbsent(r + c, new ArrayList<>());
                map.get(r + c).add(nums.get(r).get(c));
                maxKey = Math.max(maxKey, r + c);
                n++;
            }
        }
        int[] ans = new int[n];
        for (int key = 0; key <= maxKey; ++key) {
            List<Integer> value = map.get(key);
            if (value == null) continue;
            for (int v : value) ans[i++] = v;
        }
        return ans;
    }
}

/* 73. Set Matrix Zeroes */
class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] column = new int[m];
        Arrays.fill(row,0);
        Arrays.fill(column,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j] == 0)  {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                if(row[i] == 1 || column[j] == 1)  matrix[i][j] = 0;
        }
    }
}

/* 867. Transpose Matrix */

class Solution {
    public int[][] transpose(int[][] matrix) {
        int N = matrix.length;
        int[][] tMatrix = new int[matrix[0].length][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<matrix[i].length; j++)
                tMatrix[j][i] = matrix[i][j];
        }
        return tMatrix;
    }
}

/* 59. Spiral Matrix II */

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        //spiral matrix (uff the connections)
        int top=0,down = n-1,left = 0,right = n-1;
        int dir = 0;
        int count = 0;
        while(top<=down && left<=right){
            if(dir == 0){
                for(int i=left; i<=right; i++)
                    mat[top][i] = ++count;  
                top +=1;
            }
            else if(dir == 1){
                for(int i=top; i<=down; i++)
                    mat[i][right] = ++count;
                right -=1;
            }
            else if(dir == 2){
                for(int i=right; i>=left; i--)
                    mat[down][i] = ++count;
                down -=1;
            }
            else if(dir == 3){
                for(int i=down; i>=top; i--)
                    mat[i][left] = ++count;
                left +=1;
            }
            dir = (dir+1) % 4;
        }
        return mat;
    }
}

/* 48. Rotate Image */
class Solution {
    public void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        //transpose the matrix
        int[][] tMatrix = new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                tMatrix[j][i] = matrix[i][j];
            }
        }
        //reverse each row
         for(int i=0; i<N; i++){
            int[] arr = new int[N];
            for(int j=0; j<N; j++){
                arr[j] = tMatrix[i][j];
            }
            reverse(arr);
            for(int j=0; j<N; j++){
                matrix[i][j] = arr[j];
            }
        }
    }
}

/* 1572. Matrix Diagonal Sum  */

class Solution {
    public int diagonalSum(int[][] mat) {
        int N = mat.length;
        int sum = 0;
        for(int i=0; i<N; i++)  sum +=mat[i][i];
        int k = N-1;
        for(int i=0; i<N; i++){
              sum +=mat[i][k];
              k--;
        }
        if(N % 2 == 0)  return sum;
        else return sum-mat[N/2][N/2];
    }
}



