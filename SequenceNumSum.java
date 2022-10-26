class SequenceNumSum{
    public int[] solution(int num, int total) {

        int baseSequenceSum=(num*(num+1))/2;
        int defaultNum=1;

        while(baseSequenceSum!=total){
            if(baseSequenceSum<total){
                baseSequenceSum+=num;
                ++defaultNum;    
            }
            if(baseSequenceSum>total){
                baseSequenceSum-=num;
                --defaultNum; 
            }
        }
        
        int[] answer=new int[num];
        int index=0;
        for(int i=defaultNum;i<defaultNum+num;++i){
            answer[index]=i;
            ++index;
        }
        
        return answer;
    }
}
