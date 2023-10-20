class GfG{
    Stack<Integer> s;
    Stack<Integer> minStack;
    
    // Constructor    
    GfG(){
        s = new Stack<Integer>();
        minStack = new Stack<Integer>();
	}
	
    int getMin(){
        if(s.empty()) return -1;
	    return minStack.peek();
    }
    
    int pop(){
        if(s.empty()) return -1;
	    minStack.pop();
	    return s.pop();
    }

    void push(int x){
	    int min = s.empty() ? x : Math.min(x, this.getMin());        
	    s.push(x);
	    minStack.push(min);
    }	
}