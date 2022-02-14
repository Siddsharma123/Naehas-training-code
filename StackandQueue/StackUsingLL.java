public class Stack {
    int size;
    Node top;
    public Stack() {
        top=null;
        size=0;
    }
    public int getSize() { 
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        if(size==0){
            return true;
        }
        return false;
        
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode=new Node(element);
        if(top==null){
            top=newNode;
        }else{
            newNode.next=top;
            top=newNode;
        }
        size++;
    }
    
    public int pop() {
        //Implement the pop() function
        if(size==0){
            return -1;
        }
        size--;
        int popEle=top.data;
        top=top.next;
        return popEle;
    }

    public int top() {
        //Implement the top() function
        if(size==0){
            return -1;
        }
        return top.data;
    }
}