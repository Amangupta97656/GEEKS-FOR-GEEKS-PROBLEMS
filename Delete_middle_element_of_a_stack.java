class Solution
{
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int index=sizeOfStack/2;
        if(sizeOfStack%2==0) index-=1;
        s.remove(index);
    } 
}