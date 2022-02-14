class Solution {
public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
       if(head==null||N==0){
           return head;
       }
       if(M==0){
           if(N>0){
               return null;
           }else{
               return head;
           }
       }
    int count=M;
     LinkedListNode<Integer> temp=head;
     LinkedListNode<Integer> pre=null;
     while(temp!=null){
         if(M==0){
             pre.next=DeleteN(temp,N);
             temp=pre.next;
             M=count;
         }else{
             pre=temp;
             temp=temp.next;
             M--;
         }
     }
     return head;
    
}
public static LinkedListNode<Integer> DeleteN(LinkedListNode<Integer> head,int N){
        if(head==null){
            return null;
        }
        if(N==0){
            return head;
        }
        return DeleteN(head.next,N-1);
}
}
