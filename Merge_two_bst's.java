class Solution
{
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public void inorder(Node root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
    public void sort(ArrayList<Integer> list1 , ArrayList<Integer> list2,ArrayList<Integer> list3,int i,int j){
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                list3.add(list1.get(i));
                i++;
            }
            else{
                list3.add(list2.get(j));
                j++;
            }
            
        }
        while(i<list1.size()){
            list3.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            list3.add(list2.get(j));
            j++;
        }
    }
    public List<Integer> merge(Node root1,Node root2)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        sort(list1,list2,list3,0,0);
        return list3;
        
        
        
    }
}