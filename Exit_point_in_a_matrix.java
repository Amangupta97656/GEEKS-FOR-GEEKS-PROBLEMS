class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        String helper[] = new String[] {"East","South","West","North"};
        int directionidx = 0;
        String direction = "East";
        int i=0,j=0;
        while(i>=0 && i<matrix.length && j>=0 && j<matrix[0].length){
                if(matrix[i][j] == 1){
                    matrix[i][j] = 0;
                    directionidx=(directionidx+1)%(helper.length);
                    direction = helper[directionidx];
                }
                if(direction.equals("East")) j++;
                else if(direction.equals("West")) j--;
                else if(direction.equals("North")) i--;
                else if(direction.equals("South")) i++;
        }
        if(i<0) i++;
        else if(i>= matrix.length) i--;
        if(j<0) j++;
        else if(j>= matrix[0].length) j--;
        
        return new int[]{i,j};
    }
}