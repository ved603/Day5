import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the Value of X2 : ");
        int b = sc.nextInt();
        System.out.println("Enter the Value of X3 : ");
        int c = sc.nextInt();
        sc.close();

        int delta = b*b - 4*a*c;
        System.out.println(delta);

        Double r1 = (-b + Math.sqrt(delta)/2*a);
        Double r2 = (-b - Math.sqrt(delta)/2*a);

        System.out.println("The Given Quadratic Equation is : ");
        System.out.println(a+"x*x"+" + "+ b+"x" + " + "+c+ " = 0");

        System.out.println();
        System.out.println("The First Root of the Equation is : "+ String.format("%.2f", r1));
        System.out.println("The Second Root of the Equation is : "+ String.format("%.2f", r2));
    }
}
