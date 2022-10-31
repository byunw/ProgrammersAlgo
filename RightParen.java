import java.util.Stack;

class Solution{
    
    boolean solution(String s){

        boolean answer = true;
        Stack<Character> parenStack = new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                parenStack.push('(');
            }

            if(s.charAt(i)==')'){

                if(parenStack.empty()){
                    answer = false;
                    break;
                }

                if(!parenStack.empty()){
                    parenStack.pop();
                }

            }

        }

        if(!parenStack.empty()){
            answer = false;
        }

        return answer;

    }

}

public class RightParen{

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution("(("));
    }
    
}
