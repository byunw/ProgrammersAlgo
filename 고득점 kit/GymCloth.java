public class GymCloth{
       public static void main(String[] args){
          int n = 3;
          int[] lost = {1,2};
          int[] reserve = {1,2,3};
          GymClothSolution gcs = new GymClothSolution();
          System.out.println(gcs.solution(n,lost,reserve)); 
       }
}

class GymClothSolution{
      public int solution(int n,int[] lost,int[] reserve){
             int maximumStudentNum = 0;
             int studentClothNumber[] = new int[n];

             //학생 옷 수 만들어주는 loop 3개 
             for(int i=0;i<n;++i){
                 studentClothNumber[i] = 1;
             }
             for(int i=0;i<reserve.length;++i){
                 studentClothNumber[reserve[i]-1] = 2;
             }
             for(int i=0;i<lost.length;++i){
                studentClothNumber[lost[i]-1]-=1;
             }

             for(int i=0;i<n;++i){
                //현재 학생 옷 두벌 경우
                if(studentClothNumber[i]==2){

                   //첫번째 학생인 경우
                   if(i==0){
                     //2번째 학생이 옷이 없는 경우 첫번째 학생이 두번째 학생한테 옷 1개주기
                     studentClothNumber[0]-=1;
                     studentClothNumber[1]=1;
                   }
                   
                   //마지막 학생인 경우 
                   else if(i==n-1){
                        //마지막 전 학생이 옷이 없는 경우  
                        if(studentClothNumber[n-2]==0){
                           studentClothNumber[n-1]-=1;
                           studentClothNumber[n-2]+=1;
                        }
                   }  
            
                   else{
                        if(studentClothNumber[i-1]==0){
                           studentClothNumber[i]-=1;
                           studentClothNumber[i-1]+=1;
                        }
                        else if(studentClothNumber[i+1]==0){
                             studentClothNumber[i]-=1;
                             studentClothNumber[i+1]+=1;
                        }     
                    }
                }
             }           

             //옷 1개 이상 가지고 있는 학생 카운트 
             for(int i=0;i<n;++i){
                 if(StudentClothNumber[i]>=1){
                    ++maximumStudentNum;
                 }
              } 
      
              return maximumStudentNum;         
      }
}
