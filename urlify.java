import java.util.Scanner;

//#53 - It's often easiest to modify strings by going from the end of the string to the beginning
//approach - just take the truelength of the string and traverse on string using truelength and when you find the space just add %20 into stringbuilder.
//TC - O(n);
//SC - O(1);
public class urlify {
    public String sol(String str,int truelength){
        StringBuilder sb = new StringBuilder();
        for(int i=0 ;i<truelength; i++){
            if(str.charAt(i)==' '){
                sb.append("%20");
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String str = sc.nextLine();
            urlify obj = new urlify();
            System.out.print(obj.sol(str, str.trim().length()));
        }
    }
}
