public class Solution {

	/*	TreeNode structure 
	 * 
	 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static void printPostOrder(TreeNode<Integer> root){
       if(root==null){
           return;
       }
       for(TreeNode<Integer> node:root.children){
           printPostOrder(node);
       }
        System.out.print(root.data+" ");
	}
}