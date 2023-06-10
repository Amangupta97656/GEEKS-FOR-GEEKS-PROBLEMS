class Solution {
    public void Rearrange(int a[], int n){
        List<Integer> ls = new ArrayList<>();
        int i = 0;
        for(var e:a){
            if(e < 0){
                ls.add(i,e);
                i++;
            }
            else ls.add(e);
        }
        for(i = 0;i < n;i++) a[i] = ls.get(i);
    }
}