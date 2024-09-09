public class BinaryTreeLevelOrder 
{
    public List<List<Integer>> levelOrder(TreeNode root) 
	{
        List<List<Integer>> output = new ArrayList<>();
        if (root == null) 
		{
            return output;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) 
			{
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                
                if (currentNode.left != null) 
				{
                    queue.offer(currentNode.left);
                }
                
                if (currentNode.right != null) 
				{
                    queue.offer(currentNode.right);
                }
            }
            
            output.add(currentLevel);
        }
        
        return output;
    }
}
