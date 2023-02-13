public class ArrayElementLength{
        
    public static void main(String[] args){
           Solution s = new Solution();
           String[] words = new String[2];
           words[0] = "alex";
           words[1] = "byun1";
           int[] arrayElementLength = s.solution(words);
           int four = arrayElementLength[0];
           int five = arrayElementLength[1];
    }
      
}

class Solution{
   
  public int[] solution(String[] strlist){
         int[] answer = new int[strlist.length];
         for(int i=0;i<strlist.length;++i){
            answer[i] = strlist[i].length();
         }
         return answer;
  }

}  
