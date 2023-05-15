class Solution {

    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
       
       if(k>n){
           rvrs(arr,0,n-1);
       }else{
           int i=0;
           while(i+k<=n){
                rvrs(arr,i,i+k-1); 
                i=i+k;
           }
           
           if(i<n){
           rvrs(arr,i,n-1);
       }
       }
    }
    public static void rvrs(ArrayList<Integer> arr,int i,int j){
        while(i<j){
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        
    }
}