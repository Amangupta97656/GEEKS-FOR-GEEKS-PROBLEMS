class Solution
{
    public int minNumber(int arr[], int N)
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        if(sum == 1){//if sum 1 just add anotherr 1 with the sum and return 1+1 = 2.
            return 1;
        }
        if(checkPrime(sum)){//if already prime then return 0
            return 0;
        }else{//find the new smaller element.
            int ans = 0;
            for(int i=1;i<sum;i++){
                if(checkPrime(sum+i)){
                    ans = i;
                    break;
                }
            }
            return ans;
        }

    }
    public static boolean checkPrime(int sum){
        int i = 2;
        while(i<=Math.sqrt(sum)){
            if(sum%i==0){
                return false;//non-prime
            }
            i++;
        }
        return true;//prime
    }
}