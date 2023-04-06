class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
          ArrayList<Integer> al =new ArrayList<Integer>();
        Arrays.sort(arr);
        int i,num=arr[0];
        int f=0,c=0;

        for(i=1;i<n;i++){
            if(num!=arr[i]){
                num=arr[i];
            }
            else{
                f=1;
                if(c==0){
                    al.add(arr[i]);
                    c++;
                }
                else if(arr[i]!=al.get(c-1) && c>=1){
                    al.add(arr[i]);
                    c++;
                }      
            }
        }
        if(f==1)
            return al;
        else{
            al.add(-1);
            return al;
        }
        
    }
}