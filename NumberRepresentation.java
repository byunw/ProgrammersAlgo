package ProgrammersAlgo;

class Solution {
      public int solution(int n){
             
             int answer = 0;
             
             for(int i=1;i<=n;++i){
                
                if(i==n){
                   answer+=1;
                   break;
                }
  
                int sequenceSum = i;
               
                for(int y=(i+1);y<=(n-1);++y){
                   
                   if(sequenceSum<n){
                      sequenceSum+=y;
                      if(sequenceSum==n){
                         answer+=1;
                         break;
                      }
                      if(sequenceSum>n){
                         break;
                      }
                   }
                }
               
            }
            return answer;
    }
}

public class NumberRepresentation{

       public static void main(String[] args){
           Solution a = new Solution();
           System.out.println(a.solution(15));
       }
       
}
