import java.util.*;
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
    
public static void printLevelWise(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<TreeNode<Integer>> q=new LinkedList<TreeNode<Integer>>();
        TreeNode<Integer> temp;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            temp=q.remove();
            if(temp==null){
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }else{
                System.out.print(temp.data+" ");
                for(TreeNode<Integer> x:temp.children){
                    q.add(x);
                }
            }
        }
	}
		
}