class Solution {
    long countSubstring(String str){
        int n=str.length();
        long arr[] = new long[n];
        
        // converting string to array
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='0'){
                arr[i]=-1;
            }else arr[i]=1;
        }
        
        long res=0l;
        
        //calculaing prefix sum array
        if(arr[0]>0) res++;
        for(int i=1; i<n; i++){
            arr[i]+=arr[i-1];
            if(arr[i]>0) res++;
        }
        
        res+=mergeSort(arr,0,n-1);
        return res;
    }
    
    long mergeSort(long []arr, int low, int high){
        if(low>=high) return 0l;
       
        
        long count = 0l;
        int mid=low+(high-low)/2;
        
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        
        return count;
    }
    
    long merge(long arr[], int low, int mid, int high){
        
        long leftArr[] = new long[mid-low+1];
        long rightArr[] = new long[high-mid];
       
        
        for(int i=low; i<=mid; i++){
            leftArr[i-low]=arr[i];
        }
        
        
        for(int i=mid+1; i<=high; i++){
            rightArr[i-1-mid]=arr[i];
        }
        
        long count=0;
        int start=low;
        int i=0; int j=0;
        
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]<rightArr[j]){
                arr[start++]=rightArr[j++];
                count+=(leftArr.length-i);
            }else{
                arr[start++]=leftArr[i++];
            }
        }
        
        while(i<leftArr.length){
            arr[start++]=leftArr[i++];
        }
        
        while(j<rightArr.length){
            arr[start++]=rightArr[j++];
        }
        
        return count;
    }
    
}