
public class Queue {
    Node head;
    Node tail;
    int size;
	public Queue() {
        head=null;
        tail=null;
        size=0;
	}

	public int getSize() { 
        return size;
    }


    public boolean isEmpty() { 
        if(size==0){
            return true;
        }else{
            return false;
        }
    }


    public void enqueue(int data) {
        Node newEle=new Node(data);
        if(head==null){
            head=newEle;
            tail=newEle;
        }else{
            tail.next=newEle;
            tail=newEle;
        }
        size++;
    }


    public int dequeue() {
        if(size==0){
            return -1;
        }
        int ele=head.data;
        if(size==1){
            head=null;
            tail=null;
        }else{
        head=head.next;
        }
        size--;
        return ele;
    }


    public int front() {
        if(size==0){
            return -1;
        }
        return head.data;
    }
}