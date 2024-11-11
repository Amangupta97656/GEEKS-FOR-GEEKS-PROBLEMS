class Solution {
    public int minIncrements(int[] arr) {
        Arrays.sort(arr);
        int i=0;
        int j=1;
        int count=0;
        while(j<arr.length){
            if(arr[i]>=arr[j]){
                count+=arr[i]-arr[j]+1;
                arr[j]=arr[i]+1;
            }
            i++;
            j++;
        }
        
        return count;
    }
}