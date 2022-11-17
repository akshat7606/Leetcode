import java.util.Scanner;

public class palindromePermutation {
    public boolean sol(String str){
        int[] charcount = new int[128];
        for(char ch : str.toCharArray()){
            charcount[ch-'a']++;
        }
        int count = 0 ;
        for(int i=0 ; i<charcount.length ; i++){
            count += charcount[i]%2;
        }

        return count<=1;

    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String str = sc.next();
            palindromePermutation pp = new palindromePermutation();
            System.out.print(pp.sol(str));
        }
    }
}
