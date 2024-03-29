

public class Swap {
    public static void main(String[] args) {
        int a = 6;
        int b = 10;

        System.out.println("The Number before Swapping is : ");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("The Number after Swapping is : ");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
