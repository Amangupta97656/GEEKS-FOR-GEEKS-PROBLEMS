class Solution {
    public ArrayList<Integer> asciirange(String s) {
        int n=s.length();
        int sum=0;
        int[] prefix =new int[n]; 
        for(int i=0;i<n;i++){
            sum+=((int )(s.charAt(i)));
            prefix[i]=sum;
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            int lastIndex = s.lastIndexOf(s.charAt(i));
            int firstIndex = s.indexOf(s.charAt(i));
            if(firstIndex != lastIndex && firstIndex + 1 != lastIndex && i == lastIndex) {
                result.add(prefix[lastIndex]-prefix[firstIndex]-(int)s.charAt(i));
            }
        }
        return result;
    }
}