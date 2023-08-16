//짝수의 합 

public class addSum{

    public static void main(String[] args){
          int answer = solution(8);
          //20 출력 
          System.out.println(answer);
    }

    static int solution(int n){
           int sum = 0;
           for(int number=2;number<=n;number+=2){
               sum+=number;
           }
           return sum;
    }

}
