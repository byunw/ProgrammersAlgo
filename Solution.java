class Solution{
      
      public long solution(int price, int money, int count){
              
             long totalPrice = 0;
             long sumCount = (count*(count+1))/2;
             totalPrice = price * sumCount;
             
             if(money>=totalPrice){
                return 0;
             }
             
             return totalPrice-money;
    
      }

}

class run{
      
      public static void main(String[] args){
             Solution s1 = new Solution();
             System.out.println(s1.solution(1,2,1));
      }

}
