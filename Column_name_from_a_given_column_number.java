class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder columnName = new StringBuilder();
        
        while(n > 0){
            long rem = n % 26;
            if(rem == 0){
                columnName.append("Z");
                n = (n/26) - 1;
            }
            else{
                columnName.append((char)((rem - 1) + 'A'));
                n /= 26;
            }
        }
        return columnName.reverse().toString();
    }
}