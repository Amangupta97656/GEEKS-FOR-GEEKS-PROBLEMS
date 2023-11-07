
class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
        //sort it on basis of profit
        //try doing the job at the last day of deadline
        //if last day already occupied then the prev day
        Arrays.sort(arr, (a,b)->b.profit-a.profit); //here b-a beacause descending order
        int profit=0;
        int done=0;
        int maxDl = 0;
        for(Job job: arr){
            maxDl=Math.max(maxDl, job.deadline);
        }
        
        int[] av = new int[maxDl+1]; // available slot/days - +1 as 0 based indexing so, just to make it simpler
        Arrays.fill(av, -1);
        
        for(Job job : arr){
            int j = job.deadline; //choosing last day to do the job
            
            while(j>0 && av[j]!=-1) j--; //if last day already occupied then checking for prev day if they are free
            
            if(j!=0){
                av[j]=1;
                done++;
                profit+=job.profit;
                
            }
        }
        return new int[]{done, profit};
    }
}
