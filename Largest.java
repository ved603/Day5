

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();
        sc.close();

        if(a>b){
            if(b < c){
                if (c>a){
                    System.out.println("C is the Largest with value " +c);
                }
                else{
                    System.out.println("A is the Largest with Value " +a);
                }
            }
            else if(c>a){
                System.out.println("C is the Largest with value " +c);
            }
            else{
                System.out.println("A is the Largest with Value " +a);
            }
        }
        else{
            if(b<c){
                System.out.println("C is the Largest with value " +c); 
            }
            else{
                System.out.println("B is the Largest with value " +b);
            }
        }
    }
}

