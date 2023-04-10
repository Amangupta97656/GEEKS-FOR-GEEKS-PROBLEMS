class Solution {
    public int maxIntersections(int[][] lines, int N) {
         ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        for(int i=0; i< N; i++){
            first.add(lines[i][0]);
            second.add(lines[i][1]);
        }
        Collections.sort(first);
        Collections.sort(second);
        int i=0, j=0;
        int max = Integer.MIN_VALUE , intersection=0;
        while(i<N && j< N){
            if(first.get(i) <= second.get(j)){
                i++;
                intersection++;
                max = Math.max(max, intersection);
            }else{
                j++;
                intersection--;
            }
        }
        return max;
    }
}