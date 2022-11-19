import java.util.Scanner;
//approach - 
//-check for edge case like length and all for the strings;
//-make a string(s1+s1) and then check if str2 is the substring of that string or not;
//TC - O(N);
//SC - O(1);
public class stringRotation {
    public boolean sol(String str1 , String str2){
        if(str1.length()==0 || str2.length()==0 || str1.length()!=str2.length()){
            return false;
        }
        String text = str1+str1;
        boolean flag = text.indexOf(str2)!=-1?true:false;
        return flag;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String str1 = sc.next();
            String str2 = sc.next();
            stringRotation sr = new stringRotation();
            System.out.print(sr.sol(str1,str2));
        }
    }
}
