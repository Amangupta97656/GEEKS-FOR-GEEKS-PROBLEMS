class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(A);
        for(int i=0; i<n; i++){
            if(i>0 && A[i]==A[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=A[i]+A[j]+A[k];
                if(sum==X) return true;
                else if(sum<X) j++;
                else if(sum>X)k--;
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(A[i]);
                    temp.add(A[j]);
                    temp.add(A[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && A[j]==A[j-1]) j++;
                    while(j<k && A[k]==A[k+1]) k--;
                }
            }
        }
        return false;
    
    }
}