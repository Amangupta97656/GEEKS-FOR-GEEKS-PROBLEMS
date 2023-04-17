class Solution
{
     public class Pair{
        int first;
        int second;
        Pair(){}
        public Pair(int x,int y){
            this.first = x;
            this.second = y;
        }
    }
    
    public class comp implements Comparator<Pair>{
        public int compare(Pair a,Pair b){
            return (a.first-b.first);
        }
    }
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Pair[] arr1 = new Pair[n];
        for(int i = 0;i<n;i++){
            arr1[i] = new Pair();
        }
        int max = 0;
        for(int i=0; i<n; i++){
            arr1[i].first = arr[i].profit;
            arr1[i].second = arr[i].deadline;
            max = Math.max(max,arr1[i].first);
        }
        Arrays.sort(arr1,new comp());
        int[] ans = new int[100000];
        int[] answer = new int[2];
        for(int i=n-1; i>=0; i--){
            if(ans[(int)(arr1[i].second)-1]==0){
                ans[(int)(arr1[i].second)-1] = arr1[i].first;
                answer[0]++;
                answer[1]+=arr1[i].first;
            }
            else {
                int o = (int)(arr1[i].second)-2;
                while(o>=0 && ans[o]!=0)
                    o--;
                if(o>=0){
                    ans[o] = arr1[i].first;
                    answer[0]++;
                    answer[1]+=arr1[i].first;
                }
            }
        }
        return answer;
    }
}