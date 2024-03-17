class Solution {

    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,
                          int x) {
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for(int i:head1)  hs.add(i);
        for(int i:head2) if(hs.contains(x-i)) count++;
        return count;
    }
}