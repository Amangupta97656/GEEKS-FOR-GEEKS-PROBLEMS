class Node{
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
