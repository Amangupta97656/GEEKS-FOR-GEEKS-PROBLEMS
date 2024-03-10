class Solution {
String removeDuplicates(String str) {
char[] arr = str.toCharArray();
StringBuilder sb = new StringBuilder();
for (char ch : arr) {
if (sb.indexOf(Character.toString(ch)) == -1) {
sb.append(ch);
   }
}
return sb.toString();
}
}
