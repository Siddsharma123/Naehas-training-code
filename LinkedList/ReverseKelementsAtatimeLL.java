public class Solution {

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		//Your code goes here
    if(head==null){
        return head;
    }
    LinkedListNode<Integer> temp=head;
    LinkedListNode<Integer> next=null;
        int count=1;
    while(temp.next!=null&&count<k){
        temp=temp.next;
        count++;
    }
        LinkedListNode<Integer> xyz=null;
        if(temp.next!=null){
            xyz=kReverse(temp.next,k);
            temp.next=null;
            while(head!=null){
                next=head.next;
                head.next=xyz;
                xyz=head;
                head=next;
            }
        }else{
             while(head!=null){
                next=head.next;
                head.next=xyz;
                xyz=head;
                head=next;
            }
        }
        return temp;
	}
}