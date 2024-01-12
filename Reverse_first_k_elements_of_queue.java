class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Queue<Integer>q1=new LinkedList<>();
        Stack<Integer>stack=new Stack();
        int cnt=0;
        while(cnt<k){
            stack.push(q.remove());
            cnt++;
        }
        while(!q.isEmpty()){
            q1.add(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
         while(!q1.isEmpty()){
            q.add(q1.remove());
        }
        
       
        return q;
            
    }
}

