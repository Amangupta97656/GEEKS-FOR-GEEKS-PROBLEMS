class Solution {
	public int find(int a[], int si, int ei, int key) {
		for (int i = si; i <= ei; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

	public Node construct(int pre[], int preM[], int si, int ei, int mSI, int mEI) {
		if (si > ei)
			return null;
		Node root = new Node(pre[si]);
		if (si == ei)
			return root;
		int x = find(pre, si + 1, ei, preM[mSI + 1]);
		root.left = construct(pre, preM, si + 1, x - 1, mSI + (ei - x + 1) + 1, mEI);
		root.right = construct(pre, preM, x, ei, mSI + 1, mSI + (ei - x + 1));
		return root;
	}

	public Node constructBTree(int pre[], int preM[], int size) {
		// your code here
		return construct(pre, preM, 0, size - 1, 0, size - 1);
	}

}