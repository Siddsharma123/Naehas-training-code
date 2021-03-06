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
	
	public static int countLeafNodes(TreeNode<Integer> root){
      if(root==null){
          return 0;
      }
      if(root.children.size()==0){
          return 1;
      }else{
          int count=0;
          for(TreeNode<Integer> node:root.children){
              count+=countLeafNodes(node);
          }
          return count;
      }
        
      
	}
	
}