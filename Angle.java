public class Angle {
    public int solution(int angle) {
        
        if(angle>0 && angle<90){
           angle = 1;
        }
        
        if(angle==90){
           angle = 2;     
        }
        
        if(angle>90 && angle<180){
           angle = 3;
        }
        
        if(angle==180){
           angle =  4;
        }
        
        return angle;
        
    }

}
