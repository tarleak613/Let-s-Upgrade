public class q1 {
    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 1, 1, },
                { 1, 0, 1 },
                { 1, 1, 1 } };
        int n = 3;
        int m = 3;
        for (int i = 0; i < n; i++) {
            int countR = 0, countC = 0;
            // row check
            int[] row = new int[arr[0].length];
            for (int j = 0; j < m; j++)
                row[j] = arr[i][j];
            for (int j = 0; j < m; j++)
                if (row[j] == 0)    countR++;
            if (countR > 0) {
                for (int j = 0; j < m; j++) {
                    if (row[j] != 0)    row[j] = -1;
                }
            }
            // column check
            int[] column = new int[arr[0].length];
            for (int j = 0; j < m; j++)
                column[j] = arr[j][i];
            for (int j = 0; j < m; j++)
                if (column[j] == 0)
                    countC++;
            if (countC > 0) {
                for (int j = 0; j < m; j++) {
                    if (column[j] != 0)
                        column[j] = -1;
                }
            }
            // for (int j = 0; j < n; j++)
            //     System.out.print(row[j] + " ");
            // System.out.println();
            // for (int j = 0; j < n; j++)
            //     System.out.print(column[j] + " ");
            // System.out.println();
            // subsitute the value
            for(int j=0;j<n;j++)
                if(row[j] == -1)    arr[i][j] = 0;
                else  arr[i][j] = row[j];
            for(int j=0;j<n;j++)
                if(column[j] == -1)    arr[j][i] = 0;
                else  arr[j][i] = column[j];
        for(int k=0;k<n;k++){
        for(int j=0;j<m;j++)
        System.out.print(arr[k][j]+" ");
        System.out.println();
        }
        System.out.println(" next");
        }
        // displaying the matrix
        // for(int i=0;i<n;i++){
        // for(int j=0;j<m;j++)
        // System.out.print(arr[i][j]+" ");
        // System.out.println();
        // }
    }
}
