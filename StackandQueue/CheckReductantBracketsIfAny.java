import java.util.*;
public class Solution {

	public static boolean checkRedundantBrackets(String exp) {
		// Q.. A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.
        Stack<Character> stk=new Stack<Character>();
        int cnt=0;
        int ind=0;
        char c;
        while(ind<exp.length()){
            cnt=0;
            c=exp.charAt(ind);
            if(c==')'){
                while(stk.peek()!='('){
                    stk.pop();
                    cnt++;
                }
                if(cnt<=1){
                    return true;
                }
                stk.pop();
            }else{
                stk.push(c);
            }
            ind++;
        }
        return false;
	}
}