class Solution
{
    int search(int arr[], int l, int h, int key)
    {

        int ans=-1;
        for(int i=l;i<=h/2;i++){
            
            if(arr[i]==key){
                ans=i;
            }
            if(arr[h-i]==key ){
                ans=h-i;
            }
        }
        
        return ans ;
    }
}