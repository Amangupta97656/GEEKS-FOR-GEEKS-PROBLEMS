class Solution {

    static class Node {
        int val, row, col;
        Node(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }

    public ArrayList<Integer> findSmallestRange(int[][] arr) {
        int k = arr.length;
        int n = arr[0].length;

        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        int max = Integer.MIN_VALUE;

        // Step 1: Add first element from each list
        for (int i = 0; i < k; i++) {
            minHeap.offer(new Node(arr[i][0], i, 0));
            max = Math.max(max, arr[i][0]);
        }

        int start = 0, end = Integer.MAX_VALUE;

        while (true) {
            Node minNode = minHeap.poll();
            int min = minNode.val;

            // Update result if smaller range found
            if (max - min < end - start) {
                start = min;
                end = max;
            }

            // If the current list is exhausted, break
            if (minNode.col + 1 == n) break;

            // Push next element from the same list
            int nextVal = arr[minNode.row][minNode.col + 1];
            max = Math.max(max, nextVal);
            minHeap.offer(new Node(nextVal, minNode.row, minNode.col + 1));
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(start);
        result.add(end);
        return result;
    }
}