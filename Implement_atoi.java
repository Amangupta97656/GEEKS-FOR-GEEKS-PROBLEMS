class Solution
{
    int atoi(String str) {
	// Your code here
	    long ans = 0;
	    boolean neg = false;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='-' && i==0){
	            neg = true;
	        }else if(Character.isDigit(str.charAt(i))){
	            ans = ans*10+str.charAt(i)-'0';
	        }else {
	            return -1;
	        }
	    }
	    return neg == true ? (int)ans*-1 :(int)ans;
    }
}