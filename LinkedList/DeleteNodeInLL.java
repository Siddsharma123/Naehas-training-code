
public class Solution {
    
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		// Write your code here.
        if(head==null){
            return null;
        }
        if(pos==0){
            return head.next;
        }
        LinkedListNode<Integer> next=head.next;
        LinkedListNode<Integer> prev=head;
        int count=1;
        while(count<pos){
            if(next==null){
                return head;
            }
            prev=next;
            next=next.next;
            count++;
        }
        if(next==null){
         return head;
        }
        prev.next=next.next;
        return head;
	}
}