public class BinaryTreeInOrderTraversal 
{
    public List<Integer> inorderTraversal(TreeNode root) 
	{
        List<Integer> output = new ArrayList<>();
        if (root == null) 
		{
            return output;
        }
        
        output.addAll(inorderTraversal(root.left));
        output.add(root.val);
        output.addAll(inorderTraversal(root.right));
        
        return output;
    }
}