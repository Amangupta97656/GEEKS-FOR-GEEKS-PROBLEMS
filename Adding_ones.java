class Solution {

    public static void update(int a[], int n, int updates[], int k)
    {
        // Your code goes here
        for(int i=0;i<k;i++){
            int ind=updates[i];
            a[ind-1]++;
        }
        int last=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                last+=a[i];
                a[i]=last;
            }else{
                a[i]=last;
            }
        }
    }
    
}