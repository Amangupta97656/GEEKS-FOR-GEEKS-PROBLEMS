class Solution {
    public String longestCommonPrefix(String arr[]) {
        Arrays.sort(arr);
        if(arr[0].charAt(0) != arr[arr.length-1].charAt(0))
        {
           String str= "-1";
           return str;
        }
        int i=0;
        StringBuilder s= new StringBuilder();
        while(i<arr[0].length() && i< arr[arr.length-1].length())
        {
            if(arr[0].charAt(i) == arr[arr.length-1].charAt(i))
            {
                s.append(arr[0].charAt(i));
            }
            else
            {
                return s.toString();
            }
            i++;
        }
        return s.toString();
    }
}