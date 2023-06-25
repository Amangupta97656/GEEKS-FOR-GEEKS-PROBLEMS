class GfG
{
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        ArrayList<ArrayList<Integer>> hs = new ArrayList<>();
        Trie t = new Trie();
        for(int[] cc : a){
            if(t.insert(cc)){
                ArrayList<Integer> al = new ArrayList<Integer>();
                for(int k : cc)al.add(k);
                hs.add(al);
            }
        }
        
        return  hs;
    }
}

class Trie{
    node root;
    Trie(){
        this.root=new node();
    }
    boolean insert(int a[]){
        node temp = root;
        for(int i  : a){
            if(!temp.has(i))temp.set(i);
            temp=temp.get(i);
        }
        if(temp.end==1)return false;
        temp.end=1;
        return true;
    }
}
class node{
    int end;
    node link[];
    
    node(){
        this.end = 0;
        this.link = new node[2];
    }
    
    void set(int data){
        this.link[data] = new node();
    }
    
    node get(int data){
        return this.link[data];
    }
    
    boolean has(int data){
        return this.link[data]!=null;
    }
}