class Solution {
    public boolean compute(Node root) {
        String str = "";
        Node temp = root;
        while(temp != null){
            str += temp.data;
            temp = temp.next;
        }
        int i =0 ;
        int j = str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}