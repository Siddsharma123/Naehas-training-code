public class Solution {
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        if(head==null||head.next==null){
            return head;
        }
          GroupNode temp=sortEOR(head);
          if(temp.oddH==null){
              return temp.evenH;
          }
          if(temp.evenH==null){
              return temp.oddH;
          }
           temp.oddT.next=temp.evenH;
           return temp.oddH;
    }
    public static GroupNode sortEOR(LinkedListNode<Integer> head){
        if(head==null){
            return new GroupNode(null,null,null,null);
        }
        GroupNode grp=sortEOR(head.next);
        if(head.data%2==0){
           if(grp.evenH!=null){
           head.next=grp.evenH;
              return new GroupNode(grp.oddH,grp.oddT,head,grp.evenT);
           }else{
               return new GroupNode(grp.oddH,grp.oddT,head,head);
           }
        }else{
           if(grp.oddH!=null){
              head.next=grp.oddH;
              return new GroupNode(head,grp.oddT,grp.evenH,grp.evenT);
           }else{
               return new GroupNode(head,head,grp.evenH,grp.evenT);
           }
        }
    }
}
class GroupNode{
    LinkedListNode<Integer> oddH=null;
    LinkedListNode<Integer> oddT=null;
    LinkedListNode<Integer> evenH=null;
    LinkedListNode<Integer> evenT=null;
    GroupNode(LinkedListNode<Integer> oddH,LinkedListNode<Integer> oddT,LinkedListNode<Integer> evenH,LinkedListNode<Integer> evenT){
        this.oddH=oddH;
        this.evenH=evenH;
        this.oddT=oddT;
        this.evenT=evenT;
    }
}