public class Solution {
public static int numNodeGreater(TreeNode<Integer> root,int x){
     if(root==null){
         return 0;
     }
      int num=(root.data>x) ? 1 : 0 ;
		// Write your code here		
      for(TreeNode<Integer> node:root.children){
          num+=numNodeGreater(node,x);
      }
       return num;

	}
}