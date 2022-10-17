class PositiveNegative {

    public int solution(int[] absolutes,boolean[] signs){
        
        int answer = 0;
        int integerNum = absolutes.length;

        for(int i=0;i<integerNum;++i){
            if(signs[i]==true){
                answer+=absolutes[i];
            }

            else if(signs[i]==false){
                answer-=absolutes[i];
            }
        }
        
        return answer;

    }

}

class run{

    public static void main(String[] args){
        PositiveNegative s = new PositiveNegative();
        int[] integers = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(s.solution(integers,signs));
    }

}
