class Solution{

    public int solution(int[] common){

        int arrayLength = common.length;
        int difference = common[1]-common[0];

        for(int i=1;i<(arrayLength-1);++i){
            int currentDifference = common[i+1]-common[i];

            //등비수열
            if(difference!=currentDifference){
                int multiply = common[1]/common[0];
                return(common[arrayLength-1]*multiply);
            }
                
        }

        //등차수열 
        return(common[arrayLength-1]+difference);

    }

}

public class NextNumber{
    public static void main(String[] args){
        int[] arithSequence = {1,3,5};
        Solution n = new Solution();
        System.out.println(n.solution(arithSequence));
    }
}
