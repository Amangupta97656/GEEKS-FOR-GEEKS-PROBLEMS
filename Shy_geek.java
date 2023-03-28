class Solution{
    
    static Shop shop;
    Solution(Shop shop){
        this.shop = shop;
    }
    public static long[] binarySearch (int n,long k,long arr[]){
        // System.out.println("k is"+k);
        long a[]=new long[2];
        a=arr;
    int low=0,high=n-1;
        int mid=0;
        int cost = -1; 
         while(low <= high){
                mid = (low+high)/2;
                int curCost = shop.get(mid);
                // System.out.println("mid value: "+curCost);
                if(curCost > cost && curCost <= k){ // desired chocolate found
                    cost = curCost; 
                    low = mid+1;
                }
                else
                    high = mid-1;
            }
            a[0]=cost;
            a[1]=mid;
         return a;
    }
    static long find(int n, long k){
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=shop.get(i);
        // }
        long count=0;
        long optimumChocolateValue = shop.get(n-1);
        long arr[]=new long[2];
        for(int i=n-1;i>=0;i--){
            
            if(k/optimumChocolateValue>=0)
            {
                // System.out.println("values are: "+shop.get(i)+" "+k);
                count= count +k/optimumChocolateValue;
                k= k - (k/optimumChocolateValue)*optimumChocolateValue;
            }
            binarySearch(n,k,arr);
            
            optimumChocolateValue=arr[0];
            n=(int)arr[1];
        }
        // System.out.println("ans is: "+count);
        return count;
    }

}