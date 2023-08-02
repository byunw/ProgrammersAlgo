import java.util.Arrays;

public class MinimumRectangle{
       public static void main(String[] args){
          int sizes[][] = {{10,7},{12,3},{8,15},{14,7},{5,15}};
          MinimumRectangleSolution mrs = new MinimumRectangleSolution();
          int walletSize = mrs.solution(sizes);
          System.out.println(walletSize);
       }
}

class MinimumRectangleSolution{
      public int solution(int[][] sizes){
             int allNameCardsWidth[] = new int[sizes.length];
             int allNameCardsHeight[] = new int[sizes.length];
              
             for(int i=0;i<sizes.length;++i){
                 allNameCardsWidth[i] = Math.max(sizes[i][0],sizes[i][1]);
                 allNameCardsHeight[i] = Math.min(sizes[i][0],sizes[i][1]);
             }
             
             Arrays.sort(allNameCardsWidth);
             Arrays.sort(allNameCardsHeight);
             int walletWidth = allNameCardsWidth[sizes.length-1];
             int walletHeight = allNameCardsHeight[sizes.length-1];
             return walletWidth*walletHeight;
      }
}

