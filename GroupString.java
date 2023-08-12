public class GroupString{
    public static void main(String[] args){

        String[] input = {"aaaaa","caaaa","aaaaa","aa","bb","bb","dd","ee"};
        int[] stringGroupCount = new int[30];

        //그룹별로 몇개 있는지 카운트
        for(int i=0;i<input.length;++i){
            int stringLength = input[i].length();
            for(int index=1;index<=30;++index){
                if(index==stringLength){
                    stringGroupCount[index-1]+=1;
                }
            }
        }

        //각 그룹 사이즈에서 가장 큰거 찾기
        int maxGroupSize = stringGroupCount[0];
        for(int i=1;i<30;++i){
            if(stringGroupCount[i]>=maxGroupSize){
                maxGroupSize = stringGroupCount[i];
            }
        }

        //그룹 사이즈중에서 제일 큰놈 출력
        System.out.print(maxGroupSize);

    }
}

      
