class Pair implements Comparable<Pair>{
    int data,row,col;
    Pair(int d,int i,int j){
        data = d;
        row = i;
        col = j;
    }
    public int compareTo(Pair obj){
        return this.data-obj.data;
    }
}
class Solution
{
	static int[] findSmallestRange(int[][] KSortedArray,int n,int k)
	{
	    int mini = Integer.MAX_VALUE;
	    int maxi = Integer.MIN_VALUE;
	    PriorityQueue<Pair> pq = new PriorityQueue<>();
	    //add first element of each row in pq
	    for(int i =0;i<k;i++){
	        int elem = KSortedArray[i][0];
	        pq.add(new Pair(elem,i,0));
	        mini = Math.min(mini,elem);
	        maxi = Math.max(maxi,elem);
	    }
	    int t1 = mini, t2 = maxi;
	    while(pq.size()>0){
	        //to range to be small we have to increase the mini value
	        
	        //remove smallest element
	        Pair p = pq.remove();
	        //update mini 
	        mini = p.data;
	        //update range and answer range
	        int upRange = maxi-mini;
	        int ansRange = t2 -t1;
	        //we have to need smaller range
	        if(upRange<ansRange){
	            t2 = maxi;
	            t1 = mini;
	        }
	        //add next element of row
	        if(p.col<n-1){
	            maxi = Math.max(maxi,KSortedArray[p.row][p.col+1]);
	            pq.add(new Pair(KSortedArray[p.row][p.col+1],p.row,p.col+1));
	        }
	        else{
	            break;
	        }
	    }
	    int [] ans = new int[2];
	    ans[0] = t1;
	    ans[1] = t2;
	    return ans;
	}
}