

import java.util.Scanner;
public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        sc.close();
        int i=1;
        float sum = 0;
        while(i<=x){
            sum += 1.0/i;
            i++;
        }
        System.out.println("The Sum of Harmonic Value is " +sum);
}
}