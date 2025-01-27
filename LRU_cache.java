class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        int n = prerequisites.length, m = queries.length;
        if(n == 0){
            List<Boolean> res = new ArrayList<>(m);
            for(int i=0; i<m; i++) res.add(false);
            return res;
        }class Node{
    int data;
    Node prev,next;
    Node(int x){
        data=x;
        prev=null;
        next=null;
    }
}
class LRUCache {
    // Constructor for initializing the cache capacity with the given value.
   static HashMap<Integer,Node> map;
   static HashMap<Node,Integer> map2;
   static Node head,tail;
    static int size,capacity;
    LRUCache(int cap) {
        // code here
        map=new HashMap<>();
        map2=new HashMap<>();
        head=null;
        tail=null;
        size=0;
        capacity=cap;
    }

    // Function to return value corresponding to the key.
    public static int get(int key) {
        // your code here
        if(map.get(key)==null) return -1;
           if(head==null || head.next==null) return head.data;
         Node temp=map.get(key);
      
         if(temp.prev==null) {
             head=head.next;
             head.prev=null;
             
         }
         else if(temp.next==null){
             tail=temp.prev;
             tail.next=null;
         }
         else{
             Node prev=temp.prev;
             prev.next=temp.next;
             prev.next.prev=prev;
         }
         tail.next=temp;
         temp.next=null;
         temp.prev=tail;
         tail=temp;
         return temp.data;
            
    }

    // Function for storing key-value pair.
    public static void put(int key, int value) {
        // your code here
        if(map.get(key)==null) size++;
        if(size>capacity){
            size--;
             map.remove(map2.get(head));
             map2.remove(head);
            head=head.next;
          if(head!=null)  head.prev=null;
          if(head==null) tail=head;
           
        }
        
        if(map.get(key)!=null){
             Node temp=map.get(key);
               temp.data=value;
            if(head.next==null) {
                return;
            }
              
         if(temp.prev==null) {
             head=head.next;
             head.prev=null;
             
         }
         else if(temp.next==null){
             tail=temp.prev;
             tail.next=null;
         }
         else{
             Node prev=temp.prev;
             prev.next=temp.next;
             prev.next.prev=prev;
         }
         tail.next=temp;
         temp.next=null;
         temp.prev=tail;
         tail=temp;
        }
        else{
            if(head!=null){
            Node newnode=new Node(value);
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
                map.put(key,tail);
                map2.put(tail,key);
            }
            else{
                 Node newnode=new Node(value);
                 head=newnode;
                 tail=newnode;
                 map.put(key,head);
                 map2.put(head,key);
            }
            
        }
        // System.out.println(map);
    }
}
        List<Integer> graph[] = new ArrayList[numCourses];
        for(int i=0; i<numCourses; i++) graph[i] = new ArrayList<>();
        for(int p[] : prerequisites){
            graph[p[0]].add(p[1]);
        }
        boolean isReachable[][] = new boolean[numCourses][numCourses];
        for(int i=0; i<numCourses; i++){ 
            if(!isReachable[i][i]){ 
                dfs(i, graph, isReachable);
            }
        }
        List<Boolean> res = new ArrayList<>(m);
        for(int q[] : queries){
            res.add(isReachable[q[0]][q[1]]);
        }
        return res;
    }
    private void dfs(int curr, List<Integer> graph[], boolean isReachable[][]){
        isReachable[curr][curr] = true;
        for(int neighbor : graph[curr]){
            if(!isReachable[curr][neighbor]){
                isReachable[curr][neighbor] = true;
                dfs(neighbor, graph, isReachable);
                for(int i=0; i<isReachable.length; i++){
                    isReachable[curr][i] |= isReachable[neighbor][i]; 
                }
            }
        }
    }
}
