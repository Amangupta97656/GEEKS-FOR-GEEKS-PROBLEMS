class pair
{
    int first,second,third;
    pair(int first,int second,int third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}
class Solution
{
	public static int minIteration(int rows, int cols, int x, int y){
		Queue<pair> queue = new LinkedList<>();
		queue.add(new pair(x-1,y-1,0));
		int[][] arr = new int[rows][cols];
		arr[x-1][y-1] = 1;
		int iterations = 0;
		int[] trav_row = {-1,0,1,0};
		int[] trav_col = {0,1,0,-1};
		while(!queue.isEmpty())
		{
		    pair curr = queue.peek();
		    int n1 = curr.first;
		    int n2 = curr.second;
		    iterations = curr.third;
		    for(int i = 0;i<4;i++)
		    {
		        int d1 = n1+trav_row[i];
		        int d2 = n2+trav_col[i];
		        if(d1>=0 && d1<rows && d2>=0 && d2<cols && arr[d1][d2]== 0)
		        {
		            arr[d1][d2] = 1;
		            queue.add(new pair(d1,d2,iterations+1));
		        }
		    }
		    queue.remove();
		}
		return iterations;
	}
}