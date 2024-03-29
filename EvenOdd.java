
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();
        sc.close();
        if (a==0){
            System.out.println("The Number is Zero");
        }
        else if(a%2 == 0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
    }
}
