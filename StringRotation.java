import java.util.Scanner;

public class StringRotation{
       public static void main(String[] args){
         
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         char c;
   
         for(int i=0;i<input.length();++i){
            c = input.charAt(i);
            System.out.println(c);
         }
         
       }
}

