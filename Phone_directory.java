class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
      
      ArrayList<ArrayList<String>> ans=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            ArrayList<String> arr=new ArrayList<>();
            String str=s.substring(0, i+1);
            for(String st : contact){
                if(i<st.length() && st.substring(0, i+1).equals(str) && !arr.contains(st)){
                    arr.add(st);
                }
                
            }
            i++;
            if(arr.isEmpty())
                arr.add("0");
            
            Collections.sort(arr,new Comparator<String>()
                {
                    public int compare( String a, String b ){
                    return a.compareTo(b);     
                }
            });
        
            ans.add(arr);
            
        }
        
        return ans;
    }
}