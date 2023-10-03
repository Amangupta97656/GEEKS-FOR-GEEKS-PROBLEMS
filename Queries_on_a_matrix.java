class Solution {

public int[][] solveQueries(int n, int[][] queries) {

        // Code here

        int[][] arr=new int[n][n];

        for(int[] q: queries){

            for(int j=q[0];j<=q[2];j++){

                for(int k=q[1];k<=q[3];k++){

                    arr[j][k]++;

                }

            }

        }

        return arr;

    
    }
}