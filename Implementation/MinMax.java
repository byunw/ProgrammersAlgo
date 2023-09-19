//프로그래머스 최댓값/최솟값 문제(레벨 2)

import java.util.Arrays;

public class MinMax{

       public static void main(String[] args){
              String s = "2 3 5";
              String answer = solution(s);
              System.out.print(answer);//2 5 출력
       }

       public static String solution(String s){
              String answer = "";
              String[] splitStr = s.split("\\s+");
              int numberCount = splitStr.length;
              int numberArray[] = new int[numberCount];
              for(int i=0;i<numberCount;++i){
                  numberArray[i] = Integer.parseInt(splitStr[i]);
              }
              Arrays.sort(numberArray);
              answer+=Integer.toString(numberArray[0]);
              answer+=" ";
              answer+=Integer.toString(numberArray[numberCount-1]);
              return answer;
        }

}
        
