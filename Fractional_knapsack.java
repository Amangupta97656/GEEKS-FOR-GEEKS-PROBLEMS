class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr,(a,b)->Double.compare(b.value*1.0/b.weight,a.value*1.0/a.weight));//double compare is imp for correct ans
        
        double ans = 0;
        int i=0;
        while(i<n && arr[i].weight<=W){
            ans += arr[i].value;
            W -= arr[i].weight;
            i++;
        }
        
        if(i<n && W>0)
        ans += (arr[i].value*1.0/arr[i].weight) * W;
            
        return ans;
    }
}