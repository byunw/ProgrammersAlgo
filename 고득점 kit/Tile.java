public class Tile{
  public static void main(String[] args){
         TileSolution ts = new TileSolution();
         int answer[] = ts.solution(10,2);
         System.out.println(answer[0]);//4
         System.out.println(answer[1]);//3
  }        
}

class TileSolution{
      public int[] solution(int brown,int yellow){
             int width = 1;
             int height = 1;
             int totalTileNumber = yellow + brown;
             int[] answer = new int[2];

             while(true){
                  if((width*height==totalTileNumber) && ((width-2) * (height-2) == yellow)){
                     break;
                  }
            
                  if(width==height){
                    ++width;
                    height = 1;
                    continue;
                  }

                  ++height;
             }
          
             answer[0] = width;
             answer[1] = height;
             return answer; 
      }
}
