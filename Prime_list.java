class Solution {
    boolean check(int num,ArrayList<Integer> arr){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0)return false;
        }
        arr.add(num);
        return true;
    }
    
    int find(int data, ArrayList<Integer> arr) {
        int l=0;
        int r=arr.size()-1;
        while(l<=r) {
        	int mid=(l+r)>>1;
        	if(data>arr.get(mid)) {
        		l=mid+1;
        	}else {
        		r=mid-1;
        	}        	
        }
        return r;
	}
    
    Node primeList(Node head) {
        ArrayList<Integer> arr=new ArrayList<>();        
        for(int i=2;i<10010;i++) check(i,arr);
        Node temp=head;
        while(temp!=null) {  	
        	int index=find(temp.val,arr);
        	int k=temp.val;
        	if(index==-1)temp.val=2;
        	else if(arr.size()-1==index) {
        		temp.val=arr.get(index);
        	}
        	else {
        		if(Math.abs(arr.get(index)-k)> Math.abs(arr.get(index+1)-k)){
        			temp.val=arr.get(index+1);
        		}else {
        			temp.val=arr.get(index);
        		}    		
        	}        	
        	temp=temp.next;        	
        }
        return head; 
        
    }
}