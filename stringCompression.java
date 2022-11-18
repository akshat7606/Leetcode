import java.util.Scanner;
//approach - check where the character is getting changes till there take the count of the first character and then add both character and count in the stringbuilder and reset the count=0;
//TC - O(N);
//SC - O(1);
public class stringCompression {
    public String sol(String str){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=0 ;i<str.length() ; i++){
            count++;
            if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1)){
                sb.append(str.charAt(i));
                sb.append(count);
                count = 0;
            }
        }    
        return sb.toString();
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String str = sc.next();
            stringCompression obj = new stringCompression();
            System.out.print(obj.sol(str));
        }
    }
}
