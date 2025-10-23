class Solution {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int val = (x * x) + (y * y);
            map.put(val, i);
        }

        for (int key : map.keySet()) {
            if (k <= 0) break;
            int index = map.get(key);
            ArrayList<Integer> list = new ArrayList<>();
            list.add(points[index][0]);
            list.add(points[index][1]);
            ans.add(list);
            k--;
        }

        return ans;
    }
}
