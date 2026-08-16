class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        long[] score = new long[n];
        
        // Step 1: Accumulate the edge scores
        for (int i = 0; i < n; i++) {
            score[edges[i]] += i;
        }
        
        int bestNode = 0;
        
        // Step 2: Find the node with the highest score
        // Iterating 0 to n-1 inherently handles the tie-breaker for the smallest index
        for (int i = 1; i < n; i++) {
            if (score[i] > score[bestNode]) {
                bestNode = i;
            }
        }
        
        return bestNode;
    }
}
