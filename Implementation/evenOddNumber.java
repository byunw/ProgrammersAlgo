public class EvenOddNumber {
    public static void main(String[] args){
        int numberArray[] = {1,3,2};
        int evenOddArray[] = Solution.solution(numberArray);
        System.out.println(evenOddArray[0]);
        System.out.println(evenOddArray[1]);
    }
}

class Solution{
    public static int[] solution(int[] num_list){

        int [] answer = new int[2];
        int evenCount = 0;
        int oddCount = 0;

        for(int i=0;i<num_list.length;++i){
            if(num_list[i]%2==1){
                ++oddCount;
            }
            else{
                ++evenCount;
            }
        }

        answer[0] = evenCount;
        answer[1] = oddCount;

        return answer;

    }
}
