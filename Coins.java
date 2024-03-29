
import java.util.ArrayList;
import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        ArrayList<Double> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of times flip coins : ");
        int x = sc.nextInt();
        sc.close();
        for(int i = 0; i<x; i++){
            Double b = (Double) Math.random();
            a.add(b);
        }

        Double head = 0.0;
        Double tails = 0.0;

        for(Double j : a){
            if (j < 0.5){
                tails++;
            }
            else{
                head++;
            }
        }
        Double h = (head/x)*100;
        Double t = (tails/x)*100;
        System.out.println("The Count of Head is :" +h+"%");
        System.out.println("The Count of Tails is : " +t+"%");
    }
}
