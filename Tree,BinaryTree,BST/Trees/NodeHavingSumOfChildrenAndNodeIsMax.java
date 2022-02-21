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
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        if(root==null){
            return null;
        }
        NodeWithMax result=support(root);
        return result.node;

	}
    public static NodeWithMax support(TreeNode<Integer> root){
        if(root.children.size()==0){
            return new NodeWithMax(root,root.data);
        }
        int current=root.data;
        TreeNode<Integer> node=null;
        int sumofCN=-1;
        NodeWithMax temp;
        for(TreeNode<Integer> x:root.children){
            current+=x.data;
            temp=support(x);
            if(sumofCN!=-1){
                if(temp.sumofCN>sumofCN){
                    node=temp.node;
                    sumofCN=temp.sumofCN;
                }
            }else{
                sumofCN=temp.sumofCN;
                node=temp.node;
            }
            
        }
        if(current>sumofCN){
            sumofCN=current;
            node=root;
        }
        return new NodeWithMax(node,sumofCN);
    }	
}
class NodeWithMax{
    TreeNode<Integer> node;
    int sumofCN;
    NodeWithMax(TreeNode<Integer> node,int sumofCN){
        this.node=node;
        this.sumofCN=sumofCN;
    }
}