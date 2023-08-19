class Solution{
    
    bool solve(int s, int *a, int n, int sum, int k, vector<int> &vis){
        if(!k)return true; // base case, ki required set sab ban gaye
        
        for(int i=0;i<n;i++){
            if(vis[i])continue;  // agar element visited hai to aage badh jao
            if(s+a[i]==sum) {  // agar ban gya set to k-1 karke next set dekho
                vis[i]=1;      // visited kardo is position ko 
                if(solve(0, a, n, sum, k-1, vis))return true; // sum 0 karke aage jao
                vis[i]=0;      // backtracking
            }
            else if(s + a[i] < sum){  // agar abhi bhi sum nahi bana
                vis[i]=1;             // to dekhte raho aage 
                if(solve(s + a[i], a, n, sum, k, vis))return true; 
                vis[i]=0;  // backtracking
            }
        }
        
        return false;  
        
    }
  public:
    bool isKPartitionPossible(int a[], int n, int k)
    {
        int sum=0;
        for(int i=0;i<n;i++)sum+=a[i];
        vector<int> arr(n); // ek array maintain karenge, ki is postition wale element 
                            // ko choose kiya ya nahi
        if(sum%k)return false;   // agar sum possible hai hi nhi to false return kardo
        else return solve(0, a, n, sum/k, k, arr);
    }
};