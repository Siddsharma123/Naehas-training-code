public class Solution {
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
		if(head.next==null||head==null){
            return head;
        }
        LinkedListNode<Integer> temp2=head.next;
        LinkedListNode<Integer> temp=reverse_R(head.next);
        head.next=null;
        temp2.next=head;
        return temp;
	}
}