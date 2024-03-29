

public class Poweroftwo{
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int i = 0;
        int pow = 1;
        while(i<=N && N<31){
            System.out.println(pow);
            pow = 2*pow;
            i = i+1;
        }
    }
}
