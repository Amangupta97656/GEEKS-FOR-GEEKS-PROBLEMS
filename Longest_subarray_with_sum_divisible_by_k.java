class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        //contain reminder and it's position 
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        map.put(0,-1);
        int sum = 0;
        int reminderSum=0;
        for(int i=0;i<n;i++){
            sum += a[i];
            reminderSum = sum%k;
            if(reminderSum<0){
                reminderSum += k;
            }
            if(!map.containsKey(reminderSum)){
                map.put(reminderSum,i);
            }else{
                maxLength = Math.max(maxLength,i-map.get(reminderSum));
            }
        }
        
        return (maxLength==Integer.MIN_VALUE)?0:maxLength;
    }
}