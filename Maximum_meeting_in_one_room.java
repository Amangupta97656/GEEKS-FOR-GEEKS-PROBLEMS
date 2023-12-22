class Solution {
    static class Pair{
        int start;
        int end;
        int index;
        Pair(int s,int e,int i){
            this.start=s;
            this.end=e;
            this.index=i;
        }
    }
    public static ArrayList<Integer> maxMeetings(int n, int[] s, int[] f) {
        Pair [] p=new Pair[n];
        for(int i=0;i<n;i++){
            p[i]=new Pair(s[i],f[i],i+1);
        }
        Arrays.sort(p,(a,b)->a.end-b.end);
        ArrayList<Integer> ans=new ArrayList<>();
        int end=-1;
        for(int i=0;i<n;i++){
            if(p[i].start>end){
                ans.add(p[i].index);
                end=p[i].end;
            }
        }
        Collections.sort(ans);
        return ans;
    }
}