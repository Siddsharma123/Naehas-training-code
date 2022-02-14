public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null||head.next==null){
            return head;
        }
        LinkedListNode<Integer> temp=removeDuplicates(head.next);
        if(head.data==temp.data){ 
          return temp;
        }else{
            head.next=temp;
            return head;
        }
	}

}