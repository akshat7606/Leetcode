import java.util.HashSet;
import java.util.Scanner;

public class checkPermutation {
    public boolean sol(String str1, String str2){
        HashSet<Character> set = new HashSet<>();
        for(char ch : str1.toCharArray()){
            set.add(ch);
        }
        for(char ch : str2.toCharArray()){
            if(!set.contains(ch)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String str1 = sc.next();
            String str2 = sc.next();
            checkPermutation obj = new checkPermutation();
            System.out.println(obj.sol(str1,str2));
        }
    }
}
