class Solution {
    
   void f(String str, ArrayList<ArrayList<String>> ans,ArrayList<String> arr){
        if(str.length()==0){
            ArrayList<String> temp=new ArrayList<>(arr);
            ans.add(temp);
            return ;
        }
        for(int i=0;i<str.length();i++){
            String pre=str.substring(0,i+1);
            if(isPalindrome(pre)){
                arr.add(pre);
                String post=str.substring(i+1);
                f(post,ans,arr);
                arr.remove(arr.size()-1);
            }
        }
    }
    
    
    
    private  boolean isPalindrome(String pre) {
		StringBuilder strTemp=new StringBuilder(pre);
		String temp=strTemp.reverse().toString();
		//System.out.println(strTemp);
		if(temp.equals(pre)) return true;
		return false;
	}
    
    public ArrayList<ArrayList<String>> palinParts(String s) {
        ArrayList<ArrayList<String>> ans =new ArrayList<>();
        ArrayList<String> arr=new ArrayList<>();
        f(s,ans,arr);
		return ans;
        
    }
}