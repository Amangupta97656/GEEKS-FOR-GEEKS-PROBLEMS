class Solution {
 
public static Node reverse(Node head, int k) {
     
if(head==null || head.next==null){

            
return head;

        
}
      
int counter = 0;

        
Node pre = null;

        
Node curr= head;

        
Node next = null;

        
while(k!=counter && curr!=null ){

            
next = curr.next;

            
curr.next=pre;

            
pre=curr;

            
curr=next;

            
counter++;

        
}
        
Node pre2 = null;

        
Node curr2 = next;

        
Node next2 = null;

        
while(curr2!=null){

            
next2= curr2.next;

            
curr2.next= pre2;

            
pre2= curr2;

            
curr2=next2;

        
}

        
head.next=pre2;

        
return pre;

    
}
    
}
