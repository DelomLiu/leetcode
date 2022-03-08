class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<int[]> compete = new ArrayList<>();
        int m=mat.length, n=mat[0].length;
        for (int col=0; col<m; col++) {
            int left=0, right=n-1, mid, pos=-1;
            while (left <= right) {
                mid = left + ((right - left) >> 1);
                if (mat[col][mid]==1) {
                    left = mid+1;
                    pos = mid;
                }
                else
                    right = mid-1;
            }
            compete.add(new int[]{pos, col});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            public int compare (int[] pair1, int[] pair2) {
                if (pair1[0] != pair2[0])
                    return pair1[0] - pair2[0];
                else
                    return pair1[1] - pair2[1];
            }
        });

        for (int i=0; i<compete.size(); i++) {
            pq.offer(compete.get(i));
        }

        int[] ans = new int[k];
        for (int i=0; i<k; i++) {
            ans[i] = pq.poll()[1];
        }
        return ans;
    }
}