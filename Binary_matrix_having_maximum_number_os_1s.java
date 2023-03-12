class Solution {
    public int[] findMaxRow(int mat[][], int N) {
         int countofone=0, rownum=0;

        for(int i=0;i<N;i++){

            int tempnum =0;

            for(int j=0;j<N;j++){

                if(mat[i][j] == 1){

                    tempnum++;

                }

            }

            if(countofone < tempnum){

                countofone = tempnum;

                rownum = i;

            }

        }

        int arr[] = {rownum,countofone};

        return arr;

    }

};