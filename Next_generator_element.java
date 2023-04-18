class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> s = new Stack<>();
        long p = arr[n-1];
        arr[n-1]=-1;
        s.push(p);
        for(int i=n-2;i>=0;i--){
            p=arr[i];
            if(arr[i]<s.peek()){
                arr[i]=s.peek();
                s.push(p);
            }
            else{
                while(arr[i]>=s.peek()){
                    s.pop();
                    if(s.isEmpty()){
                        arr[i]=-1;
                        s.push(p);
                    }
                }
                if(arr[i]!=-1 && arr[i]<s.peek()){
                    arr[i]=s.peek();
                    s.push(p);
                    }
            }
        }
        return arr;
    } 
}