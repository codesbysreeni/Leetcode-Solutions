public int kthSmallest(int[][] matrix, int k) 
{
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int output = 0;
    
    for (int i = 0; i < matrix.length; i++) 
	{
        for (int j = 0; j < matrix[0].length; j++) 
		{
            minHeap.offer(matrix[i][j]);
        }
    }

    for (int i = 0; i < k; i++) 
	{
        output = minHeap.poll();
    }
    return output;
}