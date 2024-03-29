public class Distance {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);
        Double res = Math.sqrt(Math.pow(x, x1) + Math.pow(y, y1));
        System.out.println(res);
    }
}
