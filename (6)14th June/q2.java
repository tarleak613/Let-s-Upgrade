import java.util.*;
public class q2 {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 1, 1, },
                { 1, 0, 1 },
                { 1, 1, 1 } };
        int n = 3;
        int m = 3;
        int[] row = new int[arr[0].length];
        int[] column = new int[arr[0].length];
        Arrays.fill(row,0);
        Arrays.fill(column,0);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 0)  {
                    row[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                if(row[i] == 1 || column[j] == 1)  arr[i][j] = 0;
        }
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++)
        System.out.print(arr[i][j]+" ");
        System.out.println();
        }
    }
}
