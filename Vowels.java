
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character : " );
        char ch = sc.next().charAt(0);
        sc.close();
        if(ch=='a' || ch=='e' || ch == 'i' || ch == 'o' || ch=='u'){
            System.out.println("The Character is Vowels");
        }
        else{
            System.out.println("The Character is Consonant");
        }
    }
}
