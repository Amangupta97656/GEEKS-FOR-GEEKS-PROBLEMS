class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        
        for(int i =0; i<n;i++){
            pq.add(new Pair(price[i],i+1));
        }
        int amount=0,ans=0;
        boolean check=false;
        while(pq.size()>0){
            Pair p=pq.poll();
            
            for(int i=p.ind;i>=1;i--){
                amount+=(p.val*i);
                
                if(amount<=k){
                    ans+=i;
                    break;
                }else{
                    check=true;
                    amount-=(p.val*i);
                }
            }
            if(check==true){
                break;
            }
        }
        
        return ans;
    }
    
    static class Pair{
        int val;
        int ind;
        
        Pair(int val,int ind){
            this.val=val;
            this.ind=ind;
        }
    }
}