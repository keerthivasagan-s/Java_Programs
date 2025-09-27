import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> list=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                list.push(c);
            }
            else{
                if(list.isEmpty()) return false;
                char che=list.pop();
                if(che=='{') che='}';
                else if(che=='[') che=']';
                else che=')';
                if(che!=c) return false;
            }
        }
        if(!list.isEmpty()) {System.out.println("end");return false;}
        return true;
    }
}