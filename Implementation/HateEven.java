public class HateEven{
      
       public static void main(String[] args){
          
              Solution s;
              s = new Solution();
              int[] answer = s.solution(4);
              System.out.println(answer[0]);
              System.out.println(answer[1]);
              
       }
  
}

class Solution{

      public int[] solution(int n){
            
             int arrayIndex = 0;
             int[] oddNumberSequence;
             int arrayLength;
        
             if(n%2==0){
               arrayLength = (n/2);
               oddNumberSequence = new int[arrayLength];
               for(int i=1;i<=(n-1);i+=2){
                   oddNumberSequence[arrayIndex] = i;
                   arrayIndex++;
               }
             }
               
             else{
                  arrayLength = (n/2)+1;
                  oddNumberSequence = new int[arrayLength];
                  for(int i=1;i<=n;i+=2){
                      oddNumberSequence[arrayIndex] = i;
                      arrayIndex++;
                  }
             }

             return oddNumberSequence;
              
       }
       
}
