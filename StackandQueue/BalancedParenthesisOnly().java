import java.util.*;
public class Solution {
    public static boolean isBalanced(String exp) {
        //Your code goes here
        Stack<Character> stk=new Stack<Character>();
        int count=0;
        char c;
        while(count<exp.length()){
           c=exp.charAt(count);
            if(c==')'){
               if(stk.isEmpty()||stk.peek()!='('){
                   return false;
               }else{
                   stk.pop();
               }
            }else{
                stk.push(c);
            }
           count++;
        }
        if(stk.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}