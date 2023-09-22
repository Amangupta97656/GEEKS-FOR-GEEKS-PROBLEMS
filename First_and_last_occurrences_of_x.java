class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer>ans =new ArrayList<>();
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(first==-1)first=i;
                last=i;
            }
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
}

