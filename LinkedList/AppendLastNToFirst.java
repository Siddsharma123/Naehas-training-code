public class Solution {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		if(head==null||head.next==null){
            return head;
        }
        int length=findlengthofLL(head);
        if(n==0||n>=length){
            return head;
        }
        int count=1;
        LinkedListNode<Integer> temp=head;
        LinkedListNode<Integer> newHead=null;
        while(temp.next!=null){
            if(count==length-n){
                newHead=temp.next;
                temp.next=null;
                temp=newHead;
            }else{
            temp=temp.next;
            }
            count++;
        }
        temp.next=head;
        return newHead;
	}
   public static int findlengthofLL(LinkedListNode<Integer> head){
       if(head==null){
           return 0;
       }
       int count=0;
       LinkedListNode<Integer> temp=head;
       while(temp!=null){
           count++;
           temp=temp.next;
       }
       return count;
   }
}