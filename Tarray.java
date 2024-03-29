import java.util.Scanner;
public class Tarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows in Column : ");
        int m = sc.nextInt();
        System.out.print("Enter the Number of Columns : ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<arr[0].length;i++){
            for(int j=0; j<arr.length;j++){
                System.out.print("Enter the Number to be added in array : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("The Array Element is : ");
        for(int i = 0; i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+ " ");
            }
        }
        sc.close();
    }
}
