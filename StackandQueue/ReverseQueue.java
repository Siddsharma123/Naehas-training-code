import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        if(input.size()<=1){
            return;
        }
        int first=input.remove();
        reverseQueue(input);
        input.add(first);
	}

}