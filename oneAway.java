import java.util.HashSet;
import java.util.Scanner;

public class oneAway {
    public boolean solution(String str1 , String str2){
        int count = 0, n = str1.length() , m=str2.length() ;
        HashSet<Character> set = new HashSet<>();
        if(n>m){
            for(char ch : str1.toCharArray()){
                set.add(ch);
            }
            for(char ch : str2.toCharArray()){
                if(!set.contains(ch)){
                    count++;
                }
            }
        }else{
            for(char ch : str2.toCharArray()){
                set.add(ch);
            }
            for(char ch : str1.toCharArray()){
                if(!set.contains(ch)){
                    count++;
                }
            }
        }
        
        if(count>1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String str1 = sc.next();
            String str2 = sc.next();
            oneAway oa = new oneAway();
            System.out.print(oa.solution(str1,str2));
        }
    }
}
