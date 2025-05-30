class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        
        Map<String,ArrayList<String>> m=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int[] f=new int [26];
            char[] c=arr[i].toCharArray();
            for(int j=0;j<c.length;j++){
                char ct=c[j];
                f[ct-'a']++;
            }
            
            String k=Arrays.toString(f);
            if(!m.containsKey(k)){
                m.put(k,new ArrayList<>());
                
            }
            m.get(k).add(arr[i]);
            
        }
        return new ArrayList<>(m.values());
    }
}