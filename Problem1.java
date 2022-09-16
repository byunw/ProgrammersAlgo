class Solution{
    
    public int solution(int n){
        
        int answer=0;

        for(int i=2;i<=(n-1);++i){
            if(n%i==1){
                answer=i;
                break;
            }
        }

        return answer;
        
    }

}

public class Problem1{
    
    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution(12));
    }

}

