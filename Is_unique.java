import java.util.HashSet;
import java.util.Scanner;

public class Is_unique {
    public boolean sol(String str){
        HashSet<Character> set = new HashSet<>();
        for(char ch : str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
        String str = sc.next();
        Is_unique obj = new Is_unique();
        System.out.println(obj.sol(str));
        }
    }
}
