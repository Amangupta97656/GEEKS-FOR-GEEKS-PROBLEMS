class Solution {
    static Node construct(int arr[][]) {
        // Add your code here.
        HashMap<String,Node> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                String curr=i+" "+j;
                Node temp;
                if(map.containsKey(curr)){
                    temp=map.get(curr);
                }else{
                    temp=new Node(arr[i][j]);
                }
                if(i+1<arr.length){
                    String d=(i+1)+" "+j;
                    Node down=new Node(arr[i+1][j]);
                    map.put(d,down);
                    temp.down=down;
                }
                if(j+1<arr[0].length){
                    String r=i+" "+(j+1);
                    Node right=new Node(arr[i][j+1]);
                    map.put(r,right);
                    temp.right=right;
                }
                map.put(curr,temp);
            }
        }
        return map.get("0 0");
    }
}