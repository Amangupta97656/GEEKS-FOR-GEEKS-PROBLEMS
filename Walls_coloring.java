class Solution{
	int minCost(int [][] colors, int N){
       int pink = 0, black = 0, yellow = 0;
	    
	    for(int i=0; i<N; i++) 
	    {
	        int curr_pink = Math.min(black, yellow) + colors[i][0];
	        int curr_black = Math.min(pink, yellow) + colors[i][1];
	        int curr_yellow = Math.min(pink, black) + colors[i][2];
	        
	        pink = curr_pink; black = curr_black; yellow = curr_yellow;
	    }
	    
	    return Math.min(pink, Math.min(black, yellow));
    }
}