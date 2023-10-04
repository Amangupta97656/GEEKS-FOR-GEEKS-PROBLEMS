class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int n = str.length();
        int value =0;
        for(int i =0;i<n-1;i++){
            int x = roman(str.charAt(i));
            int x1 = roman(str.charAt(i+1));
            
            if(x<x1)x=-1*x;
            value += x;
            
        }
        int x = roman(str.charAt(n-1));
        value += x;
        return value;
    }
    public static int roman(Character ch){
        int x=0;
        if(ch=='I'){
            x=1;
        }else if(ch=='V') x=5;
        else if(ch=='X') x=10;
        else if(ch=='L') x=50;
        else if(ch=='C') x=100;
        else if(ch=='D') x=500;
        else if(ch=='M') x=1000;
        
        return x;
    }
}