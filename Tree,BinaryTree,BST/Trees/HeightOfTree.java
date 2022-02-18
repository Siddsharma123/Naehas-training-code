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

	public static int getHeight(TreeNode<Integer> root){
         if(root==null){
             return 0;
         }
         int max=0,temp;
         for(TreeNode<Integer> node:root.children){
              temp=getHeight(node);
              if(max<temp){
                  max=temp;
              }
         }
         return max+1;
	}

}